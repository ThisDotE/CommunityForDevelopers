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
    public String getUserId() {
        return userId;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public Date getUserBirthday() {
        return userBirthday;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public int getUserStudygroupStatus() {
        return userStudygroupStatus;
    }
    public Date getUserRegistDate() {
        return userRegistDate;
    }
    public Date getUserInfoUpdateDate() {
        return userInfoUpdateDate;
    }
    public int getUserGrade() {
        return userGrade;
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
