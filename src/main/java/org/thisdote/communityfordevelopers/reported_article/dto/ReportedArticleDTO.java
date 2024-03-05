package org.thisdote.communityfordevelopers.reported_article.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReportedArticleDTO {
    private int articleId;
    private int userCode;
    private String reportDate;
    private String reportContent;
    private int reportReportedCount;
    private int reportType;
}
