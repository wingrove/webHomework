<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@page import="com.myeclipse.hibernate.Teacher"%>
 
<html> 
	<head>
		<title>修改教师基本信息</title>
	</head>
	<body>
		<h1>修改教师基本信息</h1>
		<hr>
		<br>
		
		<%
			Teacher teacher = (Teacher)session.getAttribute("TeaInfo");
		 %>
		 
		<html:form action="/teaModifyInfo">
			院系&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="school" value = "<%=teacher.getSchool()%>"/><br/>
			电子邮箱<html:text property="email" value = "<%=teacher.getEmail()%>"/><br/>
			手机号码<html:text property="phoneNumber" value = "<%=String.valueOf(teacher.getPhoneNum())%>"/><br/>
			
			<html:submit value = "修改"/>
			<html:link href = "http://localhost:8080/WebHomework/form/teacherWeb.jsp">返回</html:link>
			
		</html:form>
	</body>
</html>