package org.thisdote.communityfordevelopers.article;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArticleMapper {
    List<ArticleDTO> selectAllArticle();

    List<ArticleDTO> selectArticleByUser(int userCode);

    List<ArticleDTO> selectArticleByCategory(String category);

    List<ArticleDTO> selectStudyArticleInfo(int articleId);

    List<ArticleDTO> selectArticleByCriteria(Map<String, Object> criteria);
}
