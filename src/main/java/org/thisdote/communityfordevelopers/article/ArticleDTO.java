package org.thisdote.communityfordevelopers.article;

import org.thisdote.communityfordevelopers.reply.ReplyDTO;

public class ArticleDTO {

    private int articleId;
    private String articleTitle;
    private String articleContent;
    private String articleCategory;
    private String articleCreateDate;
    private String articleLastUpdateDate;
    private int articleViewCount;
    private int articleLikeCount;
    private int articleReplyCount;
    private int articleReportStatus;
    private int studygroupMemberMaxCount;
    private String studygroupRecruitmentDeadline;
    private String articleQuestionCategory;
    private int userCode;
    private int studygroupId;
    private int studygroupCurrentMemberCount;
    private int studygroupPendingMemberCount;
    private ReplyDTO replyDTOList;


    public ArticleDTO() {
    }

    public ArticleDTO(int articleId, String articleTitle, String articleContent, String articleCategory, String articleCreateDate, String articleLastUpdateDate, int articleViewCount, int articleLikeCount, int articleReplyCount, int articleReportStatus, int studygroupMemberMaxCount, String studygroupRecruitmentDeadline, String articleQuestionCategory, int userCode, int studygroupId, int studygroupCurrentMemberCount, int studygroupPendingMemberCount, ReplyDTO replyDTOList) {
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
        this.studygroupMemberMaxCount = studygroupMemberMaxCount;
        this.studygroupRecruitmentDeadline = studygroupRecruitmentDeadline;
        this.articleQuestionCategory = articleQuestionCategory;
        this.userCode = userCode;
        this.studygroupId = studygroupId;
        this.studygroupCurrentMemberCount = studygroupCurrentMemberCount;
        this.studygroupPendingMemberCount = studygroupPendingMemberCount;
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

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
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

    public int getStudygroupMemberMaxCount() {
        return studygroupMemberMaxCount;
    }

    public void setStudygroupMemberMaxCount(int studygroupMemberMaxCount) {
        this.studygroupMemberMaxCount = studygroupMemberMaxCount;
    }

    public String getStudygroupRecruitmentDeadline() {
        return studygroupRecruitmentDeadline;
    }

    public void setStudygroupRecruitmentDeadline(String studygroupRecruitmentDeadline) {
        this.studygroupRecruitmentDeadline = studygroupRecruitmentDeadline;
    }

    public String getArticleQuestionCategory() {
        return articleQuestionCategory;
    }

    public void setArticleQuestionCategory(String articleQuestionCategory) {
        this.articleQuestionCategory = articleQuestionCategory;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getStudygroupId() {
        return studygroupId;
    }

    public void setStudygroupId(int studygroupId) {
        this.studygroupId = studygroupId;
    }

    public int getStudygroupCurrentMemberCount() {
        return studygroupCurrentMemberCount;
    }

    public void setStudygroupCurrentMemberCount(int studygroupCurrentMemberCount) {
        this.studygroupCurrentMemberCount = studygroupCurrentMemberCount;
    }

    public int getStudygroupPendingMemberCount() {
        return studygroupPendingMemberCount;
    }

    public void setStudygroupPendingMemberCount(int studygroupPendingMemberCount) {
        this.studygroupPendingMemberCount = studygroupPendingMemberCount;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleCategory='" + articleCategory + '\'' +
                ", articleCreateDate='" + articleCreateDate + '\'' +
                ", articleLastUpdateDate='" + articleLastUpdateDate + '\'' +
                ", articleViewCount=" + articleViewCount +
                ", articleLikeCount=" + articleLikeCount +
                ", articleReplyCount=" + articleReplyCount +
                ", articleReportStatus=" + articleReportStatus +
                ", studygroupMemberMaxCount=" + studygroupMemberMaxCount +
                ", studygroupRecruitmentDeadline='" + studygroupRecruitmentDeadline + '\'' +
                ", articleQuestionCategory='" + articleQuestionCategory + '\'' +
                ", userCode=" + userCode +
                ", studygroupId=" + studygroupId +
                ", studygroupCurrentMemberCount=" + studygroupCurrentMemberCount +
                ", studygroupPendingMemberCount=" + studygroupPendingMemberCount +
                ", replyDTOList=" + replyDTOList +
                '}';
    }
}
