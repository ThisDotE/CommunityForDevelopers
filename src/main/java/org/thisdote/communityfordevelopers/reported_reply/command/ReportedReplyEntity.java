package org.thisdote.communityfordevelopers.reported_reply.command;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "reported_reply")
@Data
public class ReportedReplyEntity {

    @Id
    @Column(name = "report_reply_id")
    private Integer reportReplyId;

    @Column(name = "reply_id")
    private Integer replyId;

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
}
