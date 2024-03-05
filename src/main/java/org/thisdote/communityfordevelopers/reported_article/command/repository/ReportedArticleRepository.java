package org.thisdote.communityfordevelopers.reported_article.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thisdote.communityfordevelopers.reported_article.command.entity.ReportedArticleEntity;

@Repository
public interface ReportedArticleRepository extends JpaRepository<ReportedArticleEntity, Integer> {
}
