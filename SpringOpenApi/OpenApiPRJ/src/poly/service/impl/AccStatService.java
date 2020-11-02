package poly.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import poly.dto.AccStatDTO;
import poly.persistance.mapper.IAccStatMapper;
import poly.service.IAccStatService;

@Service("AccStatService")
public class AccStatService implements IAccStatService {

	@Resource(name = "AccStatMapper")
	private IAccStatMapper accStatMapper;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public List<AccStatDTO> getAccStatInfo(AccStatDTO pDTO) throws Exception {
		
		log.info(this.getClass().getName() + ".getAccStatInfo Start!");
		
		// 교통사고 조회 
		List<AccStatDTO> rList = accStatMapper.getAccStatInfo(pDTO);
		
		// 참조형 변수는 무조건 오류방지를 위해 널 처리 한다 
		if(rList == null) {
			rList = new ArrayList<AccStatDTO>();
		}
		
		log.info(this.getClass().getName() + ".getAccStatInfo End!");
		
		return rList;
	}
	
}
