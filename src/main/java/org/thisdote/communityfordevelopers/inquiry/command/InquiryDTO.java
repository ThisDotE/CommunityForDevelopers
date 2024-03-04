package org.thisdote.communityfordevelopers.inquiry.command;

import java.util.Date;

public class InquiryDTO {

    private int inquiryId;
    private int inquiryCategory;
    private String inquiryTitle;
    private String inquiryContent;
    private java.util.Date inquiryCreateDate;
    private java.util.Date inquiryLastUpdateDate;
    private int inquiryStatus;

    public InquiryDTO() {
    }

    public InquiryDTO(int inquiryId, int inquiryCategory, String inquiryTitle, String inquiryContent, Date inquiryCreateDate, Date inquiryLastUpdateDate, int inquiryStatus) {
        this.inquiryId = inquiryId;
        this.inquiryCategory = inquiryCategory;
        this.inquiryTitle = inquiryTitle;
        this.inquiryContent = inquiryContent;
        this.inquiryCreateDate = inquiryCreateDate;
        this.inquiryLastUpdateDate = inquiryLastUpdateDate;
        this.inquiryStatus = inquiryStatus;
    }

    public int getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(int inquiryId) {
        this.inquiryId = inquiryId;
    }

    public int getInquiryCategory() {
        return inquiryCategory;
    }

    public void setInquiryCategory(int inquiryCategory) {
        this.inquiryCategory = inquiryCategory;
    }

    public String getInquiryTitle() {
        return inquiryTitle;
    }

    public void setInquiryTitle(String inquiryTitle) {
        this.inquiryTitle = inquiryTitle;
    }

    public String getInquiryContent() {
        return inquiryContent;
    }

    public void setInquiryContent(String inquiryContent) {
        this.inquiryContent = inquiryContent;
    }

    public Date getInquiryCreateDate() {
        return inquiryCreateDate;
    }

    public void setInquiryCreateDate(Date inquiryCreateDate) {
        this.inquiryCreateDate = inquiryCreateDate;
    }

    public Date getInquiryLastUpdateDate() {
        return inquiryLastUpdateDate;
    }

    public void setInquiryLastUpdateDate(Date inquiryLastUpdateDate) {
        this.inquiryLastUpdateDate = inquiryLastUpdateDate;
    }

    public int getInquiryStatus() {
        return inquiryStatus;
    }

    public void setInquiryStatus(int inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    @Override
    public String toString() {
        return "InquiryDTO{" +
                "inquiryId=" + inquiryId +
                ", inquiryCategory=" + inquiryCategory +
                ", inquiryTitle='" + inquiryTitle + '\'' +
                ", inquiryContent='" + inquiryContent + '\'' +
                ", inquiryCreateDate=" + inquiryCreateDate +
                ", inquiryLastUpdateDate=" + inquiryLastUpdateDate +
                ", inquiryStatus=" + inquiryStatus +
                '}';
    }
}
