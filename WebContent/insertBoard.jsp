<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>���۵��</title>
</head>
<body>
<center>
	<h3>���� ����ϱ�............<a href='logout.do'>LOG-OUT</a></h3>
	<hr>
		<form action="insertBoard.do" method="post" enctype="multipart/form-data">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>����</td><td align="left">
				<input type="text" name="title"/></td>
				<font color="red"><form:errors path="boardVO.title"/></font>
			</tr>
			<tr>
				<td>�ۼ���</td><td align="left">
				<input type="text" name="writer" size="10"/></td>
				<font color="red"><form:errors path="boardVO.writer"/></font>
			</tr>
			<tr>
				<td>����</td><td align="left">
				<textarea name="content" cols="40" rows="10"></textarea></td>
				<font color="red"><form:errors path="boardVO.content"/></font>
			</tr>
			<tr>
				<td>���ε�</td><td align="left">
				<input type="file" name="uploadFile"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value=" ���� ��� "/></td>
			</tr>
		</table>
		</form>
	<hr>
</center>
</body>
</html>