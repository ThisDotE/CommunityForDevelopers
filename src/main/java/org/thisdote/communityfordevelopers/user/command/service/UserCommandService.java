package org.thisdote.communityfordevelopers.user.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.user.command.entity.UserEntity;
import org.thisdote.communityfordevelopers.user.command.repository.UserRepository;
import org.thisdote.communityfordevelopers.user.dto.UserDTO;

@Service
public class UserCommandService {

    private final ModelMapper mapper;
    private final UserRepository userRepository;

    @Autowired
    public UserCommandService(ModelMapper modelMapper, UserRepository userRepository) {
        this.mapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Transactional
    public void registUser(UserDTO newUser) {
        userRepository.save(mapper.map(newUser, UserEntity.class));
    }

    /* TODO.
     *  회원 정보 수정
     * */
//    @Transactional
//    public void modifyUser(UserDTO modifyUser) {
//        User foundUser = userRepository.findById(modifyUser.getUserCode()).orElseThrow(IllegalAccessError::new);
//
//        UserDTO user = mapper.map(foundUser, UserDTO.class);
//    }

    @Transactional
    public void deleteUser(int userCode) {
        userRepository.deleteById(userCode);
    }
}