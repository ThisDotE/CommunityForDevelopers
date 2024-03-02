package org.thisdote.communityfordevelopers.article;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    @DisplayName("Question Article Test")
    @Test
    void TestFindAllQuestionArticle() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ArticleDTO> article = articleService.selectAllQuestionArticle();
                    article.forEach(System.out::println);
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

//    @DisplayName("카테고리 별 게시글 조회")
//    @ParameterizedTest
//    @EnumSource(names = "QA",value = ArticleCategory.class)
//    void testFindArticleByCategory(ArticleCategory articleCategory) {
//        Assertions.assertDoesNotThrow(() -> {
//            ArticleCategory category = ArticleCategory.valueOf(articleCategory.name());
//            List<ArticleDTO> articleByCategory = articleService.selectArticleByCategory(category);
//            articleByCategory.forEach(System.out::println);
//        });
//    }
}
