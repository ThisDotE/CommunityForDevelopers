package org.thisdote.communityfordevelopers.article.query;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArticleMapper {
    List<ArticleDTO> selectAllArticle();

    List<ArticleDTO> selectAllQuestionArticle();

    List<ArticleDTO> selectArticleByUser(int userCode);

    List<ArticleDTO> selectStudyArticleInfo(int articleId);

    List<ArticleDTO> selectArticleByCriteria(Map<String, Object> criteria);

    List<ArticleDTO> selectArticleByCategory(int articleCategory);
}
