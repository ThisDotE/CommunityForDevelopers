package org.thisdote.communityfordevelopers.article;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private final SqlSessionTemplate sqlSession;

    @Autowired
    public ArticleService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<ArticleDTO> selectAllArticle() {
        return sqlSession.getMapper(ArticleMapper.class).selectAllArticle();
    }

    public List<ArticleDTO> selectAllQuestionArticle() {
        return sqlSession.getMapper(ArticleMapper.class).selectAllQuestionArticle();
    }
}
