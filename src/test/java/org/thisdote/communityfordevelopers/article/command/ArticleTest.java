package org.thisdote.communityfordevelopers.article.command;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.article.dto.ArticleDTO;

@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleService1 articleService1;

    @Test
    public void 새로운_게시글_생성(){

        ArticleDTO article = new ArticleDTO();
        article.setArticleId(26);
        article.setArticleTitle("글6");
        article.setArticleContent("글내용16");
        article.setArticleCategory(3);
        article.setArticleCreateDate("2024-01-15 00:00:00");
        article.setArticleLastUpdateDate("2024-02-01 00:00:00");
        article.setArticleViewCount(29);
        article.setArticleLikeCount(6);
        article.setArticleReplyCount(0);
        article.setArticleReportStatus(6);
        article.setStudygroupMemberMaxCount(6);
        article.setStudygroupRecruitmentDeadline("2024-02-11 00:00:00");
        article.setArticleQuestionCategory("6");
        article.setUserCode(11);
        article.setStudygroupId(5);
        article.setStudygroupCurrentMemberCount(17);
        article.setStudygroupPendingMemberCount(6);
        article.setArticleDeleteStatus(1);

        articleService1.registArticle(article);
    }

    @ParameterizedTest
    @ValueSource(ints = 3)
    public void 게시글_삭제(int articleId){
        int deleteStatus = 1;

        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setArticleDeleteStatus(deleteStatus);

        articleService1.deleteArticle(articleDTO, articleId);
    }

    @Test
    public void 게시글_수정(){

        ArticleDTO article = new ArticleDTO();
        article.setArticleId(26);
        article.setArticleTitle("글6");
        article.setArticleContent("글내용16");
        article.setArticleCategory(3);
        article.setArticleCreateDate("2024-01-15 00:00:00");
        article.setArticleLastUpdateDate("2024-02-01 00:00:00");
        article.setArticleViewCount(29);
        article.setArticleLikeCount(6);
        article.setArticleReplyCount(0);
        article.setArticleReportStatus(6);
        article.setStudygroupMemberMaxCount(6);
        article.setStudygroupRecruitmentDeadline("2024-02-11 00:00:00");
        article.setArticleQuestionCategory("6");
        article.setUserCode(11);
        article.setStudygroupId(5);
        article.setStudygroupCurrentMemberCount(17);
        article.setStudygroupPendingMemberCount(6);
        article.setArticleDeleteStatus(1);

        articleService1.modifyArticle(article);
    }
}