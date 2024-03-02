package org.thisdote.communityfordevelopers.article;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.inquiry.InquiryDTO;
import org.thisdote.communityfordevelopers.user.UserDTO;

import java.util.List;

@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleService articleService;

    @DisplayName("Article Test")
    @Test
    void TestFindAllArticle() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ArticleDTO> articles = articleService.selectAllArticle();
                    articles.forEach(System.out::println);
                }
        );
    }

    @DisplayName("회원 별 작성 게시글 조회")
    @ParameterizedTest
    @ValueSource(ints = 1)
    void testFindArticleByUser(int userCode) {
        Assertions.assertDoesNotThrow(() -> {
            List<ArticleDTO> articleByUser = articleService.selectArticleByUser(userCode);
            articleByUser.forEach(System.out::println);
        });
    }
}
