package org.thisdote.communityfordevelopers.studygroup.command.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thisdote.communityfordevelopers.studygroup.command.entity.StudygroupEntity;
import org.thisdote.communityfordevelopers.studygroup.command.repository.StudygroupRepository;
import org.thisdote.communityfordevelopers.studygroup.dto.StudygroupCommandDTO;

@Service
public class StudygroupCommandService {

    private ModelMapper mapper;
    private StudygroupRepository studygroupRepository;

    @Autowired
    public StudygroupCommandService(ModelMapper mapper, StudygroupRepository studygroupRepository) {
        this.mapper = mapper;
        this.studygroupRepository = studygroupRepository;
    }

    @Transactional
    public void registStudygroup(StudygroupCommandDTO newStudygroup) {
        StudygroupEntity studygroupEntity = mapper.map(newStudygroup, StudygroupEntity.class);
        studygroupRepository.save(studygroupEntity);
    }

    @Transactional
    public void deleteStudygroup(int studygroupId) {
        studygroupRepository.deleteById(studygroupId);
    }
}
