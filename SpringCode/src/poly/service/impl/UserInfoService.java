package poly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.UserInfoDTO;
import poly.persistance.mapper.IUserInfoMapper;
import poly.service.IUserInfoService;

@Service("UserInfoService")
public class UserInfoService implements IUserInfoService{
	
	@Resource(name="UserInfoMapper")
	private IUserInfoMapper userInfoMapper;
	
	@Override
	public int insertUserINfo(UserInfoDTO pDTO) throws Exception{
		
		int res = 0;
		
		if(pDTO == null) {
			pDTO == new UserInfoDTO();
		}
		
		UserInfoDTO rDTO = userInfoMapper.getUserExists(pDTO);
		
		if(rDTO == null) {
			rDTO == new UserInfoDTO();
		}
	}

}
