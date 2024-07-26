<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_349gugudanCheck.jsp</title>

<style type="text/css">
div{
	font-size: 25px;
	border:1px solid black;
}
span{
 border:1px solid black;
}
.border1{
 border:1px solid black;
}


</style>


</head>



<body>
<!-- div와span을 활용해 gugudan만들기 -->
	 

</body>
 <script type="text/javascript">
 
	/* var newdivTag = document.createElement('div');
	
	for (var i = 2; i <= 9; i++) {
		var newspanTag = document.createElement('span');
	    var content = '';	
	    for (var j = 1; j <= 9; j++) {
	        content += i + '*' + j + '=' + (i * j) + ' ';
	    }
	    ;
	    newdivTag.appendChild(newspanTag);
	    newspanTag.innerHTML = content;
	    newdivTag.innerHTML += '<br>'; 
	}
	document.body.appendChild(newdivTag);
	content.setAttribute("class","border1") */
	
	let newdiv = '<div>';
	for (var i = 2; i <= 9; i++){
		newdiv+='<div>';
		 for (var j = 1; j <= 9; j++){
			 newdiv+='<span>'+i + '*' + j + '=' + (i * j) + '</span>';
		 }
		 newdiv+='</div>';
	}
	newdiv+='</div>';
	document.write(newdiv);
	
	
</script>
 


</html>