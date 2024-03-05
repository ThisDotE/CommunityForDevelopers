package org.thisdote.communityfordevelopers.blacklist.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.blacklist.command.entity.BlackList;
import org.thisdote.communityfordevelopers.blacklist.command.repository.BlackListRepository;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;

@Service
public class BlackListCommandService {
    private final ModelMapper modelMapper;
    private final BlackListRepository blackListRepository;

    @Autowired
    public BlackListCommandService(ModelMapper modelMapper, BlackListRepository blackListRepository) {
        this.modelMapper = modelMapper;
        this.blackListRepository = blackListRepository;
    }

    /* 설명. 블랙리스트 회원 추가 save (insert) */
    @Transactional
    public void registBlackList(BlackListDTO newBlackList) {
        blackListRepository.save(modelMapper.map(newBlackList, BlackList.class));
    }
}
