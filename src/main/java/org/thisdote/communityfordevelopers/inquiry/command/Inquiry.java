package org.thisdote.communityfordevelopers.inquiry.command;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="inquiry")
public class Inquiry {
    @Id
    @Column(name="inquiry_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inquiryId;

    @Column(name="inquiry_category")
    private int inquiryCategory;

    @Column(name="inquiry_title")
    private String inquiryTitle;

    @Column(name="inquiry_content")
    private String inquiryContent;

    @Column(name="inquiry_create_date")
    private java.util.Date inquiryCreateDate;

    @Column(name="inquiry_last_update_date")
    private java.util.Date inquiryLastUpdateDate;

    @Column(name="inquiry_status")
    private int inquiryStatus;

    public Inquiry() {
    }

    public Inquiry(int inquiryId, int inquiryCategory, String inquiryTitle, String inquiryContent, Date inquiryCreateDate, Date inquiryLastUpdateDate, int inquiryStatus) {
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
        return "Inquiry{" +
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
