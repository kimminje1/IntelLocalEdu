<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
	function sendParent() {
		var parentInfoObj = window.opener.document.getElementById('parentInfo');
        var childInfoValue = document.getElementById('childInfo').value;
        parentInfoObj.innerHTML =childInfoValue;
	
	}
	function dateshow() {
		let today = new Date();
		alert("당신의 페이지 방문일은 "+today.toLocaleDateString('en-US')+" 입니다");
		
	}
	/* window.onload =function() {
		let today = new Date();
		var childInfoObj = document.getElementById('childInfo');
		childInfoObj.value = today.toLocaleDateString('en-US');
	} */
	//현재날짜로 수정 DOMContentLoaded->로딩완료후 이벤트발생
	window.addEventListener('DOMContentLoaded', function() {
		let today = new Date();
		var childInfoObj = document.getElementById('childInfo');
		childInfoObj.value = today.toLocaleDateString('en-US');
	})
</script>
<style type="text/css">
img {
	width: 300px;
	height: 300px;
}

#rootContainer {
    margin: auto;
    width: 50%;
    border: 3px solid green;
    padding: 10px;
}
</style>
</head>
<body onLoad="dateshow()">
	<div id='rootContainer'>
		<img src="../images/img2.jpg">
		<form>
			<input type="button" value="부모창 정보 전달" onclick="sendParent();">
			<input type="text" id='childInfo' value="부모창 정보 전달">
		</form>
	</div>
</body>
</html>