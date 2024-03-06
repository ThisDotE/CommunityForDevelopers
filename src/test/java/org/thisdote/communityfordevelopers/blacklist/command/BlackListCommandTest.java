package org.thisdote.communityfordevelopers.blacklist.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.blacklist.command.service.BlackListCommandService;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;
import org.thisdote.communityfordevelopers.blacklist.query.BlackListService;

import java.util.List;

@SpringBootTest

public class BlackListCommandTest {

    @Autowired
    private BlackListService blackListService;

    @Autowired
    private BlackListCommandService blackListCommandService;

    @DisplayName("insert blacklist test")
    @Test
    void testInsertBlackList() {

        BlackListDTO newBlackListedUser = new BlackListDTO();
        newBlackListedUser.setBlackListStatus(1);
        newBlackListedUser.setUserCode(7);
        newBlackListedUser.setBlackListCount(4);

        blackListCommandService.registBlackList(newBlackListedUser);

        List<BlackListDTO> blackList = blackListService.selectAllBlackList();

        Assertions.assertEquals(blackList.get(blackList.size() - 1).getBlackListStatus(), newBlackListedUser.getBlackListStatus());
        Assertions.assertEquals(blackList.get(blackList.size() - 1).getUserCode(), newBlackListedUser.getUserCode());
        Assertions.assertEquals(blackList.get(blackList.size() - 1).getBlackListCount(), newBlackListedUser.getBlackListCount());
    }
}
