package org.thisdote.communityfordevelopers.studygroup.command.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="studygroup")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudyGroupEntity {

    @Id
    @Column(name="studygroup_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int studygroupId;

    @Column(name="studygroup_type")
    private int studygroupType;

    @Column(name="studygroup_create_date")
    private java.util.Date studygroupCreateDate;

    @Column(name="studygroup_member_count")
    private int studygroupMemberCount;

    @Column(name="studygroup_activation_status")
    private int studygroupActivationStatus;

    @Column(name="studygroup_study_time")
    private java.util.Date studygroupStudyTime;

    @Column(name="studygroup_content")
    private String studygroupContent;

    @Column(name="studygroup_delete_status")
    private int studygroupDeleteStatus;
}
