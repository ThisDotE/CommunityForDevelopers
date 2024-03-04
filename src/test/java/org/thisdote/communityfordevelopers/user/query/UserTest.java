package org.thisdote.communityfordevelopers.user.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.user.query.UserDTO;
import org.thisdote.communityfordevelopers.user.query.UserService;

import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @DisplayName("User Test")
    @Test
    void testFindAllUser() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<UserDTO> users = userService.selectAllUser();
                    users.forEach(System.out::println);
                }
        );
    }

    @DisplayName("UserID로 회원 조회 Test")
    @ParameterizedTest
    @ValueSource(strings = "playdata1218")
    void testFindUserId(String userId) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<UserDTO> user = userService.selectUserId(userId);
                    user.forEach(System.out::println);
                }
        );
    }

    @DisplayName("UserCode로 회원 조회 Test")
    @ParameterizedTest
    @ValueSource(ints = 2)
    void testFindUserCode(int userCode) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<UserDTO> user = userService.selectUserCode(userCode);
                    user.forEach(System.out::println);
                }
        );
    }

    @DisplayName("회원번호로 한 명의 회원정보 조회(마이페이지 기능)")
    @ParameterizedTest
    @ValueSource(ints = 1)
    void testFindUserByUserCode(int userCode) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<UserDTO> users = userService.selectUserByUserCode(userCode);
                    users.forEach(System.out::println);
                }
        );
    }
}
