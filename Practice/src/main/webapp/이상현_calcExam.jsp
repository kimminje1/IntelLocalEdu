<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>작성자명</title>

<script type="text/javascript">
	// 	파일명을 한글로 본인명으로 수정하시오
	// 	ex:홍길동_calcExam.jsp 
	// 	로 후에 제출한다

	
		function calcFnc() {
		let firstNum = document.getElementById('firstNum');
		let secondNum = document.getElementById('secondNum');
		let demoDiv = document.getElementById("demo");
		let num1 = firstNum.value;
		let num2 = secondNum.value;
		var regex = /^[0-9]*$/;

		if (num1.length < 1 || num2.length < 1) {
			alert("숫자만 입력가능합니다. 다시 입력해주세요");
			firstNum.value = '';
			secondNum.value = '';
		} else if (!regex.test(num1) || !regex.test(num2)) {
			alert("숫자만 입력가능합니다. 다시 입력해주세요");
			demoDiv.textContent = '두 숫자의 곱은?';
			firstNum.value = '';
			secondNum.value = '';
		} else {
			let resultValue = num1 * num2;
			demoDiv.innerHTML = "두 숫자의 곱은? " + resultValue;
		}

	}
</script>

</head>


<body>
	<h3>두 숫자 곱하기</h3>
	<small> 1.만약 2와 3의 값이 입력되어있다고 한다면 “두 숫자의 곱은?6” 이라고 div태그에 출력하시오
		<br /> 2.“두 숫자의 곱은?6”이란 결과가 나왔을 때 문자입력 시 “두 숫자의 곱은?”이라고 div태그에 출력하시오.
		<br /> 3.문자입력시 “숫자만 입력가능합니다. 다시 입력해주세요” 라는 알림말 표시체크 후 두 input태그의 내용을
		지우시오.
	</small>
	<br>
	<fieldset>
		<input type="text" name="firstNum" id='firstNum' value=""> <input
			type="text" name="secondNum" id='secondNum' value="">
		<button type="button" onclick="calcFnc();">Click Me!</button>
		<div id="demo">두 숫자의 곱은?</div>
	</fieldset>

</body>
</html>