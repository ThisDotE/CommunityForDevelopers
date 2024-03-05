package org.thisdote.communityfordevelopers.user.dto;

import lombok.*;
import org.thisdote.communityfordevelopers.studygroup_member.query.StudyGroupMemberDTO;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
    private int userCode;
    private String userId;
    private String userPassword;
    private Date userBirthday;
    private String userPhone;
    private String userEmail;
    private int userStudyGroupStatus;
    private Date userRegistDate;
    private Date userInfoUpdateDate;
    private int userGrade;
    private int userResignStatus;
    private StudyGroupMemberDTO studyGroupMemberDTO;
}
