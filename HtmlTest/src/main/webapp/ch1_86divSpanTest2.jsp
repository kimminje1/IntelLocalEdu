<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch1_86divSpanTest.jsp</title>
<style type="text/css">
div {
	border: 1px solid black;
}

span {
	background: graytext;
}

.table_style {
	width: 300px; /* 전체 테이블 폭 지정 */
}

.table_style ul {
	clear: left;
	margin: 0; /*ul 에 대한 ie, ff 차이를 없애기 위해 0 으로 설정 */
	padding: 0; /*ff 는 속성에 기본 margin, padding 이 설정된 경우가 았음*/
	list-style-type: none; /* ul li 태그 사용으로 인한 disc 를 안보이도록*/
}

.table_style ul .column1 {
	width: 60px;
}

.table_style ul .column2 {
	width: 160px;
}

.table_style ul .column3 {
	width: 70px;
	border-right: 1px solid #000; /*테이블의 우측 보더를 만듬*/
}

.table_style .header {
	font-weight: bold; /*th 와 같은 볼드 효과를 만듬*/
	text-align: center; /*th 와 같은 중앙 정렬 효과를 만듬*/
	border-top: 1px solid #000; /*테이블의 상단 보더를 만듬*/
}

.table_style ul li {
	float: left;
	margin: 0; /* 테이블 속성에 사용하던 cellspacing 과 동일 */
	padding: 2px 1px; /* 테이블 속성에 사용하던 cellpadding 과 동일 */
	border-bottom: 1px solid #000; /*테이블의 하단 보더를 만듬*/
	border-left: 1px solid #000; /*테이블의 좌측 보더를 만듬*/
}
</style>
</head>

120 191 84
<body>
	<h2>DIV와 SPAN태그를 활용하여 이 html 구조를 완벽하게 재현하시오</h2>

	<div class="table_style">

		<ul class="header">

			<li class="column1">Lastname</li>

			<li class="column2">Firstname</li>

			<li class="column3">Age</li>

		</ul>

		<ul>

			<li class="column1">Jill</li>

			<li class="column2">Smith</li>

			<li class="column3">50</li>

		</ul>

		<ul>

			<li class="column1">Eve</li>

			<li class="column2">Jackson</li>

			<li class="column3">94</li>

		</ul>
		<ul>

			<li class="column1">John</li>

			<li class="column2">Doe</li>

			<li class="column3">80</li>

		</ul>

	</div>


</body>
</html>