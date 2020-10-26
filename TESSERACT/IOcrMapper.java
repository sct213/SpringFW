package poly.persistance.mapper;

import config.Mapper;
import poly.dto.OcrDTO;

@Mapper("DummyMapper")
public interface IOcrMapper {

	// 게시판 리스트
	OcrDTO InsertOcrInfo(OcrDTO pDTO) throws Exception;

}
