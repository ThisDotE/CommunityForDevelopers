package org.thisdote.communityfordevelopers.reply.query;

import org.apache.ibatis.annotations.Mapper;
import org.thisdote.communityfordevelopers.reply.dto.ReplyDTO;

import java.util.List;

@Mapper
public interface ReplyMapper {
    List<ReplyDTO> selectAllReply();

    List<ReplyDTO> selectReplyByUser(int userCode);

    ReplyDTO selectReplyId(int replyId);
}
