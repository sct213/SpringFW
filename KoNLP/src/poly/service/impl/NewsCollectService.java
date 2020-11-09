package poly.service.impl;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import poly.service.INewsCollectService;

@Service("NewsCollectService")
public class NewsCollectService implements INewsCollectService{
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public String doNaverNewsContents(String url) throws Exception {
		
		// JSOUP 라이브러리를 통해 사이트 접속되면, 그 사이트의 전체 HTML소스 저장할 변수 
		Document doc = null;
		
		doc = Jsoup.connect(url).get();
		
		//사이트 접속(http프로토콜만 가능, https 프로토콜은 보안상 안됨)
		Elements newsContent = doc.select("div._article_body_contents");
		
		String res = newsContent.text();
		
		doc = null;
		
		log.info("res ; " + res);
		
		return res;
	}

}
