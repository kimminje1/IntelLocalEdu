<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>입사지원서</title>

<style type="text/css">
#container{
border : 1px solid black;
height :200px;
width:  100%;
}
</style>



</head>



<body>
		<h1>두 숫자 곱하기</h1>
		<p>1.만약 두 2와 3의 값이 입력되어있다고 하면 '두 숫자의 곱은?6'이라고 div태그에 출력하시오</p>
		<p>2.'두 숫자의 곱은?6'이란 결과가 나왔을 때 문자입력시 '두 숫자의 곱은?'이라고 div태그에 출력하시오</p>
		<p>3.문자 입력시 "숫자만 입력가능합니다 다시 입력해주세요"리는 알림말 표시체크후 두 input태그의 내용을 지우시오</p>
		<div id="container">
		<form action="" onsubmit="multiply();">
		<input type="text" id="firstnumber">
		<input type="text" id="secondnumber">
		<button id="btn1" type="submit">Click Me!</button>
		<div id="result" >두 숫자의 곱은?</div>
		</form>
		
		
		</div>

</body>

<script type="text/javascript">
//숫자만 입력해주세요 
	function multiply() {
		event.preventDefault();
		var num1 = document.getElementById('firstnumber').value;
        var num2 = document.getElementById('secondnumber').value;
        const resultDiv = document.getElementById('result');
        if (isNaN(num1) || isNaN(num2)) {
            resultDiv.textContent = '두 숫자의 곱은?';
            alert("숫자만 입력가능합니다 다시 입력해주세요"); 
            num1=null; //input지우기
            num2=null;
            /* document.getElementById('firstnumber').value=null;
            document.getElementById('secondnumber').value=null; */
            
        } else {
            const product = num1 * num2;
            resultDiv.textContent ="두 숫자의 곱은?"+product;
            
        }
        
	} 
        
        
       /*  var result = num1 * num2;
        document.getElementById('result').innerText = '두 숫자의 곱은 ' + result; */
	

</script>


</html>