<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	box-sizing: border-box;
}

button {
	width: 100px;
	height: 30px;
	margin: 10px;
}

#header {
	width: 80vw;
	border: 1px solid;
	height: 7vh;
	margin: 0 auto 30px;
	display: flex;
	flex-direction: row;
	background-color: skyblue;
}

#header .header__con {
	height: 7vh;
	display: flex;
	align-items: center;
}

#main_content {
	width: 80vw;
	border: 1px solid;
	height: 75vh;
	margin: 0 auto 30px;
	display: flex;
	justify-content: space-around;
	align-items: center;
	background-color: lightgray;
}

#main_content #content_fir_div {
	border: 1px solid;
	width: 25vh;
	height: 300px;
	margin: 10px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-content: center;
	background-color: #fff;
}

#main_content #content_fir_div #search, #main_content #content_fir_div #member_introduce
	{
	display: block;
	margin: 10px auto;
}

#main_content #content_main_div {
	width: 100vh;
	height: 300px;
	border: 1px solid;
	margin: 10px;
	background-color: #fff;
	font-size: 20px;
	text-align: center;
}

#main_content #content_main_div #searchInput {
	width: 40vh;
	height: 30px;
	border-radius: 10px;
	margin-top: 10px;
}

#main_content #content_main_div #searchInput::placeholder {
	text-align: center;
}

#footer {
	width: 80vw;
	border: 1px solid;
	height: 7vh;
	margin: auto;
	background-color: skyblue;
}

#footer #footer_sign {
	width: 40vw;
	height: 7vh;
	margin: auto;
	display: flex;
	justify-content: space-around;
	align-items: center;
}

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

<script>
	window.onload = function() {
		// main click event
		const mainObj = document.getElementById('main');

		const mainObjFnc = function() {
			const contentMainDivObj = document
					.getElementById('content_main_div');

			contentMainDivObj.innerHTML = '프로젝트입니다.';
		};

		mainObj.addEventListener('click', mainObjFnc);

		// search click event
		const searchObj = document.getElementById('search');

		const searchFnc = function() {
			const contentMainDivObj = document
					.getElementById('content_main_div');

			contentMainDivObj.innerHTML = '<input id="searchInput" type="search" placeholder="검색">';
		};

		searchObj.addEventListener('click', searchFnc);

		// login click event
		const signinObj = document.getElementById('signin');

		const signinObjFnc = function() {
			const contentMainDivObj = document.getElementById('content_main_div');

			let signinStr = '<div id="loginBox">';
			signinStr += '<span id="idBox">ID로그인</span>';
			signinStr += '<input type="text" id="id" placeholder="아이디 입력">';
			signinStr += '<input type="password" id="pw" placeholder="비밀번호 입력">';
			signinStr += '<div id="loginDiv">';
			signinStr += '<input type="submit" value="로그인" id="loginBtn">';
			signinStr += '</div>';
			signinStr += '</div>';

			contentMainDivObj.innerHTML = signinStr;
		};

		signinObj.addEventListener('click', signinObjFnc);

	}
</script>
</head>

<body>
	<!-- header -->
	<div id="header">
		<div class="header__con">
			<button id="main">main</button>
		</div>
		<div class="header__con">
			<button id="board">게시판</button>
		</div>
	</div>

	<!-- main content -->
	<div id="main_content">
		<div id="content_fir_div">
			<div class="content_fir_div__btnCon">
				<button id="search">검색</button>
			</div>
			<div class="content_fir_div__btnCon">
				<button id="member_introduce">팀원소개</button>
			</div>
		</div>
		<div id="content_main_div">
			<div id="loginBox">

				<span id="idBox">ID로그인</span> <input type="text" id="id"
					placeholder="아이디 입력"> <input type="password" id="pw"
					placeholder="비밀번호 입력">

				<div id="loginDiv">
					<input type="submit" value="로그인" id="loginBtn">
				</div>

			</div>
		</div>
	</div>

	<!-- footer -->
	<div id="footer">
		<div id="footer_sign">
			<button id="signup">회원가입</button>
			<button id="signin">로그인</button>
		</div>
	</div>
</body>
</html>