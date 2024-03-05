package org.thisdote.communityfordevelopers.reply.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.reply.dto.ReplyDTO;

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

    @DisplayName("회원 별 작성 댓글 조회")
    @ParameterizedTest
    @ValueSource(ints = 10)
    void testFindReplyByUser(int userCode) {
        Assertions.assertDoesNotThrow(() -> {
            List<ReplyDTO> replyByUser = replyService.selectReplyByUser(userCode);
            replyByUser.forEach(System.out::println);
        });
    }
}
