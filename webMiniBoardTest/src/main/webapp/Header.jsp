<%@page import="spms.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:useBean id="memberDto"
	scope="session"
	class="spms.dto.MemberDto"
/>

<div style="background-color: #00008b; color: Cyan; 
	 height:20px; padding:5px;">
	 SPMS(Simple Project Management System)

	<span style="float:right;"> 
		<%=memberDto.getmemberName() %> 
<!-- 		공통단의 코드들은 왠만해선 절대경로로 설정해야 어떤 구조에서든 동작이된다 -->
 		<a style="color:white;"
 		 href="<%=request.getContextPath()%>/auth/logout">로그아웃</a>
	</span> 
</div>
