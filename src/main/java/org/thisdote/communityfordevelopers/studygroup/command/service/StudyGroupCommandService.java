package org.thisdote.communityfordevelopers.studygroup.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.studygroup.command.entity.StudyGroupEntity;
import org.thisdote.communityfordevelopers.studygroup.command.repository.StudyGroupRepository;
import org.thisdote.communityfordevelopers.studygroup.dto.StudyGroupCommandDTO;

@Service
public class StudyGroupCommandService {

    private ModelMapper mapper;
    private StudyGroupRepository studygroupRepository;

    @Autowired
    public StudyGroupCommandService(ModelMapper mapper, StudyGroupRepository studygroupRepository) {
        this.mapper = mapper;
        this.studygroupRepository = studygroupRepository;
    }

    @Transactional
    public void registStudygroup(StudyGroupCommandDTO newStudygroup) {
        StudyGroupEntity studygroupEntity = mapper.map(newStudygroup, StudyGroupEntity.class);
        studygroupRepository.save(studygroupEntity);
    }

    @Transactional
    public void deleteStudygroup(int studygroupId) {
        studygroupRepository.deleteById(studygroupId);
    }

    @Transactional
    public void modifyStudygroup(StudyGroupCommandDTO studygroup) {
        StudyGroupEntity studyGroupEntity = mapper.map(studygroup, StudyGroupEntity.class);
        studygroupRepository.save(studyGroupEntity);
    }
}
