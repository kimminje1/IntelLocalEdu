<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>title</title>
<style type="text/css">
input {
	display: block;
	margin: auto;
}

.input {
	border-width: 0px;
}

#loginBox {
	border: 1px solid gray;
	width: 458px;
	height: 269px;
	padding: 24px;
	margin-right: auto;
	margin-left: auto;
	
}

input[type="password"] {
	-webkit-text-security: disc !important;
	padding-block: 1px;
	padding-inline: 2px;
	border: 1px solid gray;
}

#loginBtn {
	background-color: green;
	color: white;
	width: 412px;
	height: 50px;
	margin-top: 10px;

	/* padding:27px 15px 8px; */
}

#id {
	width: 410px;
	height: 60px;
	margin-right: auto;
	margin-left: auto;
	padding: 0px;
}

#pw {
	width: 410px;
	height: 60px;
	margin-right: auto;
	margin-left: auto;
	padding: 0px;
}

#idBox {
	display: block;
	width: 100px;
	height: 50px;
	border: 1px solid gray;
	text-align: center;
	line-height: 50px;
	margin-left: 23px;
	border-radius: 10px 10px 0 0; 
	border-bottom: none;
	border-collapse: collapse;
}
</style>

<script type="text/javascript">
	//4원색으로 제작
</script>

</head>



<body>

	
	<div id="loginBox">
		
		<span id="idBox">ID로그인</span>
		<input type="text" id="id" placeholder="아이디 입력"> 
		<input type="password" id="pw" placeholder="비밀번호 입력">

		<div id="loginDiv">
			<input type="submit" value="로그인" id="loginBtn">
		</div>
		
	</div>
	
	
</body>



</html>