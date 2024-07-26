<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_433formTraBasic2.jsp</title>
<script> //form은 name으로 접근이 쉽다.
   <!--      window.onload = function() {
            var frm1 = document.frm1;
            var frm2 = document.frm2;
            //이름접근법
            console.log(frm1.search.placeholder);
            console.log(frm2.subject.placeholder);
            console.log(frm2.credit.placeholder);
            //객체쪽 접근법
            console.log(document.forms[0].elements[0].placeholder);
            console.log(document.forms[1][1].placeholder);
            console.log(document.forms['frm1'].elements['search'].placeholder);
            console.log(document.forms['frm2']['subject'].placeholder);
        }
    </script> -->	
<style type="text/css">
</style>



</head>



<body>
	  <!-- <form action="#" name="frm1">
        <input type="search" name="search" placeholder="검색어입력">
        <input type="submit" value="확인">
    </form>
    <form action="#" name="frm2">
        <input type="text" name="subject" placeholder="과목입력">
        <input type="password" name="credit" placeholder="학점입력">
        <input type="submit" value="확인">
    </form>-->
    
	<div id='divObj'> 
      <form action="#" name='formObj' method="get">
         <div style="border: 1px solid black;">
            <input id='txt1' type="text" name="pwd" value="">
            <input id='txt2' type="text" value="" title="value에 비번 확인 입력하기">
         </div>
         <div style="border: 1px solid black;">
            <input id='checkBtn' type="button" value="저장">
            <input id='goBtn' type="submit" value="전송">
         </div>
         
      </form>
   </div>
 <!-- 이름으로 접근해서 value에 본인이름 3글자 입력하기 -->
</body>
<script type="text/javascript">

	var frm1 = document.formObj;
	var frm2 = document.forms[0];

	frm1.pwd.value ="KMJ"
	frm2.txt2.value = frm1.pwd.value
	


</script>


</html>