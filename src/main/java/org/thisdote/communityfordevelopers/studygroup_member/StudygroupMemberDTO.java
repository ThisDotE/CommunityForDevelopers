package org.thisdote.communityfordevelopers.studygroup_member;

import java.sql.Date;

public class StudygroupMemberDTO {
    private int studygroupId;
    private int studygroupRole;
    private Date studygroupRegistDate;
    private int userCode;

    public StudygroupMemberDTO() {
    }

    public StudygroupMemberDTO(int studygroupId, int studygroupRole, Date  studygroupRegistDate, int userCode) {
        this.studygroupId = studygroupId;
        this.studygroupRole = studygroupRole;
        this.studygroupRegistDate = studygroupRegistDate;
        this.userCode = userCode;
    }

    public int getStudygroupId() {
        return studygroupId;
    }

    public void setStudygroupId(int studygroupId) {
        this.studygroupId = studygroupId;
    }

    public int getStudygroupRole() {
        return studygroupRole;
    }

    public void setStudygroupRole(int studygroupRole) {
        this.studygroupRole = studygroupRole;
    }

    public Date getStudygroupRegistDate() {
        return studygroupRegistDate;
    }

    public void setStudygroupRegistDate(Date studygroupRegistDate) {
        this.studygroupRegistDate = studygroupRegistDate;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "StudyGroupMemberDTO{" +
                "studygroupId=" + studygroupId +
                ", studygroupRole=" + studygroupRole +
                ", studygroupRegistDate=" + studygroupRegistDate +
                ", userCode=" + userCode +
                '}';
    }
}
