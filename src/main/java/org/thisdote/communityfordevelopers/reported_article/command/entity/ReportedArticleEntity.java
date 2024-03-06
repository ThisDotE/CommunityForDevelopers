package org.thisdote.communityfordevelopers.reported_article.command.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reported_article")
public class ReportedArticleEntity {

    @Id
    @Column(name = "report_article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reportArticleId;

    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "user_code")
    private Integer userCode;

    @Column(name = "report_date")
    private Date reportDate;

    @Column(name = "report_content")
    private String reportContent;

    @Column(name = "report_reported_count")
    private Integer reportReportedCount;

    @Column(name = "report_type")
    private Integer reportType;

    public ReportedArticleEntity() {
    }

    public ReportedArticleEntity(
            Integer reportArticleId,
            Integer articleId,
            Integer userCode,
            Date reportDate,
            String reportContent,
            Integer reportReportedCount,
            Integer reportType
    ) {
        this.reportArticleId = reportArticleId;
        this.articleId = articleId;
        this.userCode = userCode;
        this.reportDate = reportDate;
        this.reportContent = reportContent;
        this.reportReportedCount = reportReportedCount;
        this.reportType = reportType;
    }

    public Integer getReportArticleId() {
        return reportArticleId;
    }

    public void setReportArticleId(int reportArticleId) {
        this.reportArticleId = reportArticleId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Integer getReportReportedCount() {
        return reportReportedCount;
    }

    public void setReportReportedCount(int reportReportedCount) {
        this.reportReportedCount = reportReportedCount;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(int reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "ReportedArticleEntity{" +
                "reportArticleId=" + reportArticleId +
                ", articleId=" + articleId +
                ", userCode=" + userCode +
                ", reportDate=" + reportDate +
                ", reportContent='" + reportContent + '\'' +
                ", reportReportedCount=" + reportReportedCount +
                ", reportType=" + reportType +
                '}';
    }
}
