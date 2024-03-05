package org.thisdote.communityfordevelopers.inquiry.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class InquiryCommandDTO {

    private int inquiryId;
    private int inquiryCategory;
    private String inquiryTitle;
    private String inquiryContent;
    private java.util.Date inquiryCreateDate;
    private java.util.Date inquiryLastUpdateDate;
    private int inquiryStatus;
    private int userCode;

}
