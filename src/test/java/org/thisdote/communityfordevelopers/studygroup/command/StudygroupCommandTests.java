package org.thisdote.communityfordevelopers.studygroup.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.studygroup.command.service.StudygroupCommandService;
import org.thisdote.communityfordevelopers.studygroup.dto.StudygroupCommandDTO;

import java.util.Date;

@SpringBootTest
public class StudygroupCommandTests {

    @Autowired
    StudygroupCommandService studygroupCommandService;

    @DisplayName("Studygroup Insert Test")
    @Test
    public void testInsertStudygroup() {
        StudygroupCommandDTO studygroupCommandDTO = new StudygroupCommandDTO();
        studygroupCommandDTO.setStudygroupType(1);
        studygroupCommandDTO.setStudygroupCreateDate(new Date());
        studygroupCommandDTO.setStudygroupMemberCount(30);
        studygroupCommandDTO.setStudygroupActivationStatus(1);
        studygroupCommandDTO.setStudygroupStudyTime(new Date());
        studygroupCommandDTO.setStudygroupContent("집에가자");

        studygroupCommandService.registStudygroup(studygroupCommandDTO);
    }

    @DisplayName("Studygroup Delete Test")
    @ParameterizedTest
    @ValueSource(ints = 5)
    void testDeleteStudygroup(int studygroupId) {
        studygroupCommandService.deleteStudygroup(studygroupId);
    }
}
