package org.thisdote.communityfordevelopers.blacklist.query;

import org.apache.ibatis.annotations.Mapper;
import org.thisdote.communityfordevelopers.blacklist.dto.BlackListDTO;

import java.util.List;

@Mapper
public interface BlackListMapper {

    List<BlackListDTO> selectAllBlackList();
}
