<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${userName } 登录成功<br/>
	 1,<s:property value="userName"/> <br/>
	 2,<s:property value="#session.userName"/><br/>
	 3,<s:property value="#session.mes"/><br/>
	 <s:debug></s:debug>
	 <form action="doUpload" method="post" enctype="multipart/form-data">
	 	<input type="file" name="upload" /><br/>
	 	<input type="submit" value="上传"/>
	 </form>
</body>
</html>