package org.thisdote.communityfordevelopers.studygroup_member.command.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "studygroup_member")
public class StudyGroupMemberEntity implements Serializable {

    @Id
    @Column(name = "studygroup_member_id")
    private int studyGroupMemberId;

    @Column(name = "studygroup_id")
    private int studyGroupId;

    @Column(name = "studygroup_role")
    private int studyGroupRole;     // 0 - 스터디원, 1 - 스터디장

    @Column(name = "studygroup_regist_date")
    private Date studyGroupRegistDate;

    @Column(name = "user_code")
    private int userCode;

    public StudyGroupMemberEntity() {
    }

    public StudyGroupMemberEntity(int studyGroupMemberId, int studyGroupId, int studyGroupRole, Date studyGroupRegistDate, int userCode) {
        this.studyGroupMemberId = studyGroupMemberId;
        this.studyGroupId = studyGroupId;
        this.studyGroupRole = studyGroupRole;
        this.studyGroupRegistDate = studyGroupRegistDate;
        this.userCode = userCode;
    }

    public int getStudyGroupMemberId() {
        return studyGroupMemberId;
    }

    public void setStudyGroupMemberId(int studyGroupMemberId) {
        this.studyGroupMemberId = studyGroupMemberId;
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
        return "StudyGroupMemberEntity{" +
                "studyGroupMemberId=" + studyGroupMemberId +
                ", studyGroupId=" + studyGroupId +
                ", studyGroupRole=" + studyGroupRole +
                ", studyGroupRegistDate=" + studyGroupRegistDate +
                ", userCode=" + userCode +
                '}';
    }
}
