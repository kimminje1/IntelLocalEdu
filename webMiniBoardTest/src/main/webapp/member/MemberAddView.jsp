 <%@page import="org.apache.tomcat.websocket.pojo.PojoMethodMapping"%>
<%@page import="spms.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>회원 add</title>
<style type="text/css">
table {width: 100%;border: 1px solid #e3e3e3;border-collapse: collapse;}
th, td {border: 1px solid #e3e3e3;padding: 10px;}
table, th, td {
    text-align: center;
    vertical-align: middle;
}
</style>

<script type="text/javascript">

</script>

</head>



<body>
	<jsp:include page="/Header.jsp"/>
	<div style='text-align:center;padding-top:20px;'>
	<form action='./add' method='post'>
   <table border='1'>
 		<tr>
		<td style='width:20%; background: #f3f3f3'>이름</td>
		<td><input type='text' id='memberName' name='memberName'></td>
		</tr>
		<tr>
		<td style='background: #f3f3f3'>이메일</td>
		<td><input type='text' id='email' name='email'></td>
		</tr>
		<tr>
		<td style='background: #f3f3f3'>암호</td>
		<td><input type='password' id='password' name='password'></td>
		</tr>
		</table>
		<div style='padding-top: 20px;text-align: center;'>
		<input type='submit' value='추가'>
		<input type='reset' value='취소' onclick=javascript:location.href='./list'>
   		</div>
   		</form>
   		<jsp:include page="/Tail.jsp"/>
   		</div>
   		
   
 

</body>
</html>