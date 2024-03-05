package org.thisdote.communityfordevelopers.blacklist.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.blacklist.command.entity.BlackListEntity;
import org.thisdote.communityfordevelopers.blacklist.command.repository.BlackListCommandRepository;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;

@Service
public class BlackListCommandService {

    private final ModelMapper modelMapper;
    private final BlackListCommandRepository blackListCommandRepository;

    @Autowired
    public BlackListCommandService(ModelMapper modelMapper, BlackListCommandRepository blackListCommandRepository) {
        this.modelMapper = modelMapper;
        this.blackListCommandRepository = blackListCommandRepository;
    }

    @Transactional
    public void registBlackList(BlackListDTO blackListDTO) {
        blackListCommandRepository.save(modelMapper.map(blackListDTO, BlackListEntity.class));
    }
}
