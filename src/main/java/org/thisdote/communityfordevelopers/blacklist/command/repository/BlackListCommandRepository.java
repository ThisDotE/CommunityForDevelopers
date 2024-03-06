package org.thisdote.communityfordevelopers.blacklist.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thisdote.communityfordevelopers.blacklist.command.entity.BlackListEntity;

public interface BlackListCommandRepository extends JpaRepository<BlackListEntity, Integer> {

}
