package org.thisdote.communityfordevelopers.studygroup_member.query;

import org.apache.ibatis.annotations.Mapper;
import org.thisdote.communityfordevelopers.studygroup_member.dto.StudyGroupMemberDTO;

import java.util.List;

@Mapper
public interface StudyGroupMemberMapper {

    List<StudyGroupMemberDTO> selectAllStudyGroupMember();

    List<StudyGroupMemberDTO> selectAllStudyGroupLeader();

    List<StudyGroupMemberDTO> selectAllStudyGroupFollower();
}
