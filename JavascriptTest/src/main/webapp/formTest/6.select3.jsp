<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>select 활용</title>
<style type="text/css">
	table, tr, td{
		border: 1px solid black;
	}
</style>

</head>
<body>
	<table>
		<tr>
			<td style="width:50px;">
				<select id="sel" size="4" multiple>
					<option value="sana">사나</option>
					<option value="sm">카리나</option>
					<option value="ive">안유진</option>
				</select>
			</td>
			<td style="width:100px;">
				<span id="im"><!-- 여기에 선택한 연예인의 이미지를 출력한다 --></span>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="좋아하는 연예인은?(이미지)" onclick="selimg();">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="좋아하는 연예인은?(중복가능)" onclick="selStar();">
				<!-- 버튼 클릭시 다중 선택한 연예인의 이름을 알림창으로 한번만 출력한다 -->
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
		
	
		
		//1번
		function selimg() {
			let imImg = document.getElementById('im');
			let selList = document.getElementById('sel');
			let selValue= selList.value;
		
			imImg.innerHTML = '<img src="img/'+selValue+'.jpg" style="width: 200px;">';
			
			}
	//2번
		
		
	function selStar() {	
		 var selectObj = document.getElementById('sel');
		 var selectedOptions = selectObj.querySelectorAll(':checked');
		 var selectedNames = '';
		      
		  for (var  selecteChecked of selectedOptions) {
		       selectedNames += ', ' + selecteChecked.text;
		  }
		      
		  alert(selectedNames.substring(2));

		} 
</script>
</html>