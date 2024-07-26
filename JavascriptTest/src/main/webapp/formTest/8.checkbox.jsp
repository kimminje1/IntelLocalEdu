<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>checkbox</title>
<!-- checkbox는 체크가 되면 true를 반환한다      -->

<style type="text/css">
table ,tr, td{ 
 	border: 1px solid;
 	padding: 5px;
 	border-spacing: 0px;
 	
 } 
</style>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>비오는 날 들으면 죽여주는 노래?</td>
			</tr>
			<tr>
				<td>
					<input type="checkbox" onclick="allSel();" id="checkAll">전체선택<br>
					<!-- this는 자신의 값을 반환 -->
					<input type="checkbox" name="rain" value="비오는 날의 수채화">비오는 날의 수채화<br>
					<input type="checkbox" name="rain" value="사랑은 비를 타고">사랑은 비를 타고<br>
					<input type="checkbox" name="rain" value="rainism">rainism<br>
					<input type="checkbox" name="rain" value="비와당신">비와당신<br>
				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="노래목록!!" onclick="likeSong();">
				</td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
    //전체 선택 함수
	function allSel() {
	/* if(document.getElementById("checkAll").checked==true){  //id 를 사용하여 하나의 객체만을 호출
	   for(var i=0;i<4;i++) document.getElementsByName("rain")[i].checked=true;  
		 //name 을 사용하여 배열 형태로 담아 호출
	      }
	  if(document.getElementById("checkAll").checked==false){
	      for(var i=0;i<4;i++) document.getElementsByName("rain")[i].checked=false;  
	      } */
	var isChecked = document.getElementById("checkAll").checked;
	var checkboxes = document.getElementsByName("rain");

		for (var i = 0; i < checkboxes.length; i++) {
			checkboxes[i].checked = isChecked;
		}

	}

	//알람 함수

	function likeSong() {
		let checkboxes = document.querySelectorAll('[name="rain"]');
		let selectedSongs = '';

		/*  for (let i = 0; i < checkboxes.length; i++) {
		     if (checkboxes[i].checked) {
		         selectedSongs.push(checkboxes[i].value); // 체크된 항목의 값을 배열에 추가합니다.
		     }
		 }

		 if (selectedSongs.length > 0) {
		     alert(selectedSongs.join(', ')); // 배열의 내용을 문자열로 결합하여 출력합니다.
		 } *///성공 이방법말고 다른방법으로?
		/* for (let i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i].checked) {
				alert(checkboxes[i].value)
			} 
		} */
		
		for (var i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i].checked) {
				selectedSongs += checkboxes[i].value + ",";
			}
		}
		// 선택된 노래가 있을 경우, 마지막에 추가된 ", "를 제거하고 출력합니다.
        if (selectedSongs.length > 0) {
            alert(selectedSongs.substring(0, selectedSongs.length - 1));
        } else {
            alert('선택된 노래가 없습니다.');
        }

	}
</script>
</html>