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

    /* 설명. 댓글 등록 regist */
    @Transactional
    public void registReply(ReplyDTO newReply) {
        replyRepository.save(modelMapper.map(newReply, Reply.class));
    }

    /* 설명. 댓글 수정 modify */
    @Transactional
    public void modifyReply(int replyId) {
        Reply foundReply = replyRepository.findById(replyId).orElseThrow(IllegalArgumentException::new);
        foundReply.setReplyId(replyId);
    }

    /* 설명. 댓글 삭제 delete */
    @Transactional
    public void deleteReply(int replyId) {
        Reply foundReply = replyRepository.findById(replyId).orElseThrow(IllegalArgumentException::new);

        foundReply.setReplyDeleteStatus(0);         // 0일 때 댓글 삭제됨
//        foundReply.setReplyDeleteStatus(1);         // 1일 때 댓글 유지됨
    }
}
