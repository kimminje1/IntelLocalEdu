<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch1_86divSpanTest.jsp</title>
<style type="text/css">

#table {display: table; width: 400px;
 border:1px solid black;}	
.row {display: table-row;}
.cell {display: table-cell;  border-bottom: 1px solid black;}
.cell1 {display: table-cell;  border-bottom: 1px solid black;
background: graytext; text-align: center;
font-weight: bold;}
.col1 { width: 123px; border-right: 1px solid black;}
.col2 {width: 191px; border-right: 1px solid black;}
.col3 {width: 84px; border-right: 1px solid black;}
</style>
</head>


<body>
<h2>DIV와 SPAN태그를 활용하여 이 html 구조를 완벽하게 재현하시오</h2>	
<div id="table">
	<div class="row">
		<span class="cell1 col1" >Firstname</span>
		<span class="cell1 col2" >Lastname</span>
		<span class="cell1 col3" >Age</span>
	</div>
	<div class="row">
		<span class="cell col1">Jill</span>
		<span class="cell col2">Smith</span>
		<span class="cell col3">50</span>
	</div>
	<div class="row">
		<span class="cell col1">Eve</span>
		<span class="cell col2">Jackson</span>
		<span class="cell col3">94</span>
	</div>
	<div class="row">
		<span class="cell col1">John</span>
		<span class="cell col2">Doe</span>
		<span class="cell col3">80</span>
	</div>
</div>


</body>
</html>