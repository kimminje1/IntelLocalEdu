<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>title</title>
<style type="text/css">
div {
	border: 1px solid black;
	border-radius: 10px;
}
</style>

<script type="text/javascript">
/* 숫자 판별하기
입력란에 값을 입력하고 버튼을 클릭하면 입력값이 숫자인지 아닌지 판별하여 알림창으로 "숫자입니다"/"숫자가 아닙니다" 출력하기 */
	function calcFnc() {
		var numberValue= document.getElementById('number').value;
		
		if (isNaN(numberValue)) {
			alert("숫자가 아닙니다");
		} else {
			alert("숫자입니다");
		}
	}
</script>

</head>



<body>
	 <div><h4>숫자 입력</h4>
	 <input type="text" id="number" value="">
	 <input type="button"id="btn1" onclick="calcFnc();" value="button">
	 </div>

</body>



</html>