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
		var pTagObj =document.getElementById('demo');
		var htmlStr = '';
		
		htmlStr +='<input type="text" value="하늘색">';
		pTagObj.style.backgroundColor="skyblue";
		pTagObj.innerHTML=htmlStr;
		
	};
	
	
</script>

</head>



<body>
	 
	<h1>The Element Object</h1>
	<h2>The removeEventListener() Method</h2>

	<div id="myDIV">
		This orange element has an onmousemove event handler 
		that displays a random number when you move the mouse inside.
    	<p>html p태그에  id="demo"" input태그 하나 생성하고 value에 하늘색,
    		p태그에는 하늘색 배경색을 적용하시오 
    	</p>
    	<button>Insert</button>
	</div>

	<p id="demo">
	
	</p>
</body>

<script type="text/javascript">
	

</script>

</html>