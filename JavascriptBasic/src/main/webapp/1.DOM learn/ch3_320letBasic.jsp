<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_320letBasic.jsp</title>
<style type="text/css">

</style>

<script type="text/javascript">
	
//let과 var의 차이	
	var varNum= 10;
	var varNum= 20;
//var 중복선언가능	
	document.write(varNum+'<br>');
//let 중복선언 불가능	
//let은 전체오류뜸/컴파일러처럼 작동안함
	let letNum= 100;
	
	document.write(letNum+'<br>'); 	
//let->타입선언문이 없으면 어디서 선언을 했다고하게
	if (true) {
		//Cannot access 'str' before initialization
		str = '초기화?';
		/* let str = 'asdf'; */
		var str = '신기하게 작동';
		
		alert(str);
	}
	

</script>

</head>



<body>
	 

</body>
<script type="text/javascript">
	alert(letNum+"신기하게 작동하네~");
</script>
</html>