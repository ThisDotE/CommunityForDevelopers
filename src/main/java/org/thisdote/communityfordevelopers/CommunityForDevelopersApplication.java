package org.thisdote.communityfordevelopers;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CommunityForDevelopersApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityForDevelopersApplication.class, args);
    }

    @Bean       // 객체 생성을 빈으로 관리할 수 있도록 지정
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
