package org.thisdote.communityfordevelopers.studygroup.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thisdote.communityfordevelopers.studygroup.command.entity.StudygroupEntity;

public interface StudygroupRepository extends JpaRepository<StudygroupEntity, Integer> {
}
