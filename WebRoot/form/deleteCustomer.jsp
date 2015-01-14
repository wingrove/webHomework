<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">

</head>
<body>

	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<!-- 	<h1><p class="text-center">add new customer</p></h1> -->
	<h1>delete  customer</h1>

	<hr>
	<br>
	
<form method="post" action="http://localhost:8080/logistics_portal/deleteCustomer.do">
  <fieldset>
    <input type="text" name="customerId" id="customerId" placeholder="the CustomerID you want to delete">
    <button type="submit" class="btn">Submit</button>
  </fieldset>
</form>

</body>

</html>

