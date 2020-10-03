<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">
<title>简易留言板</title>
</head>
<body bgcolor="#E3E3E3">
<form action="mainServlet" method="post">
	<table>
		<caption>用户登录</caption>
		<tr>
			<td>登录名：</td>
			<td><input type="text" name="username" size="20" /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="pwd" size="21" /></td>
		</tr>
	</table>
	<input type="submit" value="登录" />
	<input type="reset" value="重置" />
</form>
如果没有注册点击<a href="register.jsp">这里</a>注册！
</body>
</html>