package org.thisdote.communityfordevelopers.reported_article.query;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportedArticleService {
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public ReportedArticleService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<ReportedArticleDTO> selectAllReportedArticle() {
        return sqlSession.getMapper(ReportedArticleMapper.class).selectAllReportedArticle();
    }
}
