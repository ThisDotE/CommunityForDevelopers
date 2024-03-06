package org.thisdote.communityfordevelopers.reply.command.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.thisdote.communityfordevelopers.reply.command.service.ReplyCommandService;

@Controller
@Slf4j
public class ReplyController {
    private final ReplyCommandService replyCommandService;

    @Autowired
    public ReplyController(ReplyCommandService replyCommandService) {
        this.replyCommandService = replyCommandService;
    }

}
