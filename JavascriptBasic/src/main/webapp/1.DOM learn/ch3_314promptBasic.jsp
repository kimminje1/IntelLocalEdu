<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_314promptBasic.jsp</title>
<style type="text/css">

</style>
<script type="text/javascript">
//prompt 가능하면 쓰지마라--대체제있음
//document.write confirm 쓰지마라~
		var num = 1;
        prompt('출력 페이지 수를 입력하세요!',''); // ''는 작은따옴표 두개입니다. 
        
        alert('자바스크립트');
        
        document.write('자바스크립트'); 
        
        console.log('자바스크립트11111');
        console.log(num++);
        
        confirm('정말 삭제 하시겠습니까?');//확인
        
        for (var i=0; i<num+4; i++) {
			console.log(i+"번째");
		}
        
</script>
	
	
</head>



<body>
	 

</body>



</html>