<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="poly.util.CmmUtil" %>
<%
	String jspRes = CmmUtil.nvl((String)request.getAttribute("res"), "0");

	String toMail = CmmUtil.nvl(request.getParameter("toMail"));
	String title = CmmUtil.nvl(request.getParameter("title"));
	String contents = CmmUtil.nvl(request.getParameter("contents"));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� �߼� ��� ����</title>
<style>
</style>
</head>
<body>
<%
	if(jspRes.equals("1")){
		out.println(toMail + "�� ������ ���������� �����Ͽ����ϴ�.");
		out.println("���� ���� : " + title);
		out.println("���� ���� : " + contents);
	} else {
		out.println(toMail + "�� ���� ������ �����Ͽ����ϴ�.");
	}
%>
</body>
</html>