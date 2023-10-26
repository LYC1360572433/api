package com.api.apibackend.controller;

import com.api.apibackend.service.DailyCheckInService;
import com.api.apibackend.service.UserService;
import com.api.apicommon.model.vo.UserVO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.api.apicommon.common.BaseResponse;
import com.api.apicommon.common.ErrorCode;
import com.api.apicommon.common.ResultUtils;
import com.api.apibackend.exception.BusinessException;
import com.api.apibackend.model.entity.DailyCheckIn;
import com.api.apibackend.utils.RedissonLockUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 签到接口
 */
@RestController
@RequestMapping("/dailyCheckIn")
@Slf4j
public class DailyCheckInController {

    @Resource
    private DailyCheckInService dailyCheckInService;
    @Resource
    private UserService userService;
    @Resource
    private RedissonLockUtil redissonLockUtil;

    // region 增删改查

    /**
     * 签到
     *
     * @param request 请求
     * @return {@link BaseResponse}<{@link Boolean}>
     */
    @PostMapping("/doCheckIn")
    @Transactional(rollbackFor = Exception.class)
    public BaseResponse<Boolean> doDailyCheckIn(HttpServletRequest request) {
        UserVO loginUser = userService.getLoginUser(request);
        String redissonLock = ("doDailyCheckIn_" + loginUser.getUserAccount()).intern();
        return redissonLockUtil.redissonDistributedLocks(redissonLock, () -> {
            LambdaQueryWrapper<DailyCheckIn> dailyCheckInLambdaQueryWrapper = new LambdaQueryWrapper<>();
            dailyCheckInLambdaQueryWrapper.eq(DailyCheckIn::getUserId, loginUser.getId());
            DailyCheckIn dailyCheckIn = dailyCheckInService.getOne(dailyCheckInLambdaQueryWrapper);
            if (ObjectUtils.isNotEmpty(dailyCheckIn)) {
                throw new BusinessException(ErrorCode.OPERATION_ERROR, "签到失败,今日已签到");
            }
            dailyCheckIn = new DailyCheckIn();
            dailyCheckIn.setUserId(loginUser.getId());
            dailyCheckIn.setAddPoints(10);
            boolean dailyCheckInResult = dailyCheckInService.save(dailyCheckIn);
            boolean addWalletBalance = userService.addWalletBalance(loginUser.getId(), dailyCheckIn.getAddPoints());
            boolean result = dailyCheckInResult & addWalletBalance;
            if (!result) {
                throw new BusinessException(ErrorCode.OPERATION_ERROR);
            }
            return ResultUtils.success(true);
        }, "签到失败");
    }
    // endregion
}
