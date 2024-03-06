package org.thisdote.communityfordevelopers.reported_article.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.thisdote.communityfordevelopers.reported_article.query.ReportedArticleDTO;
//import org.thisdote.communityfordevelopers.reported_article.query.ReportedArticleService;
//import org.thisdote.communityfordevelopers.reported_article.query.ReportedArticleDTO;
//import org.thisdote.communityfordevelopers.reported_article.query.ReportedArticleService;
import org.thisdote.communityfordevelopers.reported_article.dto.ReportedArticleDTO;

import java.util.List;


@SpringBootTest
public class ReportedArticleTest {
    @Autowired
    private ReportedArticleService reportedArticleService;

    @DisplayName("Reported Article Test")
    @Test
    void testFindAllReportedArticle() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ReportedArticleDTO> reportedArticles = reportedArticleService.selectAllReportedArticle();
                    reportedArticles.forEach(System.out::println);
                }
        );
    }
}
