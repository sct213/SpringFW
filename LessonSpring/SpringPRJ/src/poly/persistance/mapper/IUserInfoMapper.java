package poly.persistance.mapper;

import config.Mapper;
import poly.dto.UserInfoDTO;

@Mapper("UserInfoMapper")
public interface IUserInfoMapper {

	UserInfoDTO getUserLoginCheck(UserInfoDTO pDTO) throws Exception;
}
