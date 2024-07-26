<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_408eventListenerBasic1.jsp</title>

<style type="text/css">
</style>


</head>



<body>
	

	


</body>

<script>
//이름 있는 함수 ->일반함수
//익명함수로 주사위 로직을 구현하시오
//1~9까지 나오는 주사위를 만드시오
//콘솔에 출력한다
//주사위 4번을 굴려서 최고의 숫자를 콘솔에 출력한다
	

	//1~9굴리는 로직
	var diceObj =function() {
		Math.floor(Math.random()*9+1);
	};
	
	//4번굴리고 값을 비교하는 로직
	const diceArr=new Array();
	var fourdiceObj = function() {
		for (var i = 0; i < 4; i++) {
			diceArr[i]=Math.floor(Math.random()*9+1);
		}
		diceArr.sort();
		
		console.log(diceArr[3]);
	};
	/* fourdiceObj(); */
	//검산용

	var fourdiceObjtest = function() {
		for (var i = 0; i < 4; i++) {
			diceArr[i]=Math.floor(Math.random()*9+1);
		}
		diceArr.sort();
		for(var i = 0; i < 4; i++) {
			console.log(diceArr[i]);
		}
		console.log(diceArr[3]);
		
	};
	fourdiceObjtest();
	
	
	
</script>


	
</html>