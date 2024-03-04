package org.thisdote.communityfordevelopers.studygroup_member.query;

import java.sql.Date;

public class StudyGroupMemberDTO {
    private int studyGroupId;
    private int studyGroupRole;     // 0 - 스터디원, 1 - 스터디장
    private Date studyGroupRegistDate;
    private int userCode;

    public StudyGroupMemberDTO() {
    }

    public StudyGroupMemberDTO(int studyGroupId, int studyGroupRole, Date studyGroupRegistDate, int userCode) {
        this.studyGroupId = studyGroupId;
        this.studyGroupRole = studyGroupRole;
        this.studyGroupRegistDate = studyGroupRegistDate;
        this.userCode = userCode;
    }

    public int getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    public int getStudyGroupRole() {
        return studyGroupRole;
    }

    public void setStudyGroupRole(int studyGroupRole) {
        this.studyGroupRole = studyGroupRole;
    }

    public Date getStudyGroupRegistDate() {
        return studyGroupRegistDate;
    }

    public void setStudyGroupRegistDate(Date studyGroupRegistDate) {
        this.studyGroupRegistDate = studyGroupRegistDate;
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
                "studyGroupId=" + studyGroupId +
                ", studyGroupRole=" + studyGroupRole +
                ", studyGroupRegistDate=" + studyGroupRegistDate +
                ", userCode=" + userCode +
                '}';
    }
}
