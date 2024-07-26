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
	<p>Enter some text in the fields below,
	 then press the "Submit form" button to submit the form.</p>

	<form action="./ch3_404eventBasic1.jsp" onsubmit="myfunction();">
  	Enter name: <input type="text" name="fname">
  	<br>
  	Enter 글자: <input type="text" name="tempdata">
  	<input type="submit" value="데이터전송">
  	<input type="reset" value="초기화같은 느낌?">
	</form>


</body>

<script>
	function myFunction() {
	  alert("여기서 form 데이터들을 유효성을 검사하다.")
	}
	
	
	
</script>



</html>