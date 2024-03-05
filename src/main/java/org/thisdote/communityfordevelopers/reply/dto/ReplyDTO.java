package org.thisdote.communityfordevelopers.reply.dto;

import java.util.Date;

public class ReplyDTO {

    private int replyId;                // pk..
    private int replyReportStatus;
    private String replyContent;
    private Date replyCreatedDate;
    private Date replyLastUpdateDate;
    private int replyLikeCount;
    private int replyDeleteStatus;
    private int userCode;               // fk..
    private int articleId;              // fk..

    public ReplyDTO() {
    }

    public ReplyDTO(int replyId, int replyReportStatus, String replyContent, Date replyCreatedDate, Date replyLastUpdateDate, int replyLikeCount, int replyDeleteStatus, int userCode, int articleId) {
        this.replyId = replyId;
        this.replyReportStatus = replyReportStatus;
        this.replyContent = replyContent;
        this.replyCreatedDate = replyCreatedDate;
        this.replyLastUpdateDate = replyLastUpdateDate;
        this.replyLikeCount = replyLikeCount;
        this.replyDeleteStatus = replyDeleteStatus;
        this.userCode = userCode;
        this.articleId = articleId;
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

    public int getReplyDeleteStatus() {
        return replyDeleteStatus;
    }

    public void setReplyDeleteStatus(int replyDeleteStatus) {
        this.replyDeleteStatus = replyDeleteStatus;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
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
                ", replyDeleteStatus=" + replyDeleteStatus +
                ", userCode=" + userCode +
                ", articleId=" + articleId +
                '}';
    }
}