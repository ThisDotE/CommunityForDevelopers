package org.thisdote.communityfordevelopers.studygroup_member.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.studygroup_member.command.entity.StudyGroupMemberEntity;
import org.thisdote.communityfordevelopers.studygroup_member.command.repository.StudyGroupMemberCommandRepository;
import org.thisdote.communityfordevelopers.studygroup_member.dto.StudyGroupMemberDTO;

@Service
public class StudyGroupMemberCommandService {

    private final ModelMapper modelMapper;
    private final StudyGroupMemberCommandRepository studyGroupMemberCommandRepository;

    @Autowired
    public StudyGroupMemberCommandService(ModelMapper modelMapper,
                                          StudyGroupMemberCommandRepository studyGroupMemberCommandRepository) {
        this.modelMapper = modelMapper;
        this.studyGroupMemberCommandRepository = studyGroupMemberCommandRepository;
    }

    @Transactional
    public void registStudyGroupMember(StudyGroupMemberDTO newStudyGroupMember) {
        studyGroupMemberCommandRepository.save(
                modelMapper.map(newStudyGroupMember, StudyGroupMemberEntity.class)
        );
    }

    @Transactional
    public void deleteStudyGroupMember(int studyGroupMemberId) {
        studyGroupMemberCommandRepository.deleteById(studyGroupMemberId);
    }

    @Transactional
    public void modifyStudyGroupMemberRole(StudyGroupMemberDTO modifyMember) {
        studyGroupMemberCommandRepository.save(modelMapper.map(modifyMember, StudyGroupMemberEntity.class));
    }
}
