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

    @DisplayName("스터디 그룹 전체 조회 확인 테스트")
    @Test
    void testFindAllStudyGroup() {
        Assertions.assertDoesNotThrow(() -> {
            List<StudyGroupDTO> groups = studyGroupService.findAllStudyGroup();
            groups.forEach(System.out::println);
        });
    }


}
