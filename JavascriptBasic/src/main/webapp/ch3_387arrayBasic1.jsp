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
	var numArr = new Array();
	
	 numArr[0] = 1;
	numArr[1] = 2;
	numArr[2] = 3; 
	
	/* for (var i = 0; i < 10; i++) {
		numArr[i]=i;
	} */
	
 	/* commonViewFnc(numArr); */

	
	
	var strArr =['red','blue','green'];
	
	
	/* commonViewFnc(strArr);
	 */
		
//	*for of문
	
	for (let i of strArr) {
		/* document.write(i+'<br>'); */
	}
	
	 document.write('<br><br>');
	 
// *for in문	 
	 for (let i in strArr) {
		/* document.write(i+'<br>'); */
	}

// 실제 자바의 for each문 
	 numArr.forEach(function(obj) {
		 document.write(obj+'<br>');
	});
	 
	 
	
</script>




</html>