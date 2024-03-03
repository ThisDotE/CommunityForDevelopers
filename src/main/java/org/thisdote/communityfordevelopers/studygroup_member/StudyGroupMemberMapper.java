package org.thisdote.communityfordevelopers.studygroup_member;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyGroupMemberMapper {

    List<StudyGroupMemberDTO> selectAllStudyGroupMember();

    List<StudyGroupMemberDTO> selectAllStudyGroupLeader();

    List<StudyGroupMemberDTO> selectAllStudyGroupFollower();
}
