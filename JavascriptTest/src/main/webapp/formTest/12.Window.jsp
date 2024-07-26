<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>window_open()</title>
<script type="text/javascript">

	//올리면 띄움
	function mover() {
		window.open("./12.Window_close.jsp", "windowclose",
				"width=768px,height=800px, left=200px, top=20px");
	}
	
	
</script>
</head>

<body onLoad="alert('이미지에 마우스를 올려보세요')">
	<img src="../images/img2.jpg" onmouseover="mover();" hspace="100" vspace="200">
	
	<div id='parentInfo'>
		현재 월/일/년도가 이곳에 나오도록 하시오.
		ex) 11/28/2016
	</div>
</body>

</html>