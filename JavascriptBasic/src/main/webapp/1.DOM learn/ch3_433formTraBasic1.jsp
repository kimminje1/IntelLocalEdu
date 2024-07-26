<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_433formTraBasic1.jsp</title>

<style type="text/css">
#theBox {
	

	background: Gainsboro;
}
</style>

</head>



<body>

	 
	<div id='divObj'>
      <form action="#" method="get">
         <div style="border: 1px solid black;">
            <input id='txt1' type="text" value="">
            <input id='txt2' type="text" value="비번 확인">
         </div>
         <div style="border: 1px solid black;">
            <input id='checkBtn' type="button" value="저장">
            <input id='goBtn' type="submit" value="전송">
         </div> 
      </form>
   </div>
  

</body>
<script type="text/javascript">
//document.body.appendChild();설명

	var bodyObj = document.body;
	
	alert(bodyObj.innerHTML);
</script>


</html>