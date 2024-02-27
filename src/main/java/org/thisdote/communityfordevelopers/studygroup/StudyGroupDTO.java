package org.thisdote.communityfordevelopers.studygroup;

import java.util.Date;

public class StudyGroupDTO {
    /*studygroup_id,
    studygroup_type,
    studygroup_create_date,
    studygroup_member_count,
    studygroup_activation_status,
    studygroup_study_time,
    studygroup_content*/
    /*1,
    '영어 시험 스터디',
    '2011-08-20',
    54,
    1,
    '2011-08-27',
    '다다음주 IElTS 시험 전주에 Experts 9단계를 위한 개인 꿀팁들 공유하실 분들 모집합니다.'*/

    private int studyGroupId;
    private String studyGroupType;
    private Date studyGroupCreatedDate;
    private int studyGroupMemberCount;
    private int studyGroupActivationStatus;
    private Date studyGroupStudyTime;
    private String studyGroupContent;

    public StudyGroupDTO() {
    }

    public StudyGroupDTO(
            String studyGroupType,
            int studyGroupId,
            Date studyGroupCreatedDate,
            int studyGroupMemberCount,
            int studyGroupActivationStatus,
            Date studyGroupStudyTime,
            String studyGroupContent
    ) {
        this.studyGroupType = studyGroupType;
        this.studyGroupId = studyGroupId;
        this.studyGroupCreatedDate = studyGroupCreatedDate;
        this.studyGroupMemberCount = studyGroupMemberCount;
        this.studyGroupActivationStatus = studyGroupActivationStatus;
        this.studyGroupStudyTime = studyGroupStudyTime;
        this.studyGroupContent = studyGroupContent;
    }

    public String getStudyGroupType() {
        return studyGroupType;
    }

    public void setStudyGroupType(String studyGroupType) {
        this.studyGroupType = studyGroupType;
    }

    public int getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
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

    @Override
    public String toString() {
        return "StudyGroupDTO{" +
                "studyGroupType='" + studyGroupType + '\'' +
                ", studyGroupId=" + studyGroupId +
                ", studyGroupCreatedDate=" + studyGroupCreatedDate +
                ", studyGroupMemberCount=" + studyGroupMemberCount +
                ", studyGroupActivationStatus=" + studyGroupActivationStatus +
                ", studyGroupStudyTime=" + studyGroupStudyTime +
                ", studyGroupContent='" + studyGroupContent + '\'' +
                '}';
    }
}
