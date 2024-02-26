package org.thisdote.communityfordevelopers.reported_reply;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thisdote.communityfordevelopers.reported_article.ReportedArticleDTO;
import org.thisdote.communityfordevelopers.reported_article.ReportedArticleMapper;

import java.util.List;

@Service
public class ReportedReplyService {
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public ReportedReplyService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<ReportedReplyDTO> selectAllReportedReply() {
        return sqlSession.getMapper(ReportedReplyMapper.class).selectAllReportedReply();
    }
}
