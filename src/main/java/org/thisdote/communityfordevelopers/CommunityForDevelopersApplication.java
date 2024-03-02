package org.thisdote.communityfordevelopers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityForDevelopersApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityForDevelopersApplication.class, args);
        System.out.println("브랜치 파졌는지 확인");
    }

}
