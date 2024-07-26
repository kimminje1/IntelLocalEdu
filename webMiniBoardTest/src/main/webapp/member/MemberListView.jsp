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

 <jsp:useBean id="memberList" 
      		scope="request" 
       		class="java.util.ArrayList"
      		type="java.util.ArrayList<spms.dto.MemberDto>"
      	/> 

<body>
	<div style='text-align:center;padding-top:20px;'>
	<h1>회원 목록</h1>
	<jsp:include page="/Header.jsp"/>
	<p>
      <a href="./add">신규 회원 등록</a>
   </p>
   </div>
   <table border='1'>
 
   <tr style='background: #d3d3d3'>
       <th style='width: 10%;'>번호</th>
       <th style='width: 20%;'>이름</th>
       <th style='width: 20%;'>이메일</th>
       <th style='width: 20%;'>생성 날짜</th>
       <th style='width: 20%;'>수정 날짜</th>
       <th style='width: 10%;'>비고</th>
   </tr>
   <%
   
  
   
//    		ArrayList <MemberDto > memberList =
//    			(ArrayList<MemberDto>)request.getAttribute("memberList");
   		for(MemberDto memberDto : memberList){
   %>
   <tr style='background: #f3f3f3'>
	   <td style='width: 10%;'><%=memberDto.getmemberNo()%></td> 
	  
	   <td style='width: 20%;'> 
		   <a href='./update?memberNo=<%=memberDto.getmemberNo() %>'><%=memberDto.getmemberName() %> 
		   </a>
	   </td>
	   <td style='width: 20%;'><%=memberDto.getEmail() %></td>
	   <td style='width: 20%;'><%=memberDto.getCreateDate() %></td>
	   <td style='width: 20%;'><%=memberDto.getModifiedDate() %></td>
	   <td style='width: 10%;'><a href='./delete?memberNo=<%=memberDto.getmemberNo()%>'>[삭제]</a></td>
   </tr>
  
      <% 
   		} //for each문 종료
      
      %>
   </table>
	<jsp:include page="/Tail.jsp"/>
</body>
</html>