<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>DomControlTest4_Preview</title>
</head>

<body>
	
	<div>
		<ul id='theList'>
			<li>리스트2</li>
			<li>리스트3</li>
			<li>리스트1</li>
			<li>리스트4</li>
		</ul>
	</div>
	
	<h1>문서 객체 조작</h1>
	
	<div id='thirdDiv'>
		빈 태그 이 태그 위에 새로운 div태그 추가
	</div>
	
</body>

<script type="text/javascript">
//1,23만 잇어야함	 빈 태그 이 태그 위에 새로운 div 태그 추가
	
	var theListObj = document.getElementById('theList');
	var liTagList = theListObj.getElementsByTagName('li');
	
	
	//<li>리스트1</li>를 복제
	var copyliTagList =liTagList[2].cloneNode(true);
	//복제된 <li>리스트1</li>를 리스트2앞으로 삽입
	theListObj.insertBefore(copyliTagList, liTagList[0]);
	//기존의 <li>리스트1</li>을 삭제
	theListObj.removeChild(liTagList[3]);
	theListObj.removeChild(liTagList[3]);
	//생성
	var newdivTag = document.createElement('div');
	var newulTag = document.createElement('ul');
	var newliTag1 = document.createElement('li');
	var newliTag2 = document.createElement('li');
	var newliTag3 = document.createElement('li');
	var newliTag4 = document.createElement('li');
	var newText1 = document.createTextNode('리스트1');
	var newText2 = document.createTextNode('리스트2');
	var newText3 = document.createTextNode('리스트3');
	var newText4 = document.createTextNode('리스트4');
	//부모
	newliTag1.appendChild(newText1);
	newliTag2.appendChild(newText2);
	newliTag3.appendChild(newText3);
	newliTag4.appendChild(newText4);
	
	newulTag.appendChild(newliTag1);
	newulTag.appendChild(newliTag2);
	newulTag.appendChild(newliTag3);
	newulTag.appendChild(newliTag4);
	
	newdivTag.appendChild(newulTag);
	//id,스타일넣기 
	newdivTag.setAttribute('id', 'secondDiv');
	newdivTag.setAttribute('style', 'border: 1px solid black;');
	newulTag.setAttribute('style','background:black;');
	newliTag1.setAttribute('style','border:1px solid black; color:white;');
	newliTag2.setAttribute('style','border:1px solid black; color:white;');
	newliTag3.setAttribute('style','border:1px solid black; color:white;');
	newliTag4.setAttribute('style','border:1px solid black; color:white;');
	
	//div넣기 
	var  thirddiv =document.getElementById('thirdDiv');
	document.body.insertBefore(newdivTag,thirddiv); 
	
	
	
	
	
</script>



</html>

