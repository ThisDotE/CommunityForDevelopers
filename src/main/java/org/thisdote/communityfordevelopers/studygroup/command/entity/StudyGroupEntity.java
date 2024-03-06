package org.thisdote.communityfordevelopers.studygroup.command.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "studygroup")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudyGroupEntity {

    @Id
    @Column(name = "studygroup_id")
    private int studyGroupId;

    @Column(name = "studygroup_type")
    private int studyGroupType;

    @Column(name = "studygroup_created_date")
    private Date studyGroupCreatedDate;

    @Column(name = "studygroup_member_count")
    private int studyGroupMemberCount;

    @Column(name = "studygroup_activation_status")
    private int studyGroupActivationStatus;

    @Column(name = "studygroup_study_time")
    private Date studyGroupStudyTime;

    @Column(name = "studygroup_content")
    private String studyGroupContent;

    @Column(name = "studygroup_delete_status")
    private int studyGroupDeleteStatus;
}
