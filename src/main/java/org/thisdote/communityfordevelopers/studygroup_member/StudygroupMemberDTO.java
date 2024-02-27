package org.thisdote.communityfordevelopers.studygroup_member;

public class StudygroupMemberDTO {
    private int studygroupId;
    private int studygroupRole;
    private int studygroupRegistDate;
    private int userCode;

    public StudygroupMemberDTO() {
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

    public int getStudygroupRegistDate() {
        return studygroupRegistDate;
    }

    public void setStudygroupRegistDate(int studygroupRegistDate) {
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
