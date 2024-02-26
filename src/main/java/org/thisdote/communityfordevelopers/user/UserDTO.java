package org.thisdote.communityfordevelopers.user;

import java.util.Date;

public class UserDTO {
    private int userCode;
    private String userId;
    private String userPwd;
    private Date userBirthday;
    private String userPhone;
    private String userEmail;
    private int userStudygroupStatus;
    private Date userRegistDate;
    private Date userInfoUpdateDate;
    private int userGrade;

    public UserDTO() {
    }

    public UserDTO(int userCode, String userId, String userPwd, Date userBirthday, String userPhone, String userEmail, int userStudygroupStatus, Date userRegistDate, Date userInfoUpdateDate, int userGrade) {
        this.userCode = userCode;
        this.userId = userId;
        this.userPwd = userPwd;
        this.userBirthday = userBirthday;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userStudygroupStatus = userStudygroupStatus;
        this.userRegistDate = userRegistDate;
        this.userInfoUpdateDate = userInfoUpdateDate;
        this.userGrade = userGrade;
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
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
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
    public int getUserStudygroupStatus() {
        return userStudygroupStatus;
    }
    public void setUserStudygroupStatus(int userStudygroupStatus) {
        this.userStudygroupStatus = userStudygroupStatus;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "userCode=" + userCode +
                ", userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userBirthday=" + userBirthday +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userStudygroupStatus=" + userStudygroupStatus +
                ", userRegistDate=" + userRegistDate +
                ", userInfoUpdateDate=" + userInfoUpdateDate +
                ", userGrade=" + userGrade +
                '}';
    }
}
