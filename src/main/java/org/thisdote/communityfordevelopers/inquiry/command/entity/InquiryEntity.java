package org.thisdote.communityfordevelopers.inquiry.command.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="inquiry")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class InquiryEntity {
    @Id
    @Column(name="inquiry_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inquiryId;

    @Column(name="inquiry_category")
    private Integer inquiryCategory;

    @Column(name="inquiry_title")
    private String inquiryTitle;

    @Column(name="inquiry_content")
    private String inquiryContent;

    @Column(name="inquiry_create_date")
    private java.util.Date inquiryCreateDate;

    @Column(name="inquiry_last_update_date")
    private java.util.Date inquiryLastUpdateDate;

    @Column(name="inquiry_status")
    private Integer inquiryStatus;

    @Column(name="user_code")
    private Integer userCode;

}
