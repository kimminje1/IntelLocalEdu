<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript">

	function spanChange() {
		var spanObj = document.getElementById('span1');
		var spanText = spanObj.innerText;
		
		if (spanText == 'drink') {
			spanObj.innerHTML = 'tea';
		} else if (spanText == 'tea') {
			spanObj.innerHTML = 'drink';
		}
	}
</script>
</head>
<body>
	<form>
		<table border="1">
			<tr>
				<td><span id="span1">drink</span> <!-- drink를 change버튼 클릭시 tea로 변경, tea글자에선 drink로 변경하시오 -->
					<input type="button" value="change" onclick="spanChange();" />
			</tr>
		</table>
	</form>
</body>
</html>