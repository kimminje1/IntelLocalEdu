<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>title</title>
<style type="text/css">

</style>

<script type="text/javascript">
	
	
	
	function testFnc() {
		let imgNum = Math.floor(Math.random() * 3) + 1;
		const newimgTag = document.getElementById('imgTag')
		newimgTag.setAttribute('src','images/img'+imgNum+'.jpg');
		/* +=<img src=' images/img"+imgNum+".jpg ' alt='랜덤이미지' />; */
	}
	
	
</script>

</head>



<body>

	<div id='imgContainer'>
		<img id='imgTag' alt="이미지 경로문제는 알아서 해결" src="images/img1.jpg">
	</div>

	<button onclick="testFnc();">이미지 랜덤 생성</button>




</body>



</html>