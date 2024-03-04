package org.thisdote.communityfordevelopers.inquiry.query;

public class InquiryDTO {

    private int inquiryId;
    private int inquiryCategory;
    private String inquiryTitle;
    private String inquiryContent;
    private String inquiryCreateDate;
    private String inquiryLastUpdateDate;
    private int inquiryStatus;
    private int userCode;

    public InquiryDTO() {
    }

    public InquiryDTO(int inquiryId, int inquiryCategory, String inquiryTitle, String inquiryContent, String inquiryCreateDate, String inquiryLastUpdateDate, int inquiryStatus, int userCode) {
        this.inquiryId = inquiryId;
        this.inquiryCategory = inquiryCategory;
        this.inquiryTitle = inquiryTitle;
        this.inquiryContent = inquiryContent;
        this.inquiryCreateDate = inquiryCreateDate;
        this.inquiryLastUpdateDate = inquiryLastUpdateDate;
        this.inquiryStatus = inquiryStatus;
        this.userCode = userCode;
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

    public String getInquiryCreateDate() {
        return inquiryCreateDate;
    }

    public void setInquiryCreateDate(String inquiryCreateDate) {
        this.inquiryCreateDate = inquiryCreateDate;
    }

    public String getInquiryLastUpdateDate() {
        return inquiryLastUpdateDate;
    }

    public void setInquiryLastUpdateDate(String inquiryLastUpdateDate) {
        this.inquiryLastUpdateDate = inquiryLastUpdateDate;
    }

    public int getInquiryStatus() {
        return inquiryStatus;
    }

    public void setInquiryStatus(int inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "InquiryDTO{" +
                "inquiryId=" + inquiryId +
                ", inquiryCategory=" + inquiryCategory +
                ", inquiryTitle='" + inquiryTitle + '\'' +
                ", inquiryContent='" + inquiryContent + '\'' +
                ", inquiryCreateDate='" + inquiryCreateDate + '\'' +
                ", inquiryLastUpdateDate='" + inquiryLastUpdateDate + '\'' +
                ", inquiryStatus=" + inquiryStatus +
                ", userCode=" + userCode +
                '}';
    }
}
