<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>学生课表查询系统</title>
	</head>
	<body>
		<h1>学生课表查询系统</h1>
		<hr>
		
		<br>
		<html:link forward = "modifyPwd">修改密码</html:link>
		<br>
		
		<html:form action="/studentWeb">
			查询基本信息<html:radio property="choice" value = "1"/><br/>
			修改基本信息<html:radio property="choice" value = "2"/><br/>
			查询课表&nbsp;&nbsp;&nbsp;&nbsp;<html:radio property="choice" value = "3"/><br/>
			<html:submit value = "提交"/>
			<html:link href = "logistics_portal/userLogin.jsp">返回</html:link>
		</html:form>
	</body>
</html>

