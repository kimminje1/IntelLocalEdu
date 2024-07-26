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
         <li>getElementById</li>
         <li>getElementsByTagnName</li>
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

/* var tagObj = document.getElementById('title');

alert(tagObj);
alert(tagObj.id);
alert(tagObj.textContent);

tagObj.style.color ='red'; */
//id가 title2인 태그의 글자 크기를 20px;로 변경하시오
var tagObj = document.getElementById('title2');
tagObj.style.fontSize ='20px';

//id가 list인 태그의 배경색을 회색으로 적용하시오	
var tagObj2 = document.getElementById('list');
tagObj2.style.backgroundColor = 'gray';

</script>	


</html>