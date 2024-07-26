<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_404eventBasic1.jsp</title>

<style type="text/css">
</style>


</head>



<body>
	<h1>HTML DOM Events</h1>
	<h2>The onmouseover Event</h2>

	<img onmouseover="bigImg(this)" onmouseout="normalImg(this)" border="0" 
	src="./images/img1.jpg" alt="Smiley" width="320" height="320">

	<p>The function bigImg() is triggered when the user moves the mouse pointer over the image.</p>
	<p>The function normalImg() is triggered when the mouse pointer is moved out of the image.</p>


</body>

<script>
	function bigImg(x) {
  	x.style.height = "600px";
  	x.style.width = "600px";
	
	}

	function normalImg(x) {
  	x.style.height = "64px";
  	x.style.width = "64px";
	}
</script>



</html>