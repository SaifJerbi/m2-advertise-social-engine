package com.m2advertise.social.engine.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.m2advertise.social.engine")
public class FeignConfiguration {

}
