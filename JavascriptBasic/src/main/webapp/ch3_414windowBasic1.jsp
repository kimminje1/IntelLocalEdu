<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_414windowBasic1.jsp</title>

<style type="text/css">
</style>
<script>

	window.onload = function() {
		var bt = document.getElementById('bt');
		bt.onclick = function() {
			window.open('http://icoxpublish.com', 'icox',
					'width=600, height=700, left=100, top=10' );
		};
	};
	
	
	
</script>


</head>



<body>
	  
	 <button id="bt">새창열기</button>

</body>

<script type="text/javascript">


</script>

</html>