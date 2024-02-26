package org.thisdote.communityfordevelopers.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @DisplayName("User Test")
    @Test
    void testFindAllUsers() {
        System.out.println("userService = " + userService);
    }
}
