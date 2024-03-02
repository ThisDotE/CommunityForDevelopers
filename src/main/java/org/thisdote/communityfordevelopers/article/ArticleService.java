package org.thisdote.communityfordevelopers.article;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.reply.ReplyDTO;
import org.thisdote.communityfordevelopers.reply.ReplyMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    public List<ArticleDTO> selectArticleByUser(int userCode) {
        return sqlSession.getMapper(ArticleMapper.class).selectArticleByUser(userCode);
    }

    public List<ArticleDTO> selectStudyArticleInfo(int articleId) {return sqlSession.getMapper(ArticleMapper.class).selectStudyArticleInfo(articleId);}

    public List<ArticleDTO> selectArticleByCriteria(Map<String, Object> criteria) {
        return sqlSession.getMapper(ArticleMapper.class).selectArticleByCriteria(criteria);
    }

    public List<ArticleDTO> selectArticleByCategory(int articleCategory) {
        return sqlSession.getMapper(ArticleMapper.class).selectArticleByCategory(articleCategory);
    }
}

