package org.thisdote.communityfordevelopers.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.reported_article.ReportedArticleDTO;

import java.util.List;


@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @DisplayName("User Test")
    @Test
    void testFindAllUsers() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<UserDTO> menus = userService.selectAllUser();
                    menus.forEach(System.out::println);
                }
        );
    }
}
