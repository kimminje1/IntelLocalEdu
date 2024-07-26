<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_427domCRUDTest1.jsp</title>

<style type="text/css">
#theBox {
	

	background: Gainsboro;
}
</style>

</head>



<body>

	 <div id='theBox'>
	 	<h1>태그 생성 연습</h1>
	 	

	 </div> 
	<!-- <div id ='container' style ="background: teal; width: 400px;">
	 	<table id='myTable' style="border= 1px solid black;
	 	 border-collapse: collapse">
	 		<tr>
	 			<td>이것만 해도</td>
	 		</tr>
	 		<tr>
	 			<td>싶진 않다</td>
	 		</tr>
	 	</table>
	 
	 </div>  -->

  

</body>
<script type="text/javascript">


	//버튼생성
	var newbuttonTag1 = document.createElement('button');
	var newbuttonTag2 = document.createElement('button');
	var newText1 = document.createTextNode('새로 만든 버튼1');
	var newText2 = document.createTextNode('새로 만든 버튼2');
	
	//버튼
	var theObj = document.getElementById('theBox');
	theObj.appendChild(newbuttonTag1);
	theObj.appendChild(newbuttonTag2);
	newbuttonTag1.appendChild(newText1);
	newbuttonTag2.appendChild(newText2);
	
	//띄어쓰기
	var br1 = document.createElement('br');
	document.body.appendChild(br1);
	
	//테이블생성
 	var newdivTag = document.createElement('div');
	var newtableTag1 = document.createElement('table');
	var newtrTag1 = document.createElement('tr');
	var newtrTag2 = document.createElement('tr');
	var newtdTag1 = document.createElement('td');
	var newtdTag2 = document.createElement('td');
	var newText1 = document.createTextNode('이것만 해도');
	var newText2 = document.createTextNode('싶진 않다');
	//테이블상속
	newtdTag1.appendChild(newText1);
	newtdTag2.appendChild(newText2);
	newtrTag1.appendChild(newtdTag1);
	newtrTag2.appendChild(newtdTag2);
	newtableTag1.appendChild(newtrTag1);
	newtableTag1.appendChild(newtrTag2);
	
	
	document.body.appendChild(newdivTag);

	
	newdivTag.appendChild(newtableTag1);
	
	newdivTag.setAttribute('id', 'container');
	newtableTag1.setAttribute('id', 'myTable');
	
	/* var theObj1 = document.getElementById('container');
	theObj1.appendChild(newtableTag1); */ 
	
    newdivTag.setAttribute('style', 'background: teal; width: 400px;');
	newtableTag1.setAttribute('style','border: 1px solid black; border-collapse: collapse;');
	newdivTag.appendChild(newtableTag1); 
</script>


</html>