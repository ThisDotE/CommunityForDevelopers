package org.thisdote.communityfordevelopers.article;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<ArticleDTO> selectAllArticle();
}
