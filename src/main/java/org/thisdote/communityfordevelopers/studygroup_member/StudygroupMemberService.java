package org.thisdote.communityfordevelopers.studygroup_member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thisdote.communityfordevelopers.user.UserDTO;

import java.util.List;

@Service
public class StudygroupMemberService {
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public StudygroupMemberService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<StudygroupMemberDTO> selectAllStudygroupMember() {
        return sqlSession.getMapper(StudygroupMemberMapper.class).selectAllStudygroupMember();
    }
}
