package org.thisdote.communityfordevelopers.studygroup_member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudyGroupMemberTest {
    @Autowired
    private StudyGroupMemberService studygroupMemberService;

    @DisplayName("Reported Member Test")
    @Test
    void findAllStudyGroupMemberTest() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<StudyGroupMemberDTO> studyGroupMember = studygroupMemberService.selectAllStudyGroupMember();
                    studyGroupMember.forEach(System.out::println);
                }
        );
    }

    @DisplayName("All Leader Member Test")
    @Test
    void findAllStudyGroupLeaderTest() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<StudyGroupMemberDTO> studyGroupLeader = studygroupMemberService.selectAllStudyGroupLeader();
                }
        );
    }

    @DisplayName("All Follower Member Test")
    @Test
    void findAllStudyGroupFollowerTest() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<StudyGroupMemberDTO> studyGroupFollower = studygroupMemberService.selectAllStudyGroupFollower();
                }
        );
    }
}

