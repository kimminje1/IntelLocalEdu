<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>작성자명</title>

<script type="text/javascript">
	/* 파일명을 한글로 본인명으로 수정하시오
	ex:홍길동_calcExam.jsp 
	로 후에 제출한다 */
	function calcFnc() {
		//할당
		var num1 = document.getElementById('firstNum').value;
        var num2 = document.getElementById('secondNum').value;
        const resultDiv = document.getElementById('demo');
        
      
       	//값을 넣지 않은 경우
        if(num1=="" || num2==""){ //""=>value의초기값
        	resultDiv.textContent = '두 숫자의 곱은?';
        	alert("숫자만 입력가능합니다. 다시 입력해주세요");
        	document.getElementById('firstNum').value=""; //input지우기
        	document.getElementById('secondNum').value="";
        } 
        //문자OR 숫자아닌것을  넣은 경우
        else if (isNaN(num1) || isNaN(num2)) {
            resultDiv.textContent = '두 숫자의 곱은?';
            alert("숫자만 입력가능합니다. 다시 입력해주세요"); 
            document.getElementById('firstNum').value=""; //input지우기
        	document.getElementById('secondNum').value="";
        } 
        //두곳 모두 숫자만 넣은 경우->곱셉작동
        else {
            const product = num1 * num2;
            resultDiv.textContent ="두 숫자의 곱은?"+product;
        }
    	
        
	} 
	
</script>

</head>


<body>
	<h3>두 숫자 곱하기</h3>
	<small> 
		1.만약 2와 3의 값이 입력되어있다고 한다면 “두 숫자의 곱은?6” 이라고 div태그에 출력하시오
		<br /> 
		2.“두 숫자의 곱은?6”이란 결과가 나왔을 때 문자입력 시 “두 숫자의 곱은?”이라고 div태그에 출력하시오.
		<br />
		3.문자입력시 “숫자만 입력가능합니다. 다시 입력해주세요” 라는 알림말 표시체크 후 두 input태그의 내용을 지우시오.
	</small>
	<br>
	<fieldset>
		<input type="text" name="firstNum" id='firstNum' value=""> 
		<input type="text" name="secondNum" id='secondNum' value="">
		<button type="button" onclick="calcFnc();">Click Me!</button>
		<div id="demo">두 숫자의 곱은?</div>
	</fieldset>

</body>
</html>