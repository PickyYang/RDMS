package com.yang;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
public class RdmsApplication {

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        //定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //添加fastjson的配置信息，比如是否要格式化返回json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //在convert中添加配置信息
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

        return new HttpMessageConverters((HttpMessageConverter<?>) fastJsonHttpMessageConverter);
    }

    public static void main(String[] args) {
        SpringApplication.run(RdmsApplication.class, args);
    }
}
