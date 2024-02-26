package org.thisdote.communityfordevelopers.reported_article;

public class ReportedArticleDTO {
    private int articleId;
    private int userCode;
    private String reportDate;
    private String reportContent;
    private int reportReportedCount;
    private int reportType;

    public ReportedArticleDTO() {
    }

    public ReportedArticleDTO(int articleId, int userCode, String reportDate, String reportContent, int reportReportedCount, int reportType) {
        this.articleId = articleId;
        this.userCode = userCode;
        this.reportDate = reportDate;
        this.reportContent = reportContent;
        this.reportReportedCount = reportReportedCount;
        this.reportType = reportType;
    }

    public int getArticleId() {
        return articleId;
    }

    public int getUserCode() {
        return userCode;
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getReportContent() {
        return reportContent;
    }

    public int getReportReportedCount() {
        return reportReportedCount;
    }

    public int getReportType() {
        return reportType;
    }

    @Override
    public String toString() {
        return "ReportedArticleDTO{" +
                "articleId=" + articleId +
                ", userCode=" + userCode +
                ", reportDate='" + reportDate + '\'' +
                ", reportContent='" + reportContent + '\'' +
                ", reportReportedCount=" + reportReportedCount +
                ", reportType=" + reportType +
                '}';
    }
}
