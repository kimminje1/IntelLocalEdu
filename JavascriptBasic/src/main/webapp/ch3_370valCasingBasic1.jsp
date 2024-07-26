<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_370valCasingBasic1.jsp</title>

<style type="text/css">
</style>


</head>



<body>
	<p>
		The <strong>input type="password"</strong> defines a password field:
	</p>
    <!-- form태그->전부 문자열로입력됨 -->
	<form action="/action_page.php">
		<label for="username">Username:</label>
		<br> 
		<input type="text"
			id="username" name="username"  value="">
		<br>
		<label for="pwd">Password:</label>
		<br>
		<input type="password" id="pwd" name="pwd">
		<br>
		<input type="number" id= "money" value="">
		<br> 
		<input type="button" onclick="clickFnc();" value="Submit">
	</form>

	<p>The characters in a password field are masked (shown as
		asterisks or circles).</p>

</body>

<script type="text/javascript">

	function clickFnc() {
		var inputUserNameObj =document.getElementById('username');

		var val1 =inputUserNameObj.value;
		
		var inputMoneyObj = document.getElementById('money');
		
		var val2 = parseInt(inputMoneyObj.value);
		
		val1 = val1+10;
		console.log('val1:'+val1);
		
		val2 = val2+10;
		console.log('val2:'+val2);
	}

	
</script>


</html>