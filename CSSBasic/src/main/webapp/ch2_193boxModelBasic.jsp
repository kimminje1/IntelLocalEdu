<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_193boxModelBasic.jsp</title>
<style type="text/css">
body *{
	border: 1px solid black;
}



#asdf{
  background-color: lightgrey;
  width: 300px;
  border: 15px solid green;
  padding: 50px;
  padding-top: 50px;
  padding-right: 50px;
  padding-bottom: 50px;
  padding-left: 50px;
  
  
  margin: 220px;
}
</style>
</head>


<body>

	<h2>Demonstrating the Box Model</h2>

	<p>The CSS box model is essentially a box that wraps around every
		HTML element. It consists of: borders, padding, margins, and the
		actual content.</p>
	<!-- <div style=" width: 400px; border: 1px solid black;"> -->
	<div id="asdf">This text is the content of the box. We have added a 50px
		padding, 20px margin and a 15px green border. Ut enim ad minim veniam,
		quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
		commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
		velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
		occaecat cupidatat non proident, sunt in culpa qui officia deserunt
		mollit anim id est laborum.</div>
	<!-- </div>
 -->
</body>
</html>