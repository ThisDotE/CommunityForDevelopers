package org.thisdote.communityfordevelopers.reported_reply.command;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.reported_reply.dto.ReportedReplyDTO;

@Service
public class ReportedReplyService1 {
    private final ModelMapper mapper;
    private final ReportedReplyRepository reportedReplyRepository;

    @Autowired
    public ReportedReplyService1(ModelMapper mapper, ReportedReplyRepository reportedReplyRepository) {
        this.mapper = mapper;
        this.reportedReplyRepository = reportedReplyRepository;
    }

    @Transactional
    public void RegistReportedReply(ReportedReplyDTO newReport){
        reportedReplyRepository.save(mapper.map(newReport, ReportedReplyEntity.class));
    }

    @Transactional
    public void ModifyReportedReply(ReportedReplyDTO modifyReportDTO) {
        reportedReplyRepository.save(mapper.map(modifyReportDTO, ReportedReplyEntity.class));
    }
}
