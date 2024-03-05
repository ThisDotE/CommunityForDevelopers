package org.thisdote.communityfordevelopers.studygroup_member.command.entity;

import java.io.Serializable;
import java.util.Objects;

public class StudyGroupMemberIdClass implements Serializable {
    private int studyGroupId;
    private int userCode;

    public StudyGroupMemberIdClass() {
    }

    public StudyGroupMemberIdClass(int studyGroupId, int userCode) {
        this.studyGroupId = studyGroupId;
        this.userCode = userCode;
    }

    public int getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyGroupMemberIdClass that = (StudyGroupMemberIdClass) o;
        return studyGroupId == that.studyGroupId && userCode == that.userCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studyGroupId, userCode);
    }

    @Override
    public String toString() {
        return "StudyGroupMemberIdClass{" +
                "studyGroupId=" + studyGroupId +
                ", userCode=" + userCode +
                '}';
    }
}
