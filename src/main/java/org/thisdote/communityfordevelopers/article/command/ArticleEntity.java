package org.thisdote.communityfordevelopers.article.command;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "article")
@Data
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
    @Column(name = "article_delete_status")
    private int articleDeleteStatus;
}
