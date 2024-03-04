package org.thisdote.communityfordevelopers.studygroup_member.query;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyGroupMemberService {
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public StudyGroupMemberService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<StudyGroupMemberDTO> selectAllStudyGroupMember() {
        return sqlSession.getMapper(StudyGroupMemberMapper.class).selectAllStudyGroupMember();
    }

    public List<StudyGroupMemberDTO> selectAllStudyGroupLeader() {
        return sqlSession.getMapper(StudyGroupMemberMapper.class).selectAllStudyGroupLeader();
    }

    public List<StudyGroupMemberDTO> selectAllStudyGroupFollower() {
        return sqlSession.getMapper(StudyGroupMemberMapper.class).selectAllStudyGroupFollower();
    }

}
