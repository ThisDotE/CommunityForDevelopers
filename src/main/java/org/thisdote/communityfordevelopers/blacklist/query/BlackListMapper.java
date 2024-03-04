package org.thisdote.communityfordevelopers.blacklist.query;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlackListMapper {

    List<BlackListDTO> selectAllBlackList();
}
