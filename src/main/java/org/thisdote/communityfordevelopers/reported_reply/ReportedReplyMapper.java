package org.thisdote.communityfordevelopers.reported_reply;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ReportedReplyMapper {
    List<ReportedReplyDTO> selectAllReportedReply();
}
