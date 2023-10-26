package com.api.apibackend.config;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class RedisTemplateConfig {

    /**
     * 定义redisTemplate对象，用于访问redis,设置redis序列化方式
     * @param redisConnectionFactory redis的链接工厂，从Spring容器中获取
     * @return 自行配置好的redis访问对象
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        // 缓存操作对象
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        // 设置链接工厂
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        // 键的序列化器
        redisTemplate.setKeySerializer(RedisSerializer.string());
        // 值的序列化器，用自己配置的
//        redisTemplate.setValueSerializer(RedisSerializer.json());
        redisTemplate.setValueSerializer(new RedisJsonSerializerImpl<>());
        return redisTemplate;
    }

    // 这里才是设置session序列化的方法
    @Bean
    public RedisSerializer<Object> springSessionDefaultRedisSerializer() {
        // 因为我使用的是FastJson
        // 如果使用别的请自行设置，就是返回时返回序列化类即可
        return new FastJsonRedisSerializer(Object.class);
    }


}
