<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@page import="com.myeclipse.hibernate.Student"%>
 
<html> 
	<head>
		<title>修改学生基本信息</title>
	</head>
	<body>
		<h1>修改学生基本信息</h1>
		<hr>
		<br>
		
		<%
			Student student = (Student)session.getAttribute("StuInfo");
		 %>
		 
		<html:form action="/stuModifyInfo">
			班级编号<html:text property="classID" value = "<%=String.valueOf(student.getClassId())%>"/><br/>
			电子邮箱<html:text property="email" value = "<%=student.getEmail()%>"/><br/>
			手机号码<html:text property="phoneNumber" value = "<%=String.valueOf(student.getPhoneNum())%>"/><br/>
			
			<html:submit value = "修改"/>
			<html:link href = "http://localhost:8080/WebHomework/form/studentWeb.jsp">返回</html:link>
			
		</html:form>
	</body>
</html>

