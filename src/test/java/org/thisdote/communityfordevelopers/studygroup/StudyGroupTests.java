package org.thisdote.communityfordevelopers.studygroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
}
