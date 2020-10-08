package poly.service;

import poly.dto.UserInfoDTO;

public interface IUserInfoService {
	int getUserLoginCheck(UserInfoDTO pDTO) throws Exception;
}
