<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_408eventListenerBasic1.jsp</title>

<style type="text/css">
div {
  padding: 50px;
  background-color: rgba(255, 0, 0, 0.2);
  text-align: center;
  cursor: pointer;
}
</style>
<script type="text/javascript">
	window.onload = function() {
		//child id값 출력
		var childDivObj =document.getElementById('childDiv');
	
		childDivObj.addEventListener('click', func2);
	
	 	function func2(event) {
			alert(childDivObj.id);
			event.stopPropagation();
		} 
	 	//부모id값 등록
		 var parentDivObj =document.getElementById('parentDiv');
	 
		 parentDivObj.addEventListener('click', function(e) {
		 alert(parentDivObj.id);
		 }, false);	
		 };

</script>

</head>



<body>
	window.onload에서 작업
	a태그를 누르면 네이버 메인페이지로 이동한다
	그런데 ChildDiv의 id값을 경고창에 출력한 후 이동해야한다
	그런데 parentDiv에도 이벤트로 자신의 id값을 경고장에 출력하는 이벤트는 등록되어 있는데
	작동은 안되어야 한다
	그렇게 만들어 보시오
	<h1>The stopPropagation() Method</h1>

	<p>Click DIV 1:</p>
	<div id='parentDiv'>
		DIV 2
  		<div id='childDiv' >
		 <a href='https://www.naver.com/'>네이버 메인 페이지로 이동</a>
		</div>
	</div>


	<p>Because DIV 1 is inside Div 2, both DIVs get clicked when you click on DIV 1.</p>
	<p>Check the stop propagation checkbox, and try again.</p>
	<p>The stopPropagation() method allows you to prevent propagation of the current event.</p>
	


</body>




	
</html>