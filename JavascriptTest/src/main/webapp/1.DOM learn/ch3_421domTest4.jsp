<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_421domTest4.jsp</title>

<style type="text/css">

</style>


</head>


<body>
	<div id='formContainer'>
		<h1>선택자</h1>
		<h2 id="title">아이디/비밀번호</h2>
		<ul id='loginInfo'>
			<li><input type='text' id='textId' value=''></li>
			<li><input type='password' id='passwordNumber'value=''></li>
		</ul>
		<h2 id="title2">개인정보</h2>
		<ul id="userInfo">
			<li><input type='number' id='age' value=''></li>
			<li><input type='text' id='job' value=''></li>
			<!-- <li><input type="checkbox" name="gender" value="male"> 남
     		<input type="checkbox" name="gender" value="female"> 여</li> -->
			
			<li><input type='text' id='gender' value=''></li> 
			<li><input type='number' id='birthday' value=''></li>
			<li><input type='text' id='hobby' value=''></li>
			<li><input type='text' id='information' value=''></li>
		</ul>
	</div>

</body>

<script type="text/javascript">
// 순수 코드 작성
/* 1.위의 formContainer 안에 있는 li태그 내부에 form의 input 태그를 작성한다

==========
	
loginInfo의 input 태그 값에는 자신의 아이디, 비번 값을 할당한다
userInfo의 input 태그에는 
나이
직업
성별
생년월일
취미
기타정보를 자바스크립트로 입력한다
 */
 
 
 //이방법은 id를찾아서하는방법
	/* document.getElementById("textId").value = 'KMJ'; 
 	 document.getElementById("passwordNumber").value = 1557; 
 
 	document.getElementById("age").value = 29;
 	document.getElementById("job").value = '없음';
 	document.getElementById("gender").value = 'male';
 	document.getElementById("birthday").value = '19950319';
 	document.getElementById("hobby").value = 'game';
 	document.getElementById("information").value = '없음'; */
	
 	
 var loginInfoList = document.getElementById('loginInfo'); 	
 var loginInfo1 =loginInfoList.children[0];
 var loginInfo2 =loginInfoList.children[1];
 var userInfoList = document.getElementById('userInfo');
 var userInfo1 =userInfoList.children[0];
 var userInfo2 =userInfoList.children[1];
 var userInfo3 =userInfoList.children[2];
 var userInfo4 =userInfoList.children[3];
 var userInfo5 =userInfoList.children[4];
 var userInfo6 =userInfoList.children[5];
 var userInfo7 =userInfoList.children[6];
 
 
 //아이디
 loginInfo1.children[0].value= 'KMJ';
//비밀번호
 loginInfo2.children[0].value= '1555';
 // 나이
 userInfo1.children[0].value = 29;
//직업
 userInfo2.children[0].value = '없음';
//성별
 userInfo3.children[0].value = 'male';
//생년월일
 userInfo4.children[0].value = 19950319;
//취미
 userInfo5.children[0].value = 'game';
//기타정보
userInfo6.children[0].value = '없음';
</script>

</html>