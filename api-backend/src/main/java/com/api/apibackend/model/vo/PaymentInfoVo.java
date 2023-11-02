package com.api.apibackend.model.vo;

import com.github.binarywang.wxpay.bean.result.WxPayOrderQueryV3Result;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 付款信息VO
 */
@Data
@NoArgsConstructor
public class PaymentInfoVo {
    private static final long serialVersionUID = 1L;

    private String appid;

    private String mchid;

    private String outTradeNo;

    private String transactionId;

    /**
     * 贸易类型
     */
    private String tradeType;

    private String tradeState;

    private String tradeStateDesc;

    private String bankType;

    private String attach;

    private String successTime;

    private WxPayOrderQueryV3Result.Payer payer;
    @SerializedName(value = "amount")
    private Amount amount;
    @SerializedName(value = "scene_info")
    private WxPayOrderQueryV3Result.SceneInfo sceneInfo;
    @SerializedName(value = "promotion_detail")
    private List<WxPayOrderQueryV3Result.PromotionDetail> promotionDetails;

    public static class Amount implements Serializable {
        private static final long serialVersionUID = 1L;
        @SerializedName("total")
        private Double total;
        @SerializedName("payer_total")
        private Double payerTotal;
        @SerializedName("currency")
        private String currency;
        @SerializedName("payer_currency")
        private String payerCurrency;

        public Double getTotal() {
            return this.total;
        }

        public Double getPayerTotal() {
            return this.payerTotal;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getPayerCurrency() {
            return this.payerCurrency;
        }

        public void setTotal(Double total) {
            this.total = total;
        }

        public void setPayerTotal(Double payerTotal) {
            this.payerTotal = payerTotal;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setPayerCurrency(String payerCurrency) {
            this.payerCurrency = payerCurrency;
        }

        public String toString() {
            return "WxPayOrderQueryV3Result.Amount(total=" + this.getTotal() + ", payerTotal=" + this.getPayerTotal() + ", currency=" + this.getCurrency() + ", payerCurrency=" + this.getPayerCurrency() + ")";
        }

        public Amount() {
        }
    }
}
