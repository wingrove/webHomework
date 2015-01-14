<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@page import="java.util.List"%>
<%@page import="com.myeclipse.hibernate.Timetable"%>
 
<html> 
	<head>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">

	</head>
	
	<body>
		
		<script src="../js/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		
		<h1>管理员课表</h1>
		<hr>
		<br>
		
		<table border="1" class="table table-striped">
  			<tr>
  				<th>记录号</th>
    			<th>学期编号</th>
    			<th>教师名称</th>
    			<th>班级编号</th>
    			<th>教室</th>
    			<th>课程名称</th>
    			<th>上课起始周</th>
    			<th>上课终止周</th>
    			<th>上课起始节数</th>
    			<th>上课终止节数</th>
  			</tr>
  			
  			<%
  				List<Timetable> list = (List<Timetable>)session.getAttribute("QueTimetable");
  				for (Timetable timetable:list) {
  			%>
		  			<tr>
		  			<td><%=timetable.getTtid()%></td>
					<td><%=timetable.getTermNum()%></td>
					<td><%=timetable.getTeacher().getName()%></td>
					<td><%=timetable.getClassId()%></td>
					<td><%=timetable.getRoom()%></td>
					<td><%=timetable.getCourse().getName()%></td>
					<td><%=timetable.getBeginWeek()%></td>
					<td><%=timetable.getEndWeek()%></td>
					<td><%=timetable.getBeginCourse()%></td>
					<td><%=timetable.getEndCourse()%></td>
					</tr>
			 <%
  				}
  			 %>
		 </table>
		 
		 <html:link href = "http://localhost:8080/WebHomework/form/managerWeb.jsp">返回</html:link>
		 
	</body>
</html>

