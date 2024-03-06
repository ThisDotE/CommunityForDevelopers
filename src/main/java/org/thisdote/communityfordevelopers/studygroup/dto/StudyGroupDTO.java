package org.thisdote.communityfordevelopers.studygroup.dto;

import java.util.Date;

public class StudyGroupDTO {

    private int studyGroupId;
    private int studyGroupType;
    private Date studyGroupCreatedDate;
    private int studyGroupMemberCount;
    private int studyGroupActivationStatus;
    private Date studyGroupStudyTime;
    private String studyGroupContent;
    private int studyGroupDeleteStatus;

    public StudyGroupDTO() {
    }

    public StudyGroupDTO(int studyGroupId, int studyGroupType, Date studyGroupCreatedDate, int studyGroupMemberCount, int studyGroupActivationStatus, Date studyGroupStudyTime, String studyGroupContent, int studyGroupDeleteStatus) {
        this.studyGroupId = studyGroupId;
        this.studyGroupType = studyGroupType;
        this.studyGroupCreatedDate = studyGroupCreatedDate;
        this.studyGroupMemberCount = studyGroupMemberCount;
        this.studyGroupActivationStatus = studyGroupActivationStatus;
        this.studyGroupStudyTime = studyGroupStudyTime;
        this.studyGroupContent = studyGroupContent;
        this.studyGroupDeleteStatus = studyGroupDeleteStatus;
    }

    public int getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    public int getStudyGroupType() {
        return studyGroupType;
    }

    public void setStudyGroupType(int studyGroupType) {
        this.studyGroupType = studyGroupType;
    }

    public Date getStudyGroupCreatedDate() {
        return studyGroupCreatedDate;
    }

    public void setStudyGroupCreatedDate(Date studyGroupCreatedDate) {
        this.studyGroupCreatedDate = studyGroupCreatedDate;
    }

    public int getStudyGroupMemberCount() {
        return studyGroupMemberCount;
    }

    public void setStudyGroupMemberCount(int studyGroupMemberCount) {
        this.studyGroupMemberCount = studyGroupMemberCount;
    }

    public int getStudyGroupActivationStatus() {
        return studyGroupActivationStatus;
    }

    public void setStudyGroupActivationStatus(int studyGroupActivationStatus) {
        this.studyGroupActivationStatus = studyGroupActivationStatus;
    }

    public Date getStudyGroupStudyTime() {
        return studyGroupStudyTime;
    }

    public void setStudyGroupStudyTime(Date studyGroupStudyTime) {
        this.studyGroupStudyTime = studyGroupStudyTime;
    }

    public String getStudyGroupContent() {
        return studyGroupContent;
    }

    public void setStudyGroupContent(String studyGroupContent) {
        this.studyGroupContent = studyGroupContent;
    }

    public int getStudyGroupDeleteStatus() {
        return studyGroupDeleteStatus;
    }

    public void setStudyGroupDeleteStatus(int studyGroupDeleteStatus) {
        this.studyGroupDeleteStatus = studyGroupDeleteStatus;
    }

    @Override
    public String toString() {
        return "StudyGroupDTO{" +
                "studyGroupId=" + studyGroupId +
                ", studyGroupType=" + studyGroupType +
                ", studyGroupCreatedDate=" + studyGroupCreatedDate +
                ", studyGroupMemberCount=" + studyGroupMemberCount +
                ", studyGroupActivationStatus=" + studyGroupActivationStatus +
                ", studyGroupStudyTime=" + studyGroupStudyTime +
                ", studyGroupContent='" + studyGroupContent + '\'' +
                ", studyGroupDeleteStatus=" + studyGroupDeleteStatus +
                '}';
    }
}
