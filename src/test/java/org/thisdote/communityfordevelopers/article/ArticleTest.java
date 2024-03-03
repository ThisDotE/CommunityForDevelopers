package org.thisdote.communityfordevelopers.article;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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

    private static Stream<Arguments> getFindArticleByCategory() {
        int category = ArticleCategory.INFO.ordinal();

        return Stream.of(Arguments.of(category));
    }
    @DisplayName("카테고리 별 게시글 조회")
    @ParameterizedTest
    @MethodSource("getFindArticleByCategory")
    void testFindArticleByCategory(int category) {
        Assertions.assertDoesNotThrow(() -> {
            List<ArticleDTO> articleByCategory = articleService.selectArticleByCategory(category);
            articleByCategory.forEach(System.out::println);
        });
    }

    @DisplayName("스터디 그룹 게시글 조회")
    @ParameterizedTest
    @ValueSource(ints = 1)
    void testFindStudyGroupByArticleId(int articleId) {
        Assertions.assertDoesNotThrow(() -> {
            List<ArticleDTO> StudyGroupByArticleId = articleService.selectStudyArticleInfo(articleId);
            StudyGroupByArticleId.forEach(System.out::println);
        });
    }

    private static Stream<Arguments> getSearchCriteria() {
        Map<String, Object> criteria = new HashMap<>();
        criteria.put(SearchCriteriaEnum.TITLE.toString(), "점심");

        return Stream.of(Arguments.of(criteria));
    }

    @DisplayName("게시글 검색")
    @ParameterizedTest
    @MethodSource("getSearchCriteria")
    void testSearchArticleWithCriteria(Map<String, Object> criteria) {
        Assertions.assertDoesNotThrow(() -> {
            List<ArticleDTO> articleList = articleService.selectArticleByCriteria(criteria);
            articleList.forEach(System.out::println);
        });
    }
}
