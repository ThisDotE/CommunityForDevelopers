package org.thisdote.communityfordevelopers.reported_reply.command;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "reported_reply")
public class ReportedReplyEntity {

    @Id
    @Column(name = "report_reply_id")
    private int reportReplyId;

    @Column(name = "reply_id")
    private int replyId;

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

    public ReportedReplyEntity() {
    }

    public ReportedReplyEntity(int reportReplyId, int replyId, int userCode, Date reportDate, String reportContent, int reportReportedCount, int reportType) {
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
        return "ReportedReplyEntity{" +
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
