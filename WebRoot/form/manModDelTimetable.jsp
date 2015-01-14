<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>修删课表信息</title>
	</head>
	<body>
		<h1>修删课表信息</h1>
		<hr>
		<br>
		
		<html:form action="/manModDelTimetable">
			记录号 <html:text property="recordNum"/><br/>
			操作&nbsp;&nbsp;&nbsp;<html:select property="function"><html:option value="1">修改</html:option><html:option value="2">删除</html:option></html:select>
			<br>
			<br>
			<html:submit value = "提交"/>
			&nbsp;&nbsp;
			<html:link href = "http://localhost:8080/WebHomework/form/managerWeb.jsp">返回</html:link>
		</html:form>
	</body>
</html>

