<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_387stringTest1.jsp</title>
<style type="text/css">
#demoview{
 border: 1px solid black;
 font-size: 20px;
}
</style>



</head>



<body>
	 
	<button onclick="strFnc1();">1번 정답</button>
	<button onclick="strFnc2();">2번 정답</button>
	<button onclick="strFnc3();">3번 정답</button>
	<button onclick="strFnc4();">4번 정답</button>
	<button onclick="strFnc5();">5번 정답</button>
	<button onclick="strFnc6();">6번 정답</button>
	
	<div id='demoview'></div>

</body>

<script type="text/javascript">
	
	const examStr1= '자바를 자바라'; //db를 db라
	const examStr2= '자바를 자바라'; //db를 자바라
	const examStr3= '자바를 자바라'; //자바를 잡아라
	const examStr4= '자바를 자바라'; //문자열 안에서 마지막 문자글자가 무엇인지 출력하시오(라)
	const examStr5= 'THANK PSU VERY MUCH'; //thank psu very much
	const examStr6= 'thank psu Very MUCH'; //THANK YOU very much!!
	
	function strFnc1() { //db	를 db라
		let newdivTag = document.getElementById('demoview');
		let updatedStr = examStr1.replace('자바','db');
		updatedStr = updatedStr.replace('자바', 'db');
		newdivTag.innerHTML = updatedStr;
	}
	function strFnc2() { //db를 자바라
		let newdivTag = document.getElementById('demoview');
		let updatedStr = examStr2.replace('자바','db');
		newdivTag.innerHTML = updatedStr;
	}
	function strFnc3() { //자바를 잡아라
		let newdivTag = document.getElementById('demoview');
		let updatedStr = examStr3.replace('자바','db');
		updatedStr = updatedStr.replace('자바', '잡아');
		updatedStr = updatedStr.replace('db', '자바');
		newdivTag.innerHTML = updatedStr;
	}
	function strFnc4() { //라 출력
		let newdivTag = document.getElementById('demoview');
		let updatedStr = examStr4.substring(examStr4.length - 1);
		newdivTag.innerHTML = updatedStr;
	}
	function strFnc5() { //thank psu very much
		let newdivTag = document.getElementById('demoview');
		let updatedStr = examStr5.toLowerCase();
		newdivTag.innerHTML = updatedStr;
	}
	function strFnc6() { //THANK YOU very much!!
		let newdivTag = document.getElementById('demoview');
		
		const updatedStrArr = examStr6.split(' ');
		let updatedStr = '';
		updatedStr += updatedStrArr[0].toUpperCase()+(' ');
		updatedStr +=updatedStrArr[1].replace('psu', 'you')+(' ');
		updatedStr += updatedStrArr[2].replace('v', 'V')+(' ');
		updatedStr += updatedStrArr[3].toLowerCase();
		updatedStr += '!!';
		newdivTag.innerHTML = updatedStr;
	}
	
		
		

	
	
</script>


</html>