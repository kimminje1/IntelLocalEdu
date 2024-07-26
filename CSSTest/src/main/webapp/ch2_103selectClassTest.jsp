<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_103selectClassTest.jsp</title>

<style type="text/css">
		#divsty{
			width: 500px;
			height: 300px;
			border: 1px solid black;
			
		}
		#tablesty{
			width: 500px;
			height: 300px;
			border: 1px solid black;
			border-collapse: collapse;
		}
		.tdstyle{ 
			font-weight: bold;
		}
		.tdstyle2{
		background-color: skyblue;
		}
</style>

</head>
<!--<div 나는 경계선 검은색 실선 1px 적용하고 가로 500, 세로 300이다>
테이블 3행 2열 생성한다
테이블 1행의 열들은 모두 글자 굵게 적용
나머지 행들의 컬럼들은 배경색을 자신이 좋아하는 색으로 동일하게 적용하시오 -->				
<body>
	<p>Hello CSS</p>
	
	<p>id 선택자</p>
	
	<div id="divsty">
		<table id="tablesty">
			<tr >            
           	  <td class="tdstyle">1</td>
              <td class="tdstyle">2</td>
        	</tr>
        	<tr class="tdstyle2">            
           	 <td>3</td>
             <td>4</td>
        	</tr>
       		<tr class="tdstyle2">            
            	<td>5</td>
            	<td>6</td>
        	</tr>
    	</table>
	</div>
	<p>Hello CSS</p>
	
	<p>태그 선택자</p>
	
</body>
</html>