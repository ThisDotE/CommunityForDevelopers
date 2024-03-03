package org.thisdote.communityfordevelopers.studygroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.article.SearchCriteriaEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@SpringBootTest
public class StudyGroupTests {

    @Autowired
    private StudyGroupService studyGroupService;


    @DisplayName("All StudyGroup Test")
    @Test
    void testFindAllStudyGroup() {
        Assertions.assertDoesNotThrow(() -> {
            List<StudyGroupDTO> groups = studyGroupService.findAllStudyGroup();
            groups.forEach(System.out::println);
        });
    }

    @DisplayName("All English StudyGroup Test")
    @Test
    void testFindAllEnglishStudyGroup() {
        Assertions.assertDoesNotThrow(() -> {
            List<StudyGroupDTO> englishGroup = studyGroupService.findAllEnglishStudyGroup();
            englishGroup.forEach(System.out::println);
        });
    }

    @DisplayName("All License StudyGroup Test")
    @Test
    void testFindAllLicenseStudyGroup() {
        Assertions.assertDoesNotThrow(() -> {
            List<StudyGroupDTO> licenseGroup = studyGroupService.findAllLicenseStudyGroup();
            licenseGroup.forEach(System.out::println);
        });
    }

    @DisplayName("활성화 상태 별 스터디 그룹 조회")
    @ParameterizedTest
    @ValueSource(ints = 0)
    void testFindStudyGroupByStatus(int activationStatus) {
        Assertions.assertDoesNotThrow(() -> {
            List<StudyGroupDTO> studyGroupList = studyGroupService.findStudyGroupByStatus(activationStatus);
            studyGroupList.forEach(System.out::println);
        });
    }

    public static Stream<Arguments> getStudyGroupTypeEnum() {
        int studyGroupType = SearchStudyGroupTypeEnum.CERTIFICATION.ordinal() + 1;
        return Stream.of(Arguments.of(studyGroupType));
    }

    @DisplayName("스터디 타입별 조회 테스트(Enum)")
    @ParameterizedTest
    @MethodSource("getStudyGroupTypeEnum")
    void testFindStudyGroupsByType(int studyGroupType) {
        Assertions.assertDoesNotThrow(() -> {
            List<StudyGroupDTO> studyGroupList = studyGroupService.selectStudyGroupsByType(studyGroupType);
            studyGroupList.forEach(System.out::println);
        });
    }
}
