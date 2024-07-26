<%@page import="org.apache.tomcat.websocket.pojo.PojoMethodMapping"%>
<%@page import="spms.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<style type="text/css">
table {width: 100%;border: 1px solid #e3e3e3;
border-collapse: collapse;}
th, td {border: 1px solid #e3e3e3;padding: 10px;}
</style>

<script type="text/javascript">

</script>

</head>



<body>




	<jsp:useBean id="memberList" scope="request"
		class="java.util.ArrayList"
		type="java.util.ArrayList<spms.dto.MemberDto>" />
	<%
	//    		ArrayList <MemberDto > memberList =
	//    			(ArrayList<MemberDto>)request.getAttribute("memberList");

	MemberDto memberDto = (MemberDto) request.getAttribute("memberDto");
	%>


	<jsp:include page="/Header.jsp"/>
	<h1>회원 상세 정보</h1>
	<% if (memberDto != null) { %>
	<form action='./update' method='post'>
		<table border='1'>
			<tr>
				<td style='width: 20%; background: #f3f3f3'>번호</td>
				<td><input type='text' name='memberNo' value= <%=memberDto.getmemberNo()%> readonly></td>
			</tr>
			<tr>
				<td style='background: #f3f3f3'>이름</td>
				<td><input type='text' name='memberName' value=<%=memberDto.getmemberName() %>></td>
			</tr>
			<tr>
				<td style='background: #f3f3f3'>이메일</td>
				<td><input type='text' name='email' value=<%=memberDto.getEmail()%>></td>
			</tr>
			<tr>
				<td style='background: #f3f3f3'>비밀번호</td>
				<td><input type='text' name='pwd' value=<%=memberDto.getPassword()%>></td>
			</tr>
			<tr>
				<td style='background: #f3f3f3'>가입일</td>
				<td><%=memberDto.getCreateDate() %></td>
			</tr>
			<tr>
				<td style='background: #f3f3f3'>수정일</td>
				<td><%=memberDto.getModifiedDate() %></td>
			</tr>
		</table>
		<div style='padding-top: 20px; text-align: center;'>
			<input type='submit' value='정보 수정'>
			 <input type='button'value='삭제'
			 onclick='location.href="./delete?memberNo=<%=memberDto.getmemberNo()%>"'/> 
			 <input type='button' value='취소' onclick='location.href="./list"' />
		</div>
	</form>
	<jsp:include page="/Tail.jsp"/>
<% } else { %>
    <h1>회원 상세 정보가 없습니다.</h1>
<% } %>
</body>
</html>