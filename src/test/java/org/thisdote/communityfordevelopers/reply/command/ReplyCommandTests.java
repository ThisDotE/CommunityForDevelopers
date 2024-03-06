package org.thisdote.communityfordevelopers.reply.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.reply.command.service.ReplyCommandService;
import org.thisdote.communityfordevelopers.reply.dto.ReplyDTO;
import org.thisdote.communityfordevelopers.reply.query.ReplyService;

import java.util.Date;

@SpringBootTest
public class ReplyCommandTests {


    private ReplyCommandService replyCommandService;
    private ReplyService replyService;

    @Autowired
    public ReplyCommandTests(ReplyCommandService replyCommandService, ReplyService replyService) {
        this.replyCommandService = replyCommandService;
        this.replyService = replyService;
    }

    /* 설명. 댓글 등록 테스트 */
    @DisplayName("댓글 등록 테스트")
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

    @DisplayName("댓글 수정 테스트")
    @ParameterizedTest
    @ValueSource(ints = 4)
    void testModifyReply(int replyId) {
        replyCommandService.modifyReply(replyId);

        ReplyDTO replyDTO = new ReplyDTO();
        replyDTO.setReplyReportStatus(1);
        replyDTO.setReplyContent("내가 제일 멋쟁이 개발자");
        replyDTO.setReplyCreatedDate(new Date());
        replyDTO.setReplyLastUpdateDate(new Date());
        replyDTO.setReplyLikeCount(10);
        replyDTO.setUserCode(9);
        replyDTO.setArticleId(9);
        replyDTO.setReplyDeleteStatus(1);
    }

    @DisplayName("댓글 삭제 테스트")
    @ParameterizedTest
    @ValueSource(ints = 2)
    void testDeleteReply(int replyId) {
        replyCommandService.deleteReply(replyId);
    }
}
