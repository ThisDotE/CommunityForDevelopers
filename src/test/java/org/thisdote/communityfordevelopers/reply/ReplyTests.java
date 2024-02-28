package org.thisdote.communityfordevelopers.reply;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReplyTests {

    @Autowired
    private ReplyService replyService;

    @DisplayName("댓글 전체 조회 확인 테스트")
    @Test
    void testFindAllReply() {
        Assertions.assertDoesNotThrow(() -> {
            List<ReplyDTO> replies = replyService.findAllReply();
            replies.forEach(System.out::println);
        });
    }
}
