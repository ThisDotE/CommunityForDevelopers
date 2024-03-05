package org.thisdote.communityfordevelopers.article.command;

import jakarta.persistence.*;

@Entity
@Table(name = "article")
public class ArticleEntity {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private int studygroupMemberMaxCount;
    @Column(name = "studygroup_recruitment_deadline")
    private String studygroupRecruitmentDeadline;
    @Column(name = "article_question_category")
    private String articleQuestionCategory;
    @Column(name = "user_code")
    private int userCode;
    @Column(name = "studygroup_id")
    private int studygroupId;
    @Column(name = "studygroup_current_member_count")
    private int studygroupCurrentMemberCount;
    @Column(name = "studygroup_pending_member_count")
    private int studygroupPendingMemberCount;

    public ArticleEntity() {
    }

    public ArticleEntity(int articleId, String articleTitle
            , String articleContent, int articleCategory, String articleCreateDate
            , String articleLastUpdateDate, int articleViewCount, int articleLikeCount
            , int articleReplyCount, int articleReportStatus, int studygroupMemberMaxCount
            , String studygroupRecruitmentDeadline, String articleQuestionCategory
            , int userCode, int studygroupId, int studygroupCurrentMemberCount
            , int studygroupPendingMemberCount) {
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

    public int getUserCode() {
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
                ", studygroupMemberMaxCount=" + studygroupMemberMaxCount +
                ", studygroupRecruitmentDeadline='" + studygroupRecruitmentDeadline + '\'' +
                ", articleQuestionCategory='" + articleQuestionCategory + '\'' +
                ", userCode=" + userCode +
                ", studygroupId=" + studygroupId +
                ", studygroupCurrentMemberCount=" + studygroupCurrentMemberCount +
                ", studygroupPendingMemberCount=" + studygroupPendingMemberCount +
                '}';
    }
}
