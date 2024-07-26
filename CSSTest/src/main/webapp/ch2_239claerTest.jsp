<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_239claerBasic.jsp</title>

<style type="text/css">
div {
	border: 3px solid #4CAF50;
	padding: 5px;
}

.img1 {
	float: right;
}

.img2 {
	float: left;
	
}
#clearfix{
 	clear:both;
 	width:1900px;
	height:200px;
	
}


</style>

</head>


<body>
	<h2>Without Clearfix</h2>

	<p>This image is floated to the right. It is also taller than the
		element containing it, so it overflows outside of its container:</p>

	<div>
		<img class="img1" src="img/bg_flower.png" alt="Pineapple" width="170"
			height="170"> Lorem ipsum dolor sit amet, consectetur
		adipiscing elit. Phasellus imperdiet...
	</div>

	<h2 style="margin-top: 200px;">With Clearfix</h2>
	<p>We can fix this by adding a clearfix class with overflow: auto;
		to the containing element:</p>

	<div id="clearfix" >
		<img class="img2" src="img/bg_flower.png" alt="Pineapple" width="170"
			height="170"> <p style="padding-top: 150px;">Lorem ipsum dolor sit amet, consectetur
		adipiscing elit. Phasellus imperdiet...</p>
	</div>

</body>
</html>