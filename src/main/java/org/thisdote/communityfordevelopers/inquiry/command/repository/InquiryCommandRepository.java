package org.thisdote.communityfordevelopers.inquiry.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thisdote.communityfordevelopers.inquiry.command.entity.InquiryEntity;

public interface InquiryCommandRepository extends JpaRepository<InquiryEntity, Integer> {

}
