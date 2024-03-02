package org.thisdote.communityfordevelopers.user;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDTO> selectAllUser();

    List<UserDTO> selectUserId(String userId);

    List<UserDTO> selectUserCode(int userCode);

    List<UserDTO> updateUserEmail(String userEmail);
}
