package poly.persistance.mongo.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;

import poly.persistance.mongo.IMongoTestMapper;

@Component("MongoTestMapper")
public class MongoTestMapper implements IMongoTestMapper {
	
	@Autowired
	private MongoTemplate mongodb;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public boolean createCollection(String colNm) throws Exception {
		
		log.info(this.getClass().getName() + ".createCollection Start!");
		
		boolean res = false;
		
		// 기존에 등록된 컬렉션의 이름이 존재하지는 체크, 존재하면 기존 컬렉션 drop 
		if (mongodb.collectionExists(colNm)) {
			mongodb.dropCollection(colNm);
		}
		
		
		// 컬렉션 생성 및 인덱스 생성, MongoDB에서 데이터를 가져오는 방식에 맞게 인덱스를 생성하자 .
		
		// 자주 검색 될 데이터에 무조건 인덱스를 넣는 것이 좋음 
		// Sharding과 같은 분산 시스템의 경우 UniqueKey를 넣는 것이 불가함
//		mongodb.createCollection(colNm).createIndex(new BasicDBObject("user_id", 1), "testIdx");
		
		res = true;
		
		log.info(this.getClass().getName() + ".createCollection End!");
		
		return res;
	}
}
