<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>修改密码</title>
	</head>
	
	<body>
		<h1>修改密码</h1>
		<br>
		<hr>
		<br>
	
		<html:form action="/modifyPwd">
			新密码<html:password property="newPwd"/><br/><br/>
			<html:submit value = "提交" />&nbsp;&nbsp;
			<html:link href = "http://localhost:8080/WebHomework/form/userLogin.jsp">返回</html:link>
		</html:form>
	</body>
</html>

