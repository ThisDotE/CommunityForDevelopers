package org.thisdote.communityfordevelopers.studygroup_member.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thisdote.communityfordevelopers.studygroup_member.command.entity.StudyGroupMemberEntity;
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

    @DisplayName("스터디그룹_멤버_등록_테스트")
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

    @DisplayName("스터디그룹_멤버_역할_수정_테스트")
    @ParameterizedTest
    @ValueSource(ints = 3)
    void testUpdateStudyGroupMemberRole(int studyGroupMemberId) {

//        int newRole = 0;    // 역할을 스터디원으로 변경하겠다
        int newRole = 1;    // 역할을 스터디장으로 변경하겠다

        StudyGroupMemberDTO modifyMember =
                studyGroupMemberService
                        .selectAllStudyGroupMember()
                        .get(studyGroupMemberId);

        modifyMember.setStudyGroupMemberId(studyGroupMemberId);
        modifyMember.setStudyGroupRole(newRole);

        studyGroupMemberCommandService.modifyStudyGroupMemberRole(modifyMember);
    }



    @DisplayName("스터디그룹_멤버_삭제_테스트")
    @ParameterizedTest
    @ValueSource(ints = 16)
    void testDeleteStudyGroupMember(int studyGroupMemberId) {
        studyGroupMemberCommandService.deleteStudyGroupMember(studyGroupMemberId);
    }

}
