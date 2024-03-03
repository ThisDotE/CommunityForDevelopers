package org.thisdote.communityfordevelopers.reply;

import java.util.Date;

public class ReplyDTO {

    private int replyId;                // pk..
    private int replyReportStatus;
    private String replyContent;
    private Date replyCreatedDate;
    private Date replyLastUpdateDate;
    private int replyLikeCount;
    private int userCode;               // fk..

    public ReplyDTO() {
    }

    public ReplyDTO(
            int replyId,
            int replyReportStatus,
            String replyContent,
            Date replyCreatedDate,
            Date replyLastUpdateDate,
            int replyLikeCount,
            int userCode
    ) {
        this.replyId = replyId;
        this.replyReportStatus = replyReportStatus;
        this.replyContent = replyContent;
        this.replyCreatedDate = replyCreatedDate;
        this.replyLastUpdateDate = replyLastUpdateDate;
        this.replyLikeCount = replyLikeCount;
        this.userCode = userCode;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getReplyReportStatus() {
        return replyReportStatus;
    }

    public void setReplyReportStatus(int replyReportStatus) {
        this.replyReportStatus = replyReportStatus;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getReplyCreatedDate() {
        return replyCreatedDate;
    }

    public void setReplyCreatedDate(Date replyCreatedDate) {
        this.replyCreatedDate = replyCreatedDate;
    }

    public Date getReplyLastUpdateDate() {
        return replyLastUpdateDate;
    }

    public void setReplyLastUpdateDate(Date replyLastUpdateDate) {
        this.replyLastUpdateDate = replyLastUpdateDate;
    }

    public int getReplyLikeCount() {
        return replyLikeCount;
    }

    public void setReplyLikeCount(int replyLikeCount) {
        this.replyLikeCount = replyLikeCount;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "ReplyDTO{" +
                "replyId=" + replyId +
                ", replyReportStatus=" + replyReportStatus +
                ", replyContent='" + replyContent + '\'' +
                ", replyCreatedDate=" + replyCreatedDate +
                ", replyLastUpdateDate=" + replyLastUpdateDate +
                ", replyLikeCount=" + replyLikeCount +
                ", userCode=" + userCode +
                '}';
    }
}
