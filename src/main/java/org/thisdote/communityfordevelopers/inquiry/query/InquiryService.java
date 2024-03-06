package org.thisdote.communityfordevelopers.inquiry.query;

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

    public List<InquiryDTO> selectInquiryBy(int userCode) {
        return sqlSession.getMapper(InquiryMapper.class).selectInquiryBy(userCode);
    }

    public List<InquiryDTO> selectInquiryByCategory(int inquiryCategory) {
        return sqlSession.getMapper(InquiryMapper.class).selectInquiryByCategory(inquiryCategory);
    }
}
