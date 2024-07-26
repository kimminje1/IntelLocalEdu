<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>title</title>

<style type="text/css">
</style>



</head>



<body>
	 인자값이 있는 함수
	 <button onclick="greetFnc('반갑습니다')">인사1</button>
	 <button onclick="greetFnc('안녕히계세요 여러분')">인사2</button>

</body>
<script type="text/javascript">
 /* 그냥변수명만 */
	function greetFnc(param) {
		alert(param);
	}

</script>


</html>