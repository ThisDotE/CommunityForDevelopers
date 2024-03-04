package org.thisdote.communityfordevelopers.reported_reply.query;

import java.util.Date;

public class ReportedReplyDTO {
    private int replyId;
    private int userCode;
    private Date reportDate;
    private String reportContent;
    private int reportReportedCount;
    private int reportType;

    public ReportedReplyDTO() {
    }

    public ReportedReplyDTO(int replyId, int userCode, Date reportDate, String reportContent, int reportReportedCount, int reportType) {


        this.replyId = replyId;
        this.userCode = userCode;
        this.reportDate = reportDate;
        this.reportContent = reportContent;
        this.reportReportedCount = reportReportedCount;
        this.reportType = reportType;
    }

    public int getReplyId() {
        return replyId;
    }

    public int getUserCode() {
        return userCode;
    }

    public Date getReportDate() {
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
        return "ReportedReplyDTO{" +
                "replyId=" + replyId +
                ", userCode=" + userCode +
                ", reportDate=" + reportDate +
                ", reportContent='" + reportContent + '\'' +
                ", reportReportedCount=" + reportReportedCount +
                ", reportType=" + reportType +
                '}';
    }
}
