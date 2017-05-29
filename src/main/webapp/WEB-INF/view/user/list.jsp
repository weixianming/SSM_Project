<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
<table>
	<tr>
		<td>用户名</td><td>密码</td><td>邮箱</td>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.userName}</td>
			<td>${user.userPassword}</td>
			<td>${user.userEmail}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>