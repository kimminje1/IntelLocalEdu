<%@page import="org.apache.tomcat.websocket.pojo.PojoMethodMapping"%>
<%@page import="spms.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" http-equiv="Refresh" content="5;./login">
<title>로그인 실패</title>
<style type="text/css">

</style>

<script type="text/javascript">
function pageMoveLoginFnc() {
	location.href = '<%=request.getContextPath()%>/auth/login';
}
</script>

</head>
<%String id = request.getParameter("email");
String pw = request.getParameter("password");%>


<body>
	 <h1>로그인 실패</h1>
	<pre>
		아이디(로그인 전화번호, 로그인 전용 아이디) 또는 비밀번호가 잘못 되었습니다. 
		아이디와 비밀번호를 정확히 입력해 주세요.
		 다시 시도하거나 비밀번호 찾기를 클릭하여 재설정하세요.
		 
		 잠시 후에 다시 로그인 화면으로 전환합니다.
	</pre>
	 <p>입력한 이메일/비밀번호</p>
	<div>
	아 이 디 : <%=id %> <br>
	비밀번호 : <%=pw %> <br>
	</div>

	<button onclick="pageMoveLoginFnc()">로그인 페이지로 이동</button>
	


</body>
</html>