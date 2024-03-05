package org.thisdote.communityfordevelopers.reported_reply.query;

import org.apache.ibatis.annotations.Mapper;
import org.thisdote.communityfordevelopers.reported_reply.DTO.ReportedReplyDTO;

import java.util.List;

@Mapper
public interface ReportedReplyMapper {
    List<ReportedReplyDTO> selectAllReportedReply();
}
