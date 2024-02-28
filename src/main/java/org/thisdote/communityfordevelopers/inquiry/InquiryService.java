package org.thisdote.communityfordevelopers.inquiry;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryService {

    private final SqlSessionTemplate sqlSession;

    @Autowired
    public InquiryService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<InquiryDTO> selectAllInquiry() {
        return sqlSession.getMapper(InquiryMapper.class).selectAllInquiry();
    }

}
