package org.thisdote.communityfordevelopers.studygroup.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thisdote.communityfordevelopers.studygroup.command.entity.StudyGroupEntity;

public interface StudyGroupRepository extends JpaRepository<StudyGroupEntity, Integer> {
}
