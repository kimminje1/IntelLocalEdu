<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_404eventBasic3.jsp</title>

<style type="text/css">
</style>


</head>



<body>
	<div >Enter some text in the fields below,
	 then press the "Submit form" button to submit the form.
		<img id='domLevel0'src="./images/img1.jpg">
	</div>

	


</body>

<script>
	function myFunction() {
	  alert('최초의 자바스크립트 이벤트 연결 방법');
	}
	
	var domLevel0Obj =document.getElementById('domLevel0');
	
	domLevel0Obj.onclick = myFunction;
	 
</script>


	
</html>