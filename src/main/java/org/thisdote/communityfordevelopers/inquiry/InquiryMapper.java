package org.thisdote.communityfordevelopers.inquiry;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InquiryMapper {
    List<InquiryDTO> selectAllInquiry();

    List<InquiryDTO> selectInquiryBy(int userCode);
}
