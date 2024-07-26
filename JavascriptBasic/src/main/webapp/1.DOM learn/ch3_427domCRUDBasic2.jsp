<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_427domCRUDBasic1.jsp</title>

<style type="text/css">

</style>




</head>



<body>
	 <h1>문서 객체 조작</h1>
	 <ul id ='theList'>
		
		<li>리스트2</li>	 
		<li>리스트3</li>	 
		<li>리스트4</li>	 
		<li>리스트1</li>	 
	 
	 </ul>
  
</body>
<script type="text/javascript">
	var theListObj = document.getElementById('theList');
	var liTagList = theListObj.getElementsByTagName('li');
	
	//<li>리스트1</li>를 복제
	var copyliTagList =liTagList[3].cloneNode(true);
	
	//복제된 <li>리스트1</li>를 리스트2앞으로 삽입
	theListObj.insertBefore(copyliTagList, liTagList[0]);
	
	//기존의 <li>리스트1</li>을 삭제
	theListObj.removeChild(liTagList[4]);
	
</script>


</html>