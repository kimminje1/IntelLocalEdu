<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_ArrowFunction.jsp</title>

<style type="text/css">
</style>
<script>
// 화살표 함수를 사용해서 div 태그 안에 구구단을 2단부터 9단까지 출력하시오.
	
window.onload = function() {
		
	const mul = () => {
		const gugudanObj = document.getElementById('gugudan');
		var gugu='';
		
	    for (let i = 2; i <= 9; i++) {
	        for (let j = 1; j <= 9; j++) {
	        	gugu +='<div>'+i+'*'+j+'='+(i*j)+'</div>';
	        }
	    }
	    
	    gugudanObj.innerHTML=gugu;
	};
	
	mul();
	
	//const mulFnc = () => mul();
	
	//mulFnc();
}

// 함수 호출

</script>

</head>


<body>

<div id="gugudan">

</div>

</body>

</html>