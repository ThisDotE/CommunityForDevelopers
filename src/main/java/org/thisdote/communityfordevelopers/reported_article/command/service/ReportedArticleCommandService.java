package org.thisdote.communityfordevelopers.reported_article.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.reported_article.command.entity.ReportedArticleEntity;
import org.thisdote.communityfordevelopers.reported_article.command.repository.ReportedArticleRepository;
import org.thisdote.communityfordevelopers.reported_article.dto.ReportedArticleDTO;

@Service
public class ReportedArticleCommandService {

    private final ModelMapper mapper;
    private final ReportedArticleRepository reportedArticleRepository;

    @Autowired
    public ReportedArticleCommandService(ModelMapper mapper, ReportedArticleRepository reportedArticleRepository) {
        this.mapper = mapper;
        this.reportedArticleRepository = reportedArticleRepository;
    }

    @Transactional
    public void registReportedArticle(ReportedArticleDTO reportedArticle) {
        reportedArticleRepository.save(mapper.map(reportedArticle, ReportedArticleEntity.class));
    }
}
