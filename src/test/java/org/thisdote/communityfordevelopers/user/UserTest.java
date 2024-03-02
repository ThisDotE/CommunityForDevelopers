package org.thisdote.communityfordevelopers.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
