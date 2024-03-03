package org.thisdote.communityfordevelopers.reply;

import org.apache.ibatis.annotations.Mapper;
import org.thisdote.communityfordevelopers.article.ArticleDTO;

import java.util.List;

@Mapper
public interface ReplyMapper {
    List<ReplyDTO> selectAllReply();

    List<ReplyDTO> selectReplyByUser(int userCode);
}
