<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>课表查询系统</title>
	</head>
	<body>
		<h1>课表查询系统</h1>
		<hr>
		<br>
		<html:form action="/userLogin">
		     	用户 : <html:text property="username"/><br/>
		     	密码 : <html:password property="userpwd"/><br/>
		<html:submit value = "提交"/>
		</html:form>
	</body>
</html>

