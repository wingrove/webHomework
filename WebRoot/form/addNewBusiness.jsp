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
<!-- 	<h1><p class="text-center">add new customer</p></h1> -->
	<h1>add a new business</h1>
	
	<hr>
	<br>
	
	<form class="form-horizontal" action="/logistics_portal/form/manAddTimetable.jsp">

		<div class="control-group">
			<label class="control-label" for="customerID">customer ID</label>
			<div class="controls">
				<input type="text" property="customerID" id="customerID"
					placeholder="customerID">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="customerName">customer Name</label>
			<div class="controls">
				<input type="text" property="customerName" id="customerName"
					placeholder="customerName">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="shippingAddress">shipping 
				Address</label>
			<div class="controls">
				<input type="text" property="shippingAddress" id="shippingAddress"
					placeholder="shippingAddress">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="mobile">mobile</label>
			<div class="controls">
				<input type="text" property="mobile" id="mobile"
					placeholder="mobile">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="customerClass">customer Class</label>
			<div class="controls">
				<input type="text" property="customerClass" id="customerClass"
					placeholder="customerClass">
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

