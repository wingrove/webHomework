<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
 
<html> 
	<head>
		<title>学生课表</title>
	</head>
	
	<body>
		<h1>学生课表</h1>
		<hr>
		<br>
		
		<table border="1">
  			<tr>
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
				//驱动程序名
				String driverName="com.mysql.jdbc.Driver";
				//数据库用户名
				String userName="root";
				//密码
				String userPasswd="123";
				//数据库名
				String dbName="test";
				//连接语句
				String url = "jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd;
				//连接数据库
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection connection=DriverManager.getConnection(url);
				
				//sql statement
				Statement statement = connection.createStatement();
				
				//get student class id
				String RealID = (String)session.getAttribute("RealID");
				
				ResultSet rsForClassID = statement.executeQuery("SELECT student.ClassID FROM student WHERE Student.StuNum = " + RealID);
				
				rsForClassID.next();
				
				//get class id corresponding timetable
				ResultSet rs = statement.executeQuery("SELECT DISTINCT timetable.TermNum, teacher.`Name` as TeacherName, timetable.ClassID, timetable.Room, course.`Name` as CourseName, timetable.BeginWeek, timetable.EndWeek, timetable.BeginCourse, timetable.EndCourse FROM timetable , teacher , course WHERE timetable.ClassID = "+rsForClassID.getString("ClassID")+" AND timetable.WorkNum = teacher.WorkNum AND timetable.CourseID = course.ID");
			
				while (rs.next()) {
					out.print("<tr>");
					out.print("<td>"+rs.getString("TermNum")+"</td>");
					out.print("<td>"+rs.getString("TeacherName")+"</td>");
					out.print("<td>"+rs.getString("ClassID")+"</td>");
					out.print("<td>"+rs.getString("Room")+"</td>");
					out.print("<td>"+rs.getString("CourseName")+"</td>");
					out.print("<td>"+rs.getString("BeginWeek")+"</td>");
					out.print("<td>"+rs.getString("EndWeek")+"</td>");
					out.print("<td>"+rs.getString("BeginCourse")+"</td>");
					out.print("<td>"+rs.getString("EndCourse")+"</td>");
					out.print("</tr>");
				}
				
				connection.close();
		 	%>
		 </table>
		 
		 <html:link href = "http://localhost:8080/WebHomework/form/studentWeb.jsp">返回</html:link>
		 
	</body>
</html>

