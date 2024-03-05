package org.thisdote.communityfordevelopers.blacklist.command.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thisdote.communityfordevelopers.blacklist.command.service.BlackListCommandService;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;

@Controller
@RequestMapping("/main")
@Slf4j
public class BlackListController {
    private final BlackListCommandService blackListCommandService;

    @Autowired
    public BlackListController(BlackListCommandService blackListCommandService) {
        this.blackListCommandService = blackListCommandService;
    }

    @GetMapping("/regist")
    public void registPage() {
    }

    @PostMapping("/regist")
    public String registBlackList(BlackListDTO newBlackList) {
        log.info("컨트롤러에서 한번에 입력값 잘 받나 테스트: {}", newBlackList);

        blackListCommandService.registBlackList(newBlackList);

        return "redirect:/main";
    }
}