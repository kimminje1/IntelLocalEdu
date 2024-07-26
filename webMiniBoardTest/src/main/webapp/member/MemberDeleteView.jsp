
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
 <jsp:useBean id="memberList" 
      		scope="request" 
       		class="java.util.ArrayList"
      		
 /> 


<body>
    <jsp:include page="/Header.jsp"/>
    <h1><%=request.getAttribute("memberName")%> 회원 삭제</h1>
    <form action='./delete' method='post'>
        <input type='button' value='회원목록으로' onclick='location.href="./list"'>
    </form>
    <jsp:include page="/Tail.jsp"/>
</body>
</html>