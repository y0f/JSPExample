<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">
<title>���԰�</title>
</head>
<body bgcolor="#E3E3E3">
	<center>
		<form action="addServlet" method="post">
			<table border="1">
				<caption>��д������Ϣ</caption>
				<tr>
					<td>���Ա���</td>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td>��������</td>
					<td><textarea name="content1" rows="5" cols="35"></textarea></td>
				</tr>
			</table>
			<input type="submit" value="�ύ" />
			<input type="reset" value="����" />
		</form>
	</center>
</body>
</html>