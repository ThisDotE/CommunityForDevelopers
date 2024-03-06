package org.thisdote.communityfordevelopers.reported_article.command.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.reported_article.dto.ReportedArticleDTO;
import org.thisdote.communityfordevelopers.reported_article.query.ReportedArticleService;

import java.util.List;

@SpringBootTest
class ReportedArticleCommandServiceTest {

    private final ReportedArticleCommandService reportedArticleCommandService;
    private final ReportedArticleService reportedArticleService;

    @Autowired
    public ReportedArticleCommandServiceTest(
            ReportedArticleCommandService reportedArticleCommandService,
            ReportedArticleService reportedArticleService
    ) {
        this.reportedArticleCommandService = reportedArticleCommandService;
        this.reportedArticleService = reportedArticleService;
    }

    @DisplayName("신고당한 게시글 등록 테스트")
    @Test
    void testRegisterReportedArticle() {
        ReportedArticleDTO articleDTO = new ReportedArticleDTO();
        articleDTO.setArticleId(1);
        articleDTO.setUserCode(1);
        articleDTO.setReportDate("2023-12-30 00:00:00");
        articleDTO.setReportContent("신고신고!");
        articleDTO.setReportReportedCount(13);
        articleDTO.setReportType(0);

        reportedArticleCommandService.registReportedArticle(articleDTO);

        List<ReportedArticleDTO> reportedArticleList = reportedArticleService.selectAllReportedArticle();

        Assertions.assertEquals(
                reportedArticleList.get(reportedArticleList.size() - 1).getArticleId(),
                articleDTO.getArticleId()
        );

        Assertions.assertEquals(
                reportedArticleList.get(reportedArticleList.size() - 1).getUserCode(),
                articleDTO.getUserCode()
        );

        Assertions.assertEquals(
                reportedArticleList.get(reportedArticleList.size() - 1).getReportContent(),
                articleDTO.getReportContent()
        );
    }
}