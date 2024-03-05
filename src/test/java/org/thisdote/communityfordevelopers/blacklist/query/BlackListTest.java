package org.thisdote.communityfordevelopers.blacklist.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;

import java.util.List;

@SpringBootTest
public class BlackListTest {

    @Autowired
    private BlackListService blackListService;

    @DisplayName("BlackList Test")
    @Test
    void testFindBlackList() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<BlackListDTO> menus = blackListService.selectAllBlackList();
                    menus.forEach(System.out::println);
                }
        );
    }
}
