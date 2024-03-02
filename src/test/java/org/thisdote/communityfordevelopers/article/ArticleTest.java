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
import org.thisdote.communityfordevelopers.inquiry.InquiryDTO;
import org.thisdote.communityfordevelopers.user.UserDTO;

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

    /* 설명. Title이 같은 게시글 제목 출력 */
    @DisplayName("Title Test")
    @ParameterizedTest
    @ValueSource(strings = "점심에 밥 같이 드실분 구한다니깐~.")
    void TestselectTitleArticle(String title){
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ArticleDTO> articles = articleService.selectTitleArticle(title);
                    for (int i = 0; i < articles.size(); i++) {
                        if(title.equals(articles.get(i).getArticleTitle())){
                            System.out.println(articles.get(i).getArticleTitle());
                            return;
                        }
                    }
                }
        );
    }

    @DisplayName("Category Test")
    @ParameterizedTest
    @ValueSource(strings = "질문")
    void TestselectCategoryArticle(String category){
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ArticleDTO> articles = articleService.selectCategoryArticle(category);
                    for (int i = 0; i < articles.size(); i++) {
                        if(category.equals(articles.get(i).getArticleCategory())){
                            System.out.println(articles.get(i).getArticleCategory());
                            System.out.println("질문 게시글 입니다.");
                            return;
                        }
                    }
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

    @DisplayName("카테고리 별 게시글 조회")
    @ParameterizedTest
    @ValueSource(strings = "질문")
    void testFindArticleByCategory(String category) {
        Assertions.assertDoesNotThrow(() -> {
            List<ArticleDTO> articleByCategory = articleService.selectArticleByCategory(category);
            articleByCategory.forEach(System.out::println);
        });
    }

    @DisplayName("스터디 그룹 조회")
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
//        criteria.put(SearchCriteriaEnum.CATEGORY.toString(), "질문");
        criteria.put(SearchCriteriaEnum.TITLE.toString(), "점심");
//        criteria.put(SearchCriteriaEnum.WRITER.toString(), 5);

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
