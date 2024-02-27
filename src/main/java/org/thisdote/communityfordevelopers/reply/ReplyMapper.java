package org.thisdote.communityfordevelopers.reply;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    List<ReplyDTO> selectAllReply();
}
