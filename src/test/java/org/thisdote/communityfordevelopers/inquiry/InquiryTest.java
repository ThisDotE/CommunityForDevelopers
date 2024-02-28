package org.thisdote.communityfordevelopers.inquiry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class InquiryTest {

    @Autowired
    private InquiryService inquiryService;

    @DisplayName("Select All Inquiry Test")
    @Test
    void TestFindAllInquiry() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<InquiryDTO> inquiries = inquiryService.selectAllInquiry();
                    inquiries.forEach(System.out::println);
                }
        );
    }
}
