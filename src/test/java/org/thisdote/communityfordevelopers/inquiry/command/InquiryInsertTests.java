package org.thisdote.communityfordevelopers.inquiry.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class InquiryInsertTests {

    @Autowired
    InquiryRepository inquiryRepository;

    @DisplayName("Inquiry Insert Test")
    @Test
    public void testInsertInquiry() {
        System.out.println(inquiryRepository.getClass().getName());
    }

}
