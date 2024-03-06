package org.thisdote.communityfordevelopers.studygroup.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.studygroup.command.service.StudyGroupCommandService;
import org.thisdote.communityfordevelopers.studygroup.dto.StudyGroupCommandDTO;

import java.util.Date;

@SpringBootTest
public class StudyGroupCommandTests {

    @Autowired
    StudyGroupCommandService studygroupCommandService;

    @DisplayName("StudyGroup Insert Test")
    @Test
    public void testInsertStudyGroup() {
        StudyGroupCommandDTO studygroupCommandDTO = new StudyGroupCommandDTO();

        studygroupCommandDTO.setStudygroupType(1);
        studygroupCommandDTO.setStudygroupCreateDate(new Date());
        studygroupCommandDTO.setStudygroupMemberCount(30);
        studygroupCommandDTO.setStudygroupActivationStatus(1);
        studygroupCommandDTO.setStudygroupStudyTime(new Date());
        studygroupCommandDTO.setStudygroupContent("집에가자");
        studygroupCommandDTO.setStudygroupDeleteStatus(0);

        studygroupCommandService.registStudygroup(studygroupCommandDTO);
    }

    @DisplayName("StudyGroup Modify Test")
    @Test
    public void testModifyStudyGroup() {
        StudyGroupCommandDTO studygroupCommandDTO = new StudyGroupCommandDTO();

        studygroupCommandDTO.setStudygroupId(1);
        studygroupCommandDTO.setStudygroupType(1);
        studygroupCommandDTO.setStudygroupCreateDate(new Date());
        studygroupCommandDTO.setStudygroupMemberCount(30);
        studygroupCommandDTO.setStudygroupActivationStatus(1);
        studygroupCommandDTO.setStudygroupStudyTime(new Date());
        studygroupCommandDTO.setStudygroupContent("집에가자");
        studygroupCommandDTO.setStudygroupDeleteStatus(0);

        studygroupCommandService.modifyStudygroup(studygroupCommandDTO);
    }

    @DisplayName("StudyGroup Delete Test")
    @ParameterizedTest
    @ValueSource(ints = 5)
    void testDeleteStudyGroup(int studygroupId) {
        int deleteStatus = 1;

        StudyGroupCommandDTO studyGroupCommandDTO = new StudyGroupCommandDTO();
        studyGroupCommandDTO.setStudygroupDeleteStatus(1);

        studygroupCommandService.deleteStudyGroup(studyGroupCommandDTO, studygroupId);
    }
}
