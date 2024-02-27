package org.thisdote.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.thisdote.communityfordevelopers", annotationClass = Mapper.class)
public class MybatisConfiguration {
}