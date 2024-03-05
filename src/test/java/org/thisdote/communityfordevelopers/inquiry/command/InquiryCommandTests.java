package org.thisdote.communityfordevelopers.inquiry.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.inquiry.command.service.InquiryCommandService;
import org.thisdote.communityfordevelopers.inquiry.dto.InquiryCommandDTO;

import java.util.Date;

@SpringBootTest
public class InquiryCommandTests {


    @Autowired
    InquiryCommandService inquiryService;

    @DisplayName("Inquiry Insert Test")
    @Test
    public void testInsertInquiry() {
        InquiryCommandDTO inquiryDTO = new InquiryCommandDTO();
        inquiryDTO.setInquiryCategory(1);
        inquiryDTO.setInquiryTitle("오늘은 집에 일찍 가셔야죠 아저씨");
        inquiryDTO.setInquiryContent("집에 안갈거야?");
        inquiryDTO.setInquiryCreateDate(new Date());
        inquiryDTO.setInquiryLastUpdateDate(new Date());
        inquiryDTO.setInquiryStatus(1);
        inquiryDTO.setUserCode(10);

        inquiryService.registInquiry(inquiryDTO);
    }

}