package org.thisdote.communityfordevelopers.user;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thisdote.communityfordevelopers.reported_article.ReportedArticleDTO;
import org.thisdote.communityfordevelopers.reported_article.ReportedArticleMapper;

import java.util.List;

@Service
public class UserService {
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public UserService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<UserDTO> selectAllUser() {
        return sqlSession.getMapper(UserMapper.class).selectAllUser();
    }
}
