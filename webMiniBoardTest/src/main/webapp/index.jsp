<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>title</title>
<style type="text/css">

</style>

<script type="text/javascript">
function pageMoveLoginFnc() {
	location.href = '<%=request.getContextPath()%>/auth/login';
}
</script>

</head>



<body>
	<h1>hello 제이에스피&amp;서블릿</h1>
	<p>환영합니다</p>
	
	<button onclick='pageMoveLoginFnc()'>로그인</button>
	

</body>
</html>