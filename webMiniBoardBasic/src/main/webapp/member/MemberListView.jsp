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

</style>

<script type="text/javascript">

</script>

</head>



<body>
	<jsp:include page="/Header.jsp"/>
	<h1>회원 목록</h1>
	<p>
      <a href="./add">신규 회원 등록</a>
   </p>
   
<%--    <jsp:useBean id="memberList" --%>
<%--    		scope="request" --%>
<%--    		class="java.util.ArrayList" --%>
<%--    		type="java.util.ArrayList<spms.dto.MemberDto>"		 --%>
<%--    /> --%>
<!--    위아래동일한 코드임 -->
   <% 
   java.util.ArrayList<MemberDto> memberList =
   (ArrayList<MemberDto>)request.getAttribute("memberLisst");
   if(memberList ==null){ 
	   memberList = new ArrayList<spms.dto.MemberDto>(); 
	   request.setAttribute("memberList", memberList); 
   } 
   
   %>
   
   <%
//    		ArrayList <MemberDto > memberList =
//    			(ArrayList<MemberDto>)request.getAttribute("memberList");
   		for(MemberDto memberDto : memberList){
   %>
 		 <%=memberDto.getmemberNo()%>
      <a href='./update?memberNo=<%=memberDto.getmemberNo() %>'><%=memberDto.getMemberName() %>
      </a>,
      <%=memberDto.getEmail() %>,
      <%=memberDto.getMemberName() %>,
      <%=memberDto.getCreateDate() %>,
      <a href='./delete?memberNo=<%=memberDto.getmemberNo()%>'>[삭제]</a>
      <br>
      <% 
   		} //for each문 종료
      
      %>
   	 <jsp:include page="/Tail.jsp"/>

</body>
</html>