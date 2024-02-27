package org.thisdote.communityfordevelopers.studygroup;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyGroupService {

    private final SqlSessionTemplate sqlSession;

    @Autowired
    public StudyGroupService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<StudyGroupDTO> findAllStudyGroup() {
        return sqlSession.getMapper(StudyGroupMapper.class).selectAllStudyGroup();
    }
}
