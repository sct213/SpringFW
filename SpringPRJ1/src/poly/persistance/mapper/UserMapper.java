package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import poly.dto.BoardDTO;
import poly.dto.NoticeDTO;
import poly.dto.UserDTO;

@Mapper("UserMapper")
public interface UserMapper {

	UserDTO getUserInfo(UserDTO uDTO);


}
