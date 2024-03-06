package org.thisdote.communityfordevelopers.user.command.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserEntity {

    @Id
    @Column(name = "user_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userCode;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_birthday")
    private Date userBirthday;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_studygroup_status")
    private Integer userStudyGroupStatus;

    @Column(name = "user_regist_date")
    private Date userRegistDate;

    @Column(name = "user_info_update_date")
    private Date userInfoUpdateDate;

    @Column(name = "user_grade")
    private Integer userGrade;

    @Column(name = "user_resign_status")
    private Integer userResignStatus;

}
