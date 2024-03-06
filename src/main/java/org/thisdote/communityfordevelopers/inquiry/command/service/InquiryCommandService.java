package org.thisdote.communityfordevelopers.inquiry.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.inquiry.command.entity.InquiryEntity;
import org.thisdote.communityfordevelopers.inquiry.dto.InquiryCommandDTO;
import org.thisdote.communityfordevelopers.inquiry.command.repository.InquiryCommandRepository;

@Service
public class InquiryCommandService {

    private ModelMapper mapper;
    private InquiryCommandRepository inquiryRepository;

    @Autowired
    public InquiryCommandService(ModelMapper mapper, InquiryCommandRepository inquiryRepository) {
        this.mapper = mapper;
        this.inquiryRepository = inquiryRepository;
    }

    @Transactional
    public void registInquiry(InquiryCommandDTO newInquiry) {
        InquiryEntity inquiryEntity = mapper.map(newInquiry, InquiryEntity.class);

        System.out.println("inquiryEntity = " + inquiryEntity);

        inquiryRepository.save(inquiryEntity);
    }

    @Transactional
    public void deleteInquiry(int inquiryId) {
        inquiryRepository.deleteById(inquiryId);
    }

    @Transactional
    public void modifyInquiry(InquiryCommandDTO inquiry) {
        InquiryEntity inquiryEntity = mapper.map(inquiry, InquiryEntity.class);

        System.out.println("inquiryEntity = " + inquiryEntity);

        inquiryRepository.save(inquiryEntity);
    }

}
