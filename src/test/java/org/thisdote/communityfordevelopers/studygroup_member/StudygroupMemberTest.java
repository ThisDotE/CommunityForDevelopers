package org.thisdote.communityfordevelopers.studygroup_member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudygroupMemberTest {
    @Autowired
    private StudygroupMemberService studygroupMemberService;

    @DisplayName("Reported Member Test")
    @Test
    void findAllStudygroupMemberTest() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<StudygroupMemberDTO> studygroupMember = studygroupMemberService.selectAllStudygroupMember();
                    studygroupMember.forEach(System.out::println);
                }
        );
    }
}

