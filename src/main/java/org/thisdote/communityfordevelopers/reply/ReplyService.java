package org.thisdote.communityfordevelopers.reply;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {

    private final SqlSessionTemplate sqlSession;

    @Autowired
    public ReplyService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<ReplyDTO> findAllReply() {
        return sqlSession.getMapper(ReplyMapper.class).selectAllReply();
    }
}
