package org.thisdote.communityfordevelopers.inquiry.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.inquiry.query.InquiryDTO;
import org.thisdote.communityfordevelopers.inquiry.query.InquiryService;

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

    @DisplayName("회원 별 문의 내역 조회")
    @ParameterizedTest
    @ValueSource(ints = 3)
    void testFindInquiryBy(int userCode) {
        Assertions.assertDoesNotThrow(() -> {
            List<InquiryDTO> inquiriesByUser = inquiryService.selectInquiryBy(userCode);
            inquiriesByUser.forEach(System.out::println);
        });
    }
}
