<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>管理员课表查询系统</title>
	</head>
	<body>
		<h1>管理员课表查询系统</h1>
		<hr>
		<br>
		
		<html:link forward = "manAddTimetable">增加课表信息</html:link>&nbsp;&nbsp;
		<html:link forward = "manModDelTimetable">修删课表信息</html:link>
		
		<br><br>
		<hr>
		<br>
		
		<html:form action="/managerWeb">
			<html:select property="queryitem" value="1">
			<html:option value="1">学期编号</html:option>
			<html:option value="2">教师编号</html:option>
			<html:option value="3">班级编号</html:option>
			<html:option value="4">教室</html:option>
			<html:option value="5">课程名称</html:option>
			</html:select>
			
			<html:text property="queryinstance"/>
			
			<html:submit value="查询课表信息"/>
			
		</html:form>
		
		<br>
		<html:link href = "http://localhost:8080/WebHomework/form/userLogin.jsp">返回</html:link>
		
	</body>
</html>