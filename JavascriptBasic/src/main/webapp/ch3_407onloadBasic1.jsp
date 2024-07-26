<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_407onloadBasic1.jsp</title>

<style type="text/css">
</style>

<script type="text/javascript">
//지연 Lazy body준비/위에있을때
	
	window.onload = function() {
		var divTagObj =document.getElementById('divTag');

		alert(divTagObj.innerHTML);
		/* alert('이벤트 호출'); */
	};
	
</script>

</head>



<body>
	 
	 <div id='divTag' style="width:200px; border:1px solid black;">
	 	드디어 onload한다~
	 </div>

</body>

<script type="text/javascript">
	

</script>

</html>