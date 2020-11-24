<%@ page language="java" contentType="text/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
String logCnt=request.getParameter("logCnt");
String logMessage="Log Number["+logCnt+"]";
System.out.println("log:" + logMessage);
%>{"logMessage":"<%=logMessage%>"}