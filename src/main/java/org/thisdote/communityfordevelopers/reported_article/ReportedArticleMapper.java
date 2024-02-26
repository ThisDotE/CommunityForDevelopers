package org.thisdote.communityfordevelopers.reported_article;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportedArticleMapper {

    List<ReportedArticleDTO> selectAllReportedArticle();
}
