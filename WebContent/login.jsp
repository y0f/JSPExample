<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">
<title>�������԰�</title>
</head>
<body bgcolor="#E3E3E3">
<form action="mainServlet" method="post">
	<table>
		<caption>�û���¼</caption>
		<tr>
			<td>��¼����</td>
			<td><input type="text" name="username" size="20" /></td>
		</tr>
		<tr>
			<td>���룺</td>
			<td><input type="password" name="pwd" size="21" /></td>
		</tr>
	</table>
	<input type="submit" value="��¼" />
	<input type="reset" value="����" />
</form>
���û��ע����<a href="register.jsp">����</a>ע�ᣡ
</body>
</html>