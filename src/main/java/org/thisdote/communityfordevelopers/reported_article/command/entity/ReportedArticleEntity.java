package org.thisdote.communityfordevelopers.reported_article.command.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "reported_article")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReportedArticleEntity {

    @Id
    @Column(name = "article_id")
    private int articleId;

    @Id
    @Column(name = "user_code")
    private int userCode;

    @Column(name = "report_date")
    private String reportDate;

    @Column(name = "report_content")
    private String reportContent;

    @Column(name = "report_reported_count")
    private int reportReportedCount;

    @Column(name = "report_type")
    private int reportType;
}
