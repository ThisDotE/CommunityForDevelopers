package org.thisdote.communityfordevelopers.reported_article.command;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "reported_article")
public class ReportedArticleEntity {

    @Id
    @Column(name = "report_article_id")
    private int reportArticleId;

    @Column(name = "article_id")
    private int articleId;

    @Column(name = "user_code")
    private int userCode;

    @Column(name = "report_date")
    private Date reportDate;

    @Column(name = "report_content")
    private String reportContent;

    @Column(name = "report_reported_count")
    private int reportReportedCount;

    @Column(name = "report_type")
    private int reportType;

    public ReportedArticleEntity() {
    }

    public ReportedArticleEntity(int reportArticleId, int articleId, int userCode, Date reportDate, String reportContent, int reportReportedCount, int reportType) {
        this.reportArticleId = reportArticleId;
        this.articleId = articleId;
        this.userCode = userCode;
        this.reportDate = reportDate;
        this.reportContent = reportContent;
        this.reportReportedCount = reportReportedCount;
        this.reportType = reportType;
    }

    public int getReportArticleId() {
        return reportArticleId;
    }

    public void setReportArticleId(int reportArticleId) {
        this.reportArticleId = reportArticleId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserCode() {
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

    public int getReportReportedCount() {
        return reportReportedCount;
    }

    public void setReportReportedCount(int reportReportedCount) {
        this.reportReportedCount = reportReportedCount;
    }

    public int getReportType() {
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
