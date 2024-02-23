package org.thisdote.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.thisdote", annotationClass = Mapper.class)
public class MybatisConfiguration {

}
