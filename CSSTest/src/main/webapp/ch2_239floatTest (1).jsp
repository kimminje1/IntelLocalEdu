<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_96innerStyle.jsp</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

.divright  {
   
	width: 300px;
	float: left;
	
}	
th {
	text-align: left;
}

.divbig {
	width: 1000px;
	height: 170px;
}

.divleft {
	margin-left: 250px;
	width: 400px;
	
}
/* top, right, bottom, left */
.center {
	margin-right: auto;
	margin-left: auto;
	margin-top: 400px;
}
</style>
</head>


<body>
	<div class="center divbig">
		<div  class="divright">
			<table>
				<tr>
					<th colspan="4">공연요금1</th>
				</tr>
				<tr>
					<td>구분</td>
					<td>S석</td>
					<td>VIP</td>
				</tr>
				<tr>
					<td>성인</td>
					<td>30,000원</td>
					<td>50,000원</td>
				</tr>
				<tr>
					<td>청소년</td>
					<td>40,000원</td>
					<td>60,000원</td>
				</tr>
				<tr>
					<td>소인</td>
					<td colspan="3">미취학 아동 일반 요금의 50%</td>
				</tr>
				<tr>
					<td rowspan="2">공연시간</td>
					<td>1회</td>
					<td>13:00시 - 15:00시</td>
				</tr>
				<tr>

					<td>2회</td>
					<td>17:00시 - 19:00시</td>
				</tr>
			</table>
		</div>
		<div class="divleft">
			<table>
				<tr>
					<th colspan="4">공연요금</th>
				</tr>
				<tr>
					<td>구분</td>
					<td>S석</td>
					<td>VIP</td>
				</tr>
				<tr>
					<td>성인</td>
					<td>30,000원</td>
					<td>50,000원</td>
				</tr>
				<tr>
					<td>청소년</td>
					<td>40,000원</td>
					<td>60,000원</td>
				</tr>
				<tr>
					<td>소인</td>
					<td colspan="3">미취학 아동 일반 요금의 50%</td>
				</tr>
				<tr>
					<td rowspan="2">공연시간</td>
					<td>1회</td>
					<td>13:00시 - 15:00시</td>
				</tr>
				<tr>

					<td>2회</td>
					<td>17:00시 - 19:00시</td>
				</tr>
			</table>
		</div>
	</div>


</body>
</html>