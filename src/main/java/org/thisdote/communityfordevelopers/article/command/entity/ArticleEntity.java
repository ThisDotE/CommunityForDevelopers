package org.thisdote.communityfordevelopers.article.command.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "article")
public class ArticleEntity {

    @Id
    @Column(name = "article_id")
    private int articleId;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_content")
    private String articleContent;

    @Column(name = "article_category")
    private int articleCategory;

    @Column(name = "article_create_date")
    private String articleCreateDate;

    @Column(name = "article_last_update_date")
    private String articleLastUpdateDate;

    @Column(name = "article_view_count")
    private int articleViewCount;

    @Column(name = "article_like_count")
    private int articleLikeCount;

    @Column(name = "article_reply_count")
    private int articleReplyCount;

    @Column(name = "article_report_status")
    private int articleReportStatus;

    @Column(name = "studygroup_member_max_count")
    private int studyGroupMemberMaxCount;

    @Column(name = "studygroup_recruitment_deadline")
    private String studyGroupRecruitmentDeadline;

    @Column(name = "article_question_category")
    private int articleQuestionCategory;

    @Column(name = "user_code")
    private int userCode;

    @Column(name = "studygroup_id")
    private int studyGroupId;

    @Column(name = "studygroup_current_member_count")
    private int studyGroupCurrentMemberCount;

    @Column(name = "studygroup_pending_member_count")
    private int studyGroupPendingMemberCount;

    @Column(name = "article_delete_status")
    private int articleDeleteStatus;

    public ArticleEntity() {
    }

    public ArticleEntity(int articleId, String articleTitle, String articleContent, int articleCategory, String articleCreateDate, String articleLastUpdateDate, int articleViewCount, int articleLikeCount, int articleReplyCount, int articleReportStatus, int studyGroupMemberMaxCount, String studyGroupRecruitmentDeadline, int articleQuestionCategory, int userCode, int studyGroupId, int studyGroupCurrentMemberCount, int studyGroupPendingMemberCount, int articleDeleteStatus) {
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
        return "ArticleEntity{" +
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
                '}';
    }
}
