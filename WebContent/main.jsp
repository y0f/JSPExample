<%@ page language="java" import="java.util.*" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@ page import = "model.LyTable" %>
<%@ page import = "db.DB" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">
<title>���԰���Ϣ</title>
</head>
<body bgcolor="#E3E3E3">
	<form action="liuyan.jsp" method="post">
	<table border="1">
		<caption>����������Ϣ</caption>
		<tr>
			<th>��������Ϣ</th>
			<th>����ʱ��</th>
			<th>���Ա���</th>
			<th>��������</th>
		</tr>
		<%
			ArrayList al = (ArrayList)session.getAttribute("al");
			Iterator iter = al.iterator();
			while(iter.hasNext()){
				LyTable ly = (LyTable)iter.next();
		%>
		<tr>
			<td><%=new DB().getUserName(ly.getUserId()) %></td>
			<td><%=ly.getDate().toString() %></td>
			<td><%=ly.getTitle() %></td>
			<td><%=ly.getContent1() %></td>
		</tr>
		<%} %>
	</table>
	<input type="submit" value="����" />
	</form>
</body>
</html>