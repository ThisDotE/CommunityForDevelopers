package org.thisdote.communityfordevelopers.user.command.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.user.dto.UserDTO;
import org.thisdote.communityfordevelopers.user.query.UserService;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class UserCommandServiceTests {

    private UserCommandService userCommandService;
    private UserService userService;

    @Autowired
    public UserCommandServiceTests(UserCommandService userCommandService, UserService userService) {
        this.userCommandService = userCommandService;
        this.userService = userService;
    }

    public static Stream<Arguments> getUserDTO() {
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

        return Stream.of(Arguments.of(userDTO));
    }
    @DisplayName("회원 등록 테스트")
    @ParameterizedTest
    @MethodSource("getUserDTO")
    void testRegistUser(UserDTO newUser) {
        userCommandService.registUser(newUser);

        List<UserDTO> userList = userService.selectAllUser();

        Assertions.assertEquals(
                userList.get(userList.size() - 1).getUserId(),
                newUser.getUserId());

        Assertions.assertEquals(
                userList.get(userList.size() - 1).getUserEmail(),
                newUser.getUserEmail());
    }

    @DisplayName("회원 수정 테스트")
    @ParameterizedTest
    @MethodSource("getUserDTO")
    void testModifyUser(UserDTO modifyUser) {
        int userCode = 20;

        modifyUser.setUserCode(userCode);

        userCommandService.modifyUser(modifyUser);

        List<UserDTO> user = userService.selectUserCode(userCode);

    }

    @DisplayName("회원 삭제 테스트")
    @ParameterizedTest
    @ValueSource(ints = 20)
    void testDeleteUser(int userCode) {
        userCommandService.deleteUser(userCode);
    }
}