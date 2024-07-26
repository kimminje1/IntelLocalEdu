<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch3_411preventDefaultTest1</title>

<script>
	window.onload = function() {
		
		var lastNameObj =document.getElementById('lastName');
		var firstNameObj = document.getElementById('firstName');
		var submitbuttonObj = document.getElementById('submitButton');
		function submitFnc(event) {
             var lastNameLength = lastNameObj.value.length;
             var firstNameLength = firstNameObj.value.length;
			var fullnameLenght=	lastNameLength + firstNameLength
             if ( 
	fullnameLenght >= 3 && fullnameLenght <= 4) {

			} else {
				event.preventDefault();

			}
		}
		;

		/* location.reload(); */

		submitbuttonObj.addEventListener('click', submitFnc);

	};
</script>
</head>
<body> 
	<form action="./success.jsp"> <!-- 성공페이지에서 성공 경고창만 뛰우시오 -->
		<div class="Xb9hP">
			<input type="text" value="" id="lastName">
			<div class="AxOyFc snByac" aria-hidden="true">성(선택사항)</div>
		</div>
		<div class="Xb9hP">
			<input type="text" value="" id="firstName">
			<div class="AxOyFc snByac" aria-hidden="true">이름(선택사항)</div>
		</div>
		
		<div class="Xb9hP">
			<div class="AxOyFc snByac" aria-hidden="true">
				다음 페이지 이동 전에 성이름이 3~4글자면 작동되게 하시오
			</div>
			<input type="submit" value="다음" id="submitButton">
		</div>
	</form>

</body>
</html>