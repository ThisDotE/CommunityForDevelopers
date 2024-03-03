package org.thisdote.communityfordevelopers.user;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<UserDTO> selectUserId(String userId) {
        return sqlSession.getMapper(UserMapper.class).selectUserId(userId);
    }

    public List<UserDTO> selectUserCode(int userCode) {
        return sqlSession.getMapper(UserMapper.class).selectUserCode(userCode);
    }


    public List<UserDTO> selectUserByUserCode(int userCode) {
        return sqlSession.getMapper(UserMapper.class).selectUserByUserCode(userCode);
    }
}
