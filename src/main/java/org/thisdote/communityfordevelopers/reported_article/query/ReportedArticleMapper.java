package org.thisdote.communityfordevelopers.reported_article.query;

import org.apache.ibatis.annotations.Mapper;
import org.thisdote.communityfordevelopers.reported_article.dto.ReportedArticleDTO;

import java.util.List;

@Mapper
public interface ReportedArticleMapper {

    List<ReportedArticleDTO> selectAllReportedArticle();
}
