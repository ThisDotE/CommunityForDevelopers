package org.thisdote.communityfordevelopers.blacklist.command;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.blacklist.command.service.BlackListCommandService;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;

@SpringBootTest
public class BlackListCommandTests {

    @Autowired
    private BlackListCommandService blackListCommandService;

    /* 설명. 블랙리스트에 회원 추가 테스트 */
    @Test
    void testInsertBlackList() {

        BlackListDTO blackListDTO = new BlackListDTO();
        blackListDTO.setBlackListStatus(1);
        blackListDTO.setUserCode(11);
        blackListDTO.setBlackListCount(7);

        blackListCommandService.registBlackList(blackListDTO);
    }
}
