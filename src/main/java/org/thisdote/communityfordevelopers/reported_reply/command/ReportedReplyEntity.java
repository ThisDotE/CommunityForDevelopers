package org.thisdote.communityfordevelopers.reported_reply.command;

import jakarta.persistence.*;
import jakarta.persistence.IdClass;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reported_reply")
@IdClass(ReportedReplyIdClass.class)
public class ReportedReplyEntity implements Serializable {

    @Id
    @Column(name = "reply_id")
    private int replyId;
    @Id
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

    public ReportedReplyEntity(int replyId, int userCode, Date reportDate, String reportContent, int reportReportedCount, int reportType) {
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
                "replyId=" + replyId +
                ", userCode=" + userCode +
                ", reportDate=" + reportDate +
                ", reportContent='" + reportContent + '\'' +
                ", reportReportedCount=" + reportReportedCount +
                ", reportType=" + reportType +
                '}';
    }
}
