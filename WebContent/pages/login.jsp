<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>	
	<form action="login" method="post">
		用户名:<input type="text" name="userName" /><br/>
		密码:<input type="password" name="password" /><br/>
		<input type="submit" value="登录"/><br/>
	</form>
	<s:fielderror fieldName="userName" /><br/>
	<s:fielderror fieldName="password" />
	<s:if test="hasActionErrors()">
		<s:actionerror/>
	</s:if>
	
</body>
</html>