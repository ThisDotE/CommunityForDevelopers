package org.thisdote.communityfordevelopers.reply.command;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.reply.command.service.ReplyCommandService;
import org.thisdote.communityfordevelopers.reply.dto.ReplyDTO;

import java.util.Date;

@SpringBootTest
public class ReplyCommandTests {

    @Autowired
    private ReplyCommandService replyCommandService;

    /* 설명. 댓글 등록에 대한 테스트 */
    @Test
    void testInsertReply() {

        ReplyDTO replyDTO = new ReplyDTO();
        replyDTO.setReplyReportStatus(1);
        replyDTO.setReplyContent("내가 제일 멋쟁이 개발자");
        replyDTO.setReplyCreatedDate(new Date());
        replyDTO.setReplyLastUpdateDate(new Date());
        replyDTO.setReplyLikeCount(10);
        replyDTO.setUserCode(9);
        replyDTO.setArticleId(9);
        replyDTO.setReplyDeleteStatus(1);

        replyCommandService.registReply(replyDTO);
    }
}
