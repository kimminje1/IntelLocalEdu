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
	<h1>토글 적용해보기</h1>
	<h2>사용자가 입력할 때 초록색, 입력이 완료되어 벗어나면 원래색</h2>
	<h2>id 이런건 알아서 입력해서 해본다</h2>

	
	<input type="text" value="" placeholder="별명 입력해봐" 
	onfocus="myFunction(this)" onblur="normalImg(this)">
	<input type="text" value="" placeholder="취미 입력해봐" 
	onfocus="myFunction(this)" onblur="normalImg(this)">



</body>

<script>
	function myFunction(x) {
	  x.style.background = "green";
	}
	function normalImg(x) {
		  x.style.background = "white";
		}
</script>



</html>