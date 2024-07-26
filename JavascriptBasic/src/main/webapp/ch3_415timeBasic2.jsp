<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_415timeBasic2.jsp</title>

<style type="text/css">
</style>



</head>



<body>
	<button id="stopIt">작동 멈춰!</button>	 

</body>

<script type="text/javascript">
	//일정 시간마다 지정된 함수를 반복적으로 실행하는 함수
	//표현식
	/* setInterval(function() {
		실행문
	}, ms); */
	

	let cnt = 0;
	
	 var timeObj =setInterval(function() {
		cnt++;
		alert('4초마다 실행'+cnt);
	},4000);
	 
	var stopObj =document.getElementById('stopIt');
	 
	stopObj.onclick =function(){
		clearInterval(timeObj);
	}
	
	
</script>

</html>