<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_414windowBasic2.popup.jsp</title>

<style type="text/css">
	*{margin:0; padding:0;}
</style>
<script type="text/javascript">

	function getparentTitleFnc() {
		let childInfoObj =document.getElementById('childInfo');
		
		childInfoObj.value=
			window.opener.document.getElementById('parentTitle').innerHTML;
	}
</script>


</head>



<body>
	<h1>여기는 자식윈도우</h1>
	<p><img src="images/popup.jpg" alt="이달에 새로나온책"  usemap="#pop"/></p>
	<map name="pop" id="pop">
    	<area shape="rect" coords="228,371,294,399" href="#" 
    			onclick="window.close();" alt="창닫기"/>
	</map>
	
	<input type="text" id='childInfo'value="부모의 값을 가져온다?">
	<input type="button" onclick="getparentTitleFnc();" value="동작버튼">
	
	
	
</body>



</html>