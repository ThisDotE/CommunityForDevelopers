package org.thisdote.communityfordevelopers.reported_article.dto;

import java.util.Date;

public class ReportedArticleDTO {
    private int reportArticleId;
    private int articleId;
    private int userCode;
    private Date reportDate;
    private String reportContent;
    private int reportReportedCount;
    private int reportType;

    public ReportedArticleDTO() {
    }

    public ReportedArticleDTO(int reportArticleId, int articleId, int userCode, Date reportDate, String reportContent, int reportReportedCount, int reportType) {
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
        return "ReportedArticleDTO{" +
                "reportArticleId=" + reportArticleId +
                ", articleId=" + articleId +
                ", userCode=" + userCode +
                ", reportDate='" + reportDate + '\'' +
                ", reportContent='" + reportContent + '\'' +
                ", reportReportedCount=" + reportReportedCount +
                ", reportType=" + reportType +
                '}';
    }
}
