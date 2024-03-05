package org.thisdote.communityfordevelopers.user.command.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.user.dto.UserDTO;

import java.util.Date;

@SpringBootTest
class UserCommandServiceTests {

    @Autowired
    private UserCommandService userService;

    @Test
    void testRegistUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId("playdata99999");
        userDTO.setUserPassword("swcamp");
        userDTO.setUserBirthday(new Date());
        userDTO.setUserPhone("010-5252-5252");
        userDTO.setUserEmail("playdata99999@gmail.com");
        userDTO.setUserStudyGroupStatus(1);
        userDTO.setUserRegistDate(new Date());
        userDTO.setUserInfoUpdateDate(new Date());
        userDTO.setUserGrade(5);

        userService.registUser(userDTO);

//        Assertions.
    }

    @ParameterizedTest
    @ValueSource(ints = 23)
    void testDeleteUser(int userCode) {
        userService.deleteUser(userCode);
    }
}