package org.thisdote.communityfordevelopers.reply.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.reply.command.entity.Reply;
import org.thisdote.communityfordevelopers.reply.command.repository.ReplyRepository;
import org.thisdote.communityfordevelopers.reply.dto.ReplyDTO;

@Service
public class ReplyCommandService {
    private final ModelMapper modelMapper;
    private final ReplyRepository replyRepository;

    @Autowired
    public ReplyCommandService(ModelMapper modelMapper, ReplyRepository replyRepository) {
        this.modelMapper = modelMapper;
        this.replyRepository = replyRepository;
    }

    /* 설명. 댓글 등록 save (insert) */
    @Transactional
    public void registReply(ReplyDTO newReply) {
        replyRepository.save(modelMapper.map(newReply, Reply.class));
    }

//    @Transactional
//    public void modifyReply(ReplyDTO newReply) {
//        replyRepository.
//    }
}
