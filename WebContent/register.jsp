<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>struts拦截器实例——注册</title>
</head>
<body>
<s:property value="#session.result"/><br/>
<s:form action="register.action" method="post">
	<s:textfield name="user.username" label="用户名"/>
	<s:password name="user.password" label="密码"/>
	<!-- s:password 每次提交会清除此标签的数据 -->
	<s:password name="pwdretype" label="确认密码"/>
	<s:submit value="注册"/>
</s:form>
</body>
</html>