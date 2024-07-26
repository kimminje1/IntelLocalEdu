<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_415timeBasic2.jsp</title>

<style type="text/css">
#stopIt{
	float: right;
	width: 300px;
	height: 300px;
}
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
		alert('2초마다 뜨는 경고창'+cnt);
	},2000);
	 
	var stopObj =document.getElementById('stopIt');
	 
	stopObj.onclick =function(){
		if(cnt<4) {
			alert('통과');
		}
		else {
			alert('꽝');
		}
		clearInterval(timeObj);
	}
	//2초마다 올라감 오른쪽에 버튼있음, 6초안에 버튼을 누르면 통과 //	
	
</script>

</html>