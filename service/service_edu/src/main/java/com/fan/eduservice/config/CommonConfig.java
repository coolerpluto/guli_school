package com.fan.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(value = "com.fan.eduservice.mapper")
@Configuration
public class CommonConfig {
}
