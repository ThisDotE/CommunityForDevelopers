package org.thisdote.communityfordevelopers.studygroup_member.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thisdote.communityfordevelopers.studygroup_member.command.entity.StudyGroupMemberEntity;

public interface StudyGroupMemberCommandRepository extends JpaRepository<StudyGroupMemberEntity, Integer> {
}
