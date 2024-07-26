<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_387arrayBasic1.jsp</title>

<style type="text/css">
</style>
<script type="text/javascript" src="./js/commonView.js"></script>


</head>



<body>
	 
	 <div id='commonview'>
	 	공통단?
	 	
	 </div>

</body>
<script type="text/javascript" >

//2차원 배열
	var oneArr =new Array();
	
	oneArr[0]= 1;
	oneArr[1]= 2;
	oneArr[2]= 3;
	
	var twoArr = new Array();
	
	twoArr[0] =  new Array();
	twoArr[1] =  new Array();

	/* twoArr[0][0] = 1;
	twoArr[0][1] = 2;
	twoArr[0][2] = 3;
	
	twoArr[1][0] = 4;
	twoArr[1][1] = 5;
	twoArr[1][2] = 6; */
	
	var	num= 1;
	for (var i = 0; i <= 1; i++) {
		for (var j = 0; j <= 2; j++) {
			twoArr[i][j]=num;
			num+=1;
			document.write(twoArr[i][j]);
		}
	}
	
	/* document.write(twoArr[0][0]);
	document.write(twoArr[0][1]);
	document.write(twoArr[0][2]);
	document.write(twoArr[1][0]);
	document.write(twoArr[1][1]);
	document.write(twoArr[1][2]); */
	
/* 	alert(twoArr[0][0]);
	alert(twoArr[0]);
	alert(twoArr[1][2]); */
	
	

	
</script>




</html>