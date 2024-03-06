package org.thisdote.communityfordevelopers.user.dto;

import org.thisdote.communityfordevelopers.studygroup_member.dto.StudyGroupMemberDTO;

import java.util.Date;

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

    public UserDTO() {
    }

    public UserDTO(
            int userCode,
            String userId,
            String userPassword,
            Date userBirthday,
            String userPhone,
            String userEmail,
            int userStudyGroupStatus,
            Date userRegistDate,
            Date userInfoUpdateDate,
            int userGrade,
            int userResignStatus,
            StudyGroupMemberDTO studyGroupMemberDTO
    ) {
        this.userCode = userCode;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userBirthday = userBirthday;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userStudyGroupStatus = userStudyGroupStatus;
        this.userRegistDate = userRegistDate;
        this.userInfoUpdateDate = userInfoUpdateDate;
        this.userGrade = userGrade;
        this.userResignStatus = userResignStatus;
        this.studyGroupMemberDTO = studyGroupMemberDTO;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserStudyGroupStatus() {
        return userStudyGroupStatus;
    }

    public void setUserStudyGroupStatus(int userStudyGroupStatus) {
        this.userStudyGroupStatus = userStudyGroupStatus;
    }

    public Date getUserRegistDate() {
        return userRegistDate;
    }

    public void setUserRegistDate(Date userRegistDate) {
        this.userRegistDate = userRegistDate;
    }

    public Date getUserInfoUpdateDate() {
        return userInfoUpdateDate;
    }

    public void setUserInfoUpdateDate(Date userInfoUpdateDate) {
        this.userInfoUpdateDate = userInfoUpdateDate;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    public int getUserResignStatus() {
        return userResignStatus;
    }

    public void setUserResignStatus(int userResignStatus) {
        this.userResignStatus = userResignStatus;
    }

    public StudyGroupMemberDTO getStudyGroupMemberDTO() {
        return studyGroupMemberDTO;
    }

    public void setStudyGroupMemberDTO(StudyGroupMemberDTO studyGroupMemberDTO) {
        this.studyGroupMemberDTO = studyGroupMemberDTO;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userCode=" + userCode +
                ", userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBirthday=" + userBirthday +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userStudyGroupStatus=" + userStudyGroupStatus +
                ", userRegistDate=" + userRegistDate +
                ", userInfoUpdateDate=" + userInfoUpdateDate +
                ", userGrade=" + userGrade +
                ", userResignStatus=" + userResignStatus +
                ", studyGroupMemberDTO=" + studyGroupMemberDTO +
                '}';
    }
}
