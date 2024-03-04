package org.thisdote.communityfordevelopers.inquiry.command;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/inquiry")
@Slf4j
public class InquiryController {

    private final InquiryService inquiryService;
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping("/insert")
    public void insertInquiry() {}

    @GetMapping(value = "/inquiry",produces = "application/json; charset=UTF-8 ")

    @PostMapping("/insert")
    public String insertInquiry(InquiryDTO newInquiry) {
        inquiryService.insertMenu(newInquiry);

        return "inquiry/list";
    }
}
