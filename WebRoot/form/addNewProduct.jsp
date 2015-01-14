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
<!-- 	<h1><p class="text-center">add new product</p></h1> -->
	<h1>add a new product</h1>
	
	<hr>
	<br>
	
	<form method="post" class="form-horizontal" action="http://localhost:8080/logistics_portal/addNewproduct.do">

		<div class="control-group">
			<label class="control-label" for="productId">product ID</label>
			<div class="controls">
				<input type="text" name="productId" id="productId"
					placeholder="productId">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="productType">product Type</label>
			<div class="controls">
				<input type="text" name="productType" id="productType"
					placeholder="productType">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="productModel">product Model</label>
			<div class="controls">
				<input type="text" name="productModel" id="productModel"
					placeholder="productModel">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="productName">product Name</label>
			<div class="controls">
				<input type="text" name="productName" id="productName"
					placeholder="productName">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="discription">discription</label>
			<div class="controls">
				<input type="text" name="discription" id="discription"
					placeholder="discription">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="manufactory">manufactory</label>
			<div class="controls">
				<input type="text" name="manufactory" id="manufactory"
					placeholder="manufactory">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="productionDate">production Date</label>
			<div class="controls">
				<input type="text" name="productionDate" id="productionDate"
					placeholder="productionDate">
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="buildDate">build Date</label>
			<div class="controls">
				<input type="text" name="buildDate" id="buildDate"
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
