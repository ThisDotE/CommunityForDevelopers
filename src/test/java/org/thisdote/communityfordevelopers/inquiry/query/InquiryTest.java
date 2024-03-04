package org.thisdote.communityfordevelopers.inquiry.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.inquiry.query.InquiryDTO;
import org.thisdote.communityfordevelopers.inquiry.query.InquiryService;

import java.util.List;
import java.util.stream.Stream;

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

    /* 설명. '문의 카테고리별 조회 테스트(Enum) 의 MethodSource */
    public static Stream<Arguments> getInquiryCategoryEnum() {
        int inquiryCategory = InquiryCategoryEnum.SANCTION.ordinal() + 1;
        return Stream.of(Arguments.of(inquiryCategory));
    }

    @DisplayName("문의 카테고리별 조회 테스트(Enum)")
    @ParameterizedTest
    @MethodSource("getInquiryCategoryEnum")
    void testFindInquiryByCategory(int inquiryCategory) {
        Assertions.assertDoesNotThrow(() -> {
            List<InquiryDTO> inquiryList = inquiryService.selectInquiryByCategory(inquiryCategory);
            inquiryList.forEach(System.out::println);
        });
    }
}
