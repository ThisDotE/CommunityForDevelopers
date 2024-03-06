package org.thisdote.communityfordevelopers.article.dto;

import org.thisdote.communityfordevelopers.reply.dto.ReplyDTO;

public class ArticleDTO {

    private int articleId;
    private String articleTitle;
    private String articleContent;
    private int articleCategory;
    private String articleCreateDate;
    private String articleLastUpdateDate;
    private int articleViewCount;
    private int articleLikeCount;
    private int articleReplyCount;
    private int articleReportStatus;
    private int studyGroupMemberMaxCount;
    private String studyGroupRecruitmentDeadline;
    private int articleQuestionCategory;
    private int userCode;
    private int studyGroupId;
    private int studyGroupCurrentMemberCount;
    private int studyGroupPendingMemberCount;
    private int articleDeleteStatus;
    private ReplyDTO replyDTOList;


    public ArticleDTO() {
    }

    public ArticleDTO(int articleId, String articleTitle, String articleContent, int articleCategory, String articleCreateDate, String articleLastUpdateDate, int articleViewCount, int articleLikeCount, int articleReplyCount, int articleReportStatus, int studyGroupMemberMaxCount, String studyGroupRecruitmentDeadline, int articleQuestionCategory, int userCode, int studyGroupId, int studyGroupCurrentMemberCount, int studyGroupPendingMemberCount, int articleDeleteStatus, ReplyDTO replyDTOList) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleCategory = articleCategory;
        this.articleCreateDate = articleCreateDate;
        this.articleLastUpdateDate = articleLastUpdateDate;
        this.articleViewCount = articleViewCount;
        this.articleLikeCount = articleLikeCount;
        this.articleReplyCount = articleReplyCount;
        this.articleReportStatus = articleReportStatus;
        this.studyGroupMemberMaxCount = studyGroupMemberMaxCount;
        this.studyGroupRecruitmentDeadline = studyGroupRecruitmentDeadline;
        this.articleQuestionCategory = articleQuestionCategory;
        this.userCode = userCode;
        this.studyGroupId = studyGroupId;
        this.studyGroupCurrentMemberCount = studyGroupCurrentMemberCount;
        this.studyGroupPendingMemberCount = studyGroupPendingMemberCount;
        this.articleDeleteStatus = articleDeleteStatus;
        this.replyDTOList = replyDTOList;
    }

    public ReplyDTO getReplyDTOList() {
        return replyDTOList;
    }

    public void setReplyDTOList(ReplyDTO replyDTOList) {
        this.replyDTOList = replyDTOList;
    }

    public ArticleDTO(int articleId, String articleTitle) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public int getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(int articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(String articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public String getArticleLastUpdateDate() {
        return articleLastUpdateDate;
    }

    public void setArticleLastUpdateDate(String articleLastUpdateDate) {
        this.articleLastUpdateDate = articleLastUpdateDate;
    }

    public int getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(int articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public int getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(int articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public int getArticleReplyCount() {
        return articleReplyCount;
    }

    public void setArticleReplyCount(int articleReplyCount) {
        this.articleReplyCount = articleReplyCount;
    }

    public int getArticleReportStatus() {
        return articleReportStatus;
    }

    public void setArticleReportStatus(int articleReportStatus) {
        this.articleReportStatus = articleReportStatus;
    }

    public int getStudyGroupMemberMaxCount() {
        return studyGroupMemberMaxCount;
    }

    public void setStudyGroupMemberMaxCount(int studyGroupMemberMaxCount) {
        this.studyGroupMemberMaxCount = studyGroupMemberMaxCount;
    }

    public String getStudyGroupRecruitmentDeadline() {
        return studyGroupRecruitmentDeadline;
    }

    public void setStudyGroupRecruitmentDeadline(String studyGroupRecruitmentDeadline) {
        this.studyGroupRecruitmentDeadline = studyGroupRecruitmentDeadline;
    }

    public int getArticleQuestionCategory() {
        return articleQuestionCategory;
    }

    public void setArticleQuestionCategory(int articleQuestionCategory) {
        this.articleQuestionCategory = articleQuestionCategory;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    public int getStudyGroupCurrentMemberCount() {
        return studyGroupCurrentMemberCount;
    }

    public void setStudyGroupCurrentMemberCount(int studyGroupCurrentMemberCount) {
        this.studyGroupCurrentMemberCount = studyGroupCurrentMemberCount;
    }

    public int getStudyGroupPendingMemberCount() {
        return studyGroupPendingMemberCount;
    }

    public void setStudyGroupPendingMemberCount(int studyGroupPendingMemberCount) {
        this.studyGroupPendingMemberCount = studyGroupPendingMemberCount;
    }

    public int getArticleDeleteStatus() {
        return articleDeleteStatus;
    }

    public void setArticleDeleteStatus(int articleDeleteStatus) {
        this.articleDeleteStatus = articleDeleteStatus;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleCategory=" + articleCategory +
                ", articleCreateDate='" + articleCreateDate + '\'' +
                ", articleLastUpdateDate='" + articleLastUpdateDate + '\'' +
                ", articleViewCount=" + articleViewCount +
                ", articleLikeCount=" + articleLikeCount +
                ", articleReplyCount=" + articleReplyCount +
                ", articleReportStatus=" + articleReportStatus +
                ", studyGroupMemberMaxCount=" + studyGroupMemberMaxCount +
                ", studyGroupRecruitmentDeadline='" + studyGroupRecruitmentDeadline + '\'' +
                ", articleQuestionCategory=" + articleQuestionCategory +
                ", userCode=" + userCode +
                ", studyGroupId=" + studyGroupId +
                ", studyGroupCurrentMemberCount=" + studyGroupCurrentMemberCount +
                ", studyGroupPendingMemberCount=" + studyGroupPendingMemberCount +
                ", articleDeleteStatus=" + articleDeleteStatus +
                ", replyDTOList=" + replyDTOList +
                '}';
    }
}
