<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_433formTraBasic2.jsp</title>
<script> //form은 name으로 접근이 쉽다.
        window.onload = function() {
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
    </script>	
<style type="text/css">
</style>

<script type="text/javascript">


</script>

</head>



<body>
	  <form action="#" name="frm1">
        <input type="search" name="search" placeholder="검색어입력">
        <input type="submit" value="확인">
    </form>
    <form action="#" name="frm2">
        <input type="text" name="subject" placeholder="과목입력">
        <input type="password" name="credit" placeholder="학점입력">
        <input type="submit" value="확인">
    </form>

</body>



</html>