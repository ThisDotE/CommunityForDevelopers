package org.thisdote.communityfordevelopers.studygroup_member.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.studygroup_member.command.service.StudyGroupMemberCommandService;
import org.thisdote.communityfordevelopers.studygroup_member.dto.StudyGroupMemberDTO;
import org.thisdote.communityfordevelopers.studygroup_member.query.StudyGroupMemberService;

import java.util.List;

@SpringBootTest
public class StudyGroupMemberCommandTests {

    @Autowired
    private StudyGroupMemberService studyGroupMemberService;
    @Autowired
    private StudyGroupMemberCommandService studyGroupMemberCommandService;

    @DisplayName("Regist Study Group Member Test")
    @Test
    void testInsertStudyGroupMember() {
        StudyGroupMemberDTO newStudyGroupMember = new StudyGroupMemberDTO();
        newStudyGroupMember.setStudyGroupId(4);
        newStudyGroupMember.setStudyGroupRole(0);
        newStudyGroupMember.setStudyGroupRegistDate(new java.util.Date());
        newStudyGroupMember.setUserCode(17);

        studyGroupMemberCommandService.registStudyGroupMember(newStudyGroupMember);

        List<StudyGroupMemberDTO> studyGroupMembers = studyGroupMemberService.selectAllStudyGroupMember();

        Assertions.assertEquals(
                studyGroupMembers.get(studyGroupMembers.size() - 1).getStudyGroupId(),
                newStudyGroupMember.getStudyGroupId()
        );
        Assertions.assertEquals(
                studyGroupMembers.get(studyGroupMembers.size() - 1).getStudyGroupRole(),
                newStudyGroupMember.getStudyGroupRole()
        );
        Assertions.assertEquals(
                studyGroupMembers.get(studyGroupMembers.size() - 1).getStudyGroupRegistDate().toString(),
                newStudyGroupMember.getStudyGroupRegistDate().toString()
        );
        Assertions.assertEquals(
                studyGroupMembers.get(studyGroupMembers.size() - 1).getUserCode(),
                newStudyGroupMember.getUserCode()
        );
    }

    @DisplayName("Update member role of study group member test")
    @ParameterizedTest
    @ValueSource(ints = 1)
    void testUpdateStudyGroupMemberRole(int studyGroupMemberId) {
        int newRole = 1;    // 역할을 스터디장으로 변경하겠다

    }



//    @DisplayName("Delete Study Group Member Test")
//    @ParameterizedTest
//    @ValueSource(ints = 10)
}
