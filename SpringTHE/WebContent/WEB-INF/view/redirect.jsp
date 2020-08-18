<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    
    String msg = (String)request.getAttribute("msg");
	String url = (String)request.getAttribute("url");
    
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
alert("<%=msg %>")
// msg에 저장된 문자열을 alert.
location.href = "<%=url %>"
// url에 저장된 주소로 이동.
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>redirect</title>
</head>
<body>
</body>
</html>