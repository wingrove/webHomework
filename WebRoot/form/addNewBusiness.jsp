<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">

</head>
<body>

	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="../js/bootstrap.min.js"></script>
<!-- 	<h1><p class="text-center">add new business</p></h1> -->
	<h1>add a new business</h1>
	
	<hr>
	<br>
	
	<form class="form-horizontal" action="/logistics_portal/form/manAddTimetable.jsp">

		<div class="control-group">
			<label class="control-label" for="businessID">business ID</label>
			<div class="controls">
				<input type="text" property="businessID" id="businessID"
					placeholder="businessID">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="businessName">business Name</label>
			<div class="controls">
				<input type="text" property="businessName" id="businessName"
					placeholder="businessName">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="address">address</label>
			<div class="controls">
				<input type="text" property="address" id="address"
					placeholder="address">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="businessTel">business Tel</label>
			<div class="controls">
				<input type="text" property="businessTel" id="businessTel"
					placeholder="businessTel">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="businessClass">business Class</label>
			<div class="controls">
				<input type="text" property="businessClass" id="businessClass"
					placeholder="businessClass">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="buildDate">build Date</label>
			<div class="controls">
				<input type="text" property="buildDate" id="buildDate"
					placeholder="buildDate">
			</div>
		</div>


		<div class="control-group">
			<div class="controls">
				<button type="submit" class="btn">Submit</button>
				<a href="http://www.baidu.com"><button type="button" class="btn">Back</button></a>

			</div>
		</div>
		</div>
	</form>

</body>

</html>
