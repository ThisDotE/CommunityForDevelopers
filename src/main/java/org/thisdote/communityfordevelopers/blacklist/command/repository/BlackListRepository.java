package org.thisdote.communityfordevelopers.blacklist.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thisdote.communityfordevelopers.blacklist.command.entity.BlackList;


public interface BlackListRepository extends JpaRepository<BlackList, Integer> {

}
