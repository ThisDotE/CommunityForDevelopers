package org.thisdote.communityfordevelopers.blacklist.query;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlackListService {

    private final SqlSessionTemplate sqlSession;

    @Autowired
    public BlackListService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<BlackListDTO> selectAllBlackList() {
        return sqlSession.getMapper(BlackListMapper.class).selectAllBlackList();
    }

}
