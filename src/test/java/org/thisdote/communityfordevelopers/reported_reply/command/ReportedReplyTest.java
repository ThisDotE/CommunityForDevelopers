package org.thisdote.communityfordevelopers.reported_reply.command;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.reported_reply.DTO.ReportedReplyDTO;

@SpringBootTest
public class ReportedReplyTest {

    @Autowired
    private ReportedReplyService1 reportedReplyService1;

    @Test
    public void 신고_댓글_입력_테스트(){
        ReportedReplyDTO reportedReplyDTO = new ReportedReplyDTO();
        reportedReplyDTO.setReplyId(3);
        reportedReplyDTO.setUserCode(4);
        reportedReplyDTO.setReportDate(new java.util.Date());
        reportedReplyDTO.setReportContent("댓글을 신고한 내용(3)");
        reportedReplyDTO.setReportReportedCount(12);
        reportedReplyDTO.setReportType(2);

        reportedReplyService1.RegistReportedReply(reportedReplyDTO);
    }
}
