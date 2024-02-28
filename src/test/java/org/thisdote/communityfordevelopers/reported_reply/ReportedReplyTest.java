package org.thisdote.communityfordevelopers.reported_reply;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ReportedReplyTest {
    @Autowired
    private ReportedReplyService reportedReplyService;

    @DisplayName("Reported Reply Test")
    @Test
    void testFindAllReportedReplies() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ReportedReplyDTO> reportedreplies = reportedReplyService.selectAllReportedReply();
                    reportedreplies.forEach(System.out::println);
                }
        );
    }
}
