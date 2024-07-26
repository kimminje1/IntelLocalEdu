<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_421domTest1.jsp</title>
<style type="text/css">


</style>



</head>



<body>
	 <div>
      <h1>선택자</h1>
      <h2 id="title">
         원거리 선택자
      </h2>
      <ul>
         <li>
            getElementById
         </li>
         <li>
            getElementsByTagnName
         </li>
      </ul>
      <h2 id="title2">
         근거리 선택자
      </h2>
      <ul id="list">
         <li>
            parentNode
         </li>
         <li>
            childNodes
         </li>
         <li>
            children
         </li>
         <li>
            firstChild
         </li>
         <li>
            previousSibling
         </li>
         <li>
            nextSibling
         </li>
      </ul>
   </div>

</body>
<script type="text/javascript">

//모든 li태그들에 class를 작성한다

//서로 다른 ul을 통해 li들을 각각 적용한다
//첫번째 ul의 li들은 배경색을 분홍색으로 지정한다
//두번째 ul의 li들은 경계선을 모두 서로 다른 값으로 지정한다
var myTagUlList = document.getElementsByTagName("li");

for (var i = 0; i < myTagUlList.length; i++) {
	myTagUlList[i].className= 'dy_cls_input';
	
}


var myTagList = document.getElementsByTagName("ul"); //배열

var myTagObj  = myTagList[0].getElementsByTagName('li'); //ul의 1번째것


for (var i = 0; i < myTagObj.length; i++) {
	myTagObj[i].style.backgroundColor ='pink';
}

var myTagObj2  = myTagList[1].getElementsByTagName('li'); //ul의 2번째것

/*  myTagObj2[0].style.border = '3px solid skyblue';
myTagObj2[1].style.border = '3px solid red';
myTagObj2[2].style.border = '3px solid blue';
myTagObj2[3].style.border = '3px solid pink';
myTagObj2[4].style.border = '3px solid gray';
myTagObj2[5].style.border = '3px solid black';    */

/* var borderColorList = ['Crimson','LightSalmon','GoldenRod','DarkSeaGreen',
	'DeepSkyBlue','DarkBlue'];

for(var i = 0; i <  myTagObj2.length; i++){
	 myTagObj2[i].style.border 
	 = (i+1) + 'px solid' + borderColorList[i];
 }
 
  */

</script>	


</html>