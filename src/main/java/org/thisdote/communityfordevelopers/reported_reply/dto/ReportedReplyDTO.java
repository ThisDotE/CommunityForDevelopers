package org.thisdote.communityfordevelopers.reported_reply.query;

import java.util.Date;

public class ReportedReplyDTO {
    private int reportReplyId;
    private int replyId;
    private int userCode;
    private Date reportDate;
    private String reportContent;
    private int reportReportedCount;
    private int reportType;

    public ReportedReplyDTO() {
    }

    public ReportedReplyDTO(int reportReplyId, int replyId, int userCode, Date reportDate, String reportContent, int reportReportedCount, int reportType) {

        this.reportReplyId = reportReplyId;
        this.replyId = replyId;
        this.userCode = userCode;
        this.reportDate = reportDate;
        this.reportContent = reportContent;
        this.reportReportedCount = reportReportedCount;
        this.reportType = reportType;
    }

    public int getReportReplyId() {
        return reportReplyId;
    }

    public void setReportReplyId(int reportReplyId) {
        this.reportReplyId = reportReplyId;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
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
        return "ReportedReplyDTO{" +
                "reportReplyId=" + reportReplyId +
                ", replyId=" + replyId +
                ", userCode=" + userCode +
                ", reportDate=" + reportDate +
                ", reportContent='" + reportContent + '\'' +
                ", reportReportedCount=" + reportReportedCount +
                ", reportType=" + reportType +
                '}';
    }
}
