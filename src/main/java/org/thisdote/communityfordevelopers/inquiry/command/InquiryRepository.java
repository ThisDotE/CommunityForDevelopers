package org.thisdote.communityfordevelopers.inquiry.command;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<InquiryEntity, Integer> {

//    @Query(value = "INSERT INTO INQUIRY (INQUIRY_ID, INQUIRY_CATEGORY, INQUIRY_TITLE, INQUIRY_CONTENT,\n" +
//            "INQUIRY_CREATE_DATE, INQUIRY_LAST_UPDATE_DATE, INQUIRY_STATUS) VALUES (?,?,?,?,?,?,?);", nativeQuery = true)
//    List<Inquiry> askInquiry();
}
