package org.thisdote.communityfordevelopers.article.command;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.article.dto.ArticleDTO;

@Service
public class ArticleService1 {
    private final ModelMapper mapper;
    private final ArticleRepository articleRepository;

    public ArticleService1(ModelMapper mapper, ArticleRepository articleRepository) {
        this.mapper = mapper;
        this.articleRepository = articleRepository;
    }

    @Transactional
    public void registArticle(ArticleDTO newArticle){
        articleRepository.save(mapper.map(newArticle, ArticleEntity.class));
    }
}
