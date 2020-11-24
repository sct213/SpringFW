<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>난 1초마다 URL을 호출하여 로그를 생성하는 JSP 페이지이다.</title>

<script src="/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	var logCnt = 0;//로그 찍은 횟수 저장을 위한 변수
	
	//JSP 페이지가 완전히 로딩완료(</html> 태그까지 실행 완료) 되며 1번만 자동실행됨
	$(window).on("load", function() {
		
		//화면 로딩이 완료되면 첫번째로 실행함
		doRequestURL();
		
		//2번째부터 채팅방 전체리스트를 1초마다 로딩함
		//컴퓨터는 밀리세컨트(10-3제곱) 단위로 처리하기 때문에 1000 => 1초를 의미함
		setInterval("doRequestURL();", 1000);
		
	});
	
	//url 호출하기
	function doRequestURL() {
		
		logCnt++;//로그 호출수 1씩 증가
		
		//Ajax 호출
		$.ajax({
			url : "/log/result.jsp?logCnt=" + logCnt,
			type : "get",
			dataType : "JSON",
			contentType: "application/json; charset=UTF-8",
			success : function(json){
				$("#LogView").html("My Create logMessage : " + json.logMessage);
				
			}
		})
	}
	
	</script>
</head>
<body>
<hr />
<br />
<h2>난 1초마다 URL을 호출하여 로그를 생성하는 JSP 페이지이다.</h2>
<br />
<hr />
<div id="LogView">[결과표시]</div>
</body>
</html>