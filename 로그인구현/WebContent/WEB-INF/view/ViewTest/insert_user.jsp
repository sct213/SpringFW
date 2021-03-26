<%@ page import="Test.DBConnUtils" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection conn = DBConnUtils.getConnection();
    PreparedStatement pstmt = null;
    String query = "INSERT INTO USER VALUES (?,?)";
    if (conn != null) {
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, request.getParameter("id"));
            pstmt.setString(2, request.getParameter("pw"));
            pstmt.executeUpdate();
            conn.close();
            pstmt.close();
%>
<script>
    alert("Insert 성공");
    location.href='insert_user.html';
</script>
<%
    } catch (SQLException e) {
        e.printStackTrace();
    }

} else {
%>
<script>
    alert("Database 연결 실패");
    history.back();
</script>
<%

    }
%>