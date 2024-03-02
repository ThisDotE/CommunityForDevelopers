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

    public List<ArticleDTO> selectArticleByUser(int userCode) {
        return sqlSession.getMapper(ArticleMapper.class).selectArticleByUser(userCode);
    }

    public List<ArticleDTO> selectArticleByCategory(String category) {
        return sqlSession.getMapper(ArticleMapper.class).selectArticleByCategory(category);
    }

    public List<ArticleDTO> selectTitleArticle(String title){return  sqlSession.getMapper(ArticleMapper.class).selectTitleArticle(title);}

    public List<ArticleDTO> selectCategoryArticle(String category){return sqlSession.getMapper(ArticleMapper.class).selectCategoryArticle(category);}

    public List<ArticleDTO> selectStudyArticleInfo(int articleId) {return sqlSession.getMapper(ArticleMapper.class).selectStudyArticleInfo(articleId);}

}

/* TODO
 *  1. 회원 별 작성 게시글 전체 조회 - 마이페이지에서 사용
 *      -> selectArticleByUser(int userCode) - ok!!
 *  2. 전체 게시글 조회 - 홈 화면에서 사용
 *      -> selectAllArticle() - ok!!
 *  2. 게시글 유형 별 전체 조회 (정보 공유, 질문, 스터디 구인) - 홈 화면에서 사용
 *      -> selectArticleByCategory(String category) - ok!!
 *      -> 카테고리 데이터 타입 enum 또는 int로 변환하는게 좋을 듯
 *  3. 게시글 제목, 작성자 등의 기준으로 조회
 *      -> selectArticleByCriteria(Criteria criteria) - to be developed
 *      -> (제목, 작성자, 제목 + 작성자) + 게시글 유형
 *  작성자 표현을 위해 user 테이블과 join 필요. userId로 표현? (userNickname 추가 여부 검토 필요)
 * */
