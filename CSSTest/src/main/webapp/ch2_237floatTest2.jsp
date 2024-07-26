<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch2_237floatTest2.jsp</title>
<style type="text/css">
h1, p, ul {
	margin: 0;
	padding: 0;
}

li {
	list-style-type: none;
}

.gallery {
	padding: 0;
}

.gallery li {
	float: left;
	width: 150px;
	margin-right: 10px;
	text-align: center;
}

h1 {
	background-color: lightgray;
	width: 500px;
	text-align: center;
	font-weight: bold;
}

h3 {
	font-size: 35px;
	color: white;
	width: 100px;
	height: 105px;
}

.gallery h3 {
	padding-bottom: 5px;
	margin: 10px 0 10px 25px;
}

.gallery li h3 {
	background: red;
}

.gallery li+li h3 {
	background: blue;
}

.gallery li+li+li h3 {
	background: orange;
}

.gallery li+li+li+li h3 {
	background: brown;
}

.gallery li+li+li+li+li h3 {
	background: pink;
}

.gallery li p {
	margin-left: 10px;
	text-align: justify;
	font-size: 14px;
}

.container {
	border: 1px solid black;
	width: 950px;
	height: 700px;
}

.containertop {
	border: 1px solid black;
	width: 850px;
	height: 275px;
}

.container_bottom {
	border: 1px solid black;
	width: 850px;
	height: 275px;
	float: left;
}

.title {
	padding: 10px;
}
</style>
</head>


<body>
	<h1>나의 아름다운 정원</h1>
	<div class="container">
		<p class="title">
			사람들 아마 스스로에게 <strong>자신감을 북돋워 주는 </strong> 표정 있는 꽃들일 것이다.
		</p>

		<div class="container_top">
			<ul class="gallery">
				<li><h3>
						튜 울<br>립
					</h3>
					<p>너무 화려하지 않으며 고귀한 느낌을 가지고 있다. 붉은 색이 단연 으뜸이며 한 송이만 있어도 빼어나다.</p></li>
				<li><h3>
						제 비<br>꽃
					</h3>
					<p>드물게 푸른색을 띠고 있으며 작지만 시원해 보이는 어린 꽃이라고 할 수 있다. 여럿이 함께 있을 때 더욱
						아름답다.</p></li>
				<li>
					<h3>
						호 박<br>꽃
					</h3>
					<p>색도 모양도 화려하며 이름과 걸맞지 않게 아름다운 꽃으로 매우 완숙한 이미지를 풍기는 꽃이다.</p>
				</li>
				<li><h3>
						해바<br>라기
					</h3>
					<p>태양만 바라보는 일편단심의 꽃으로 얼굴이 큰 편에 속하며 송이가 적어야 제격이다.</p></li>
				<li><h3>
						코 스<br>모 스
					</h3>
					<p>너무 화려하지 않으며 고귀한 느낌을 가지고 있다. 붉은 색이 단연 으뜸이여 한송이만 있어도 빼어나다</p></li>
			</ul>
		</div>

		<div class=" container_bottom  ">
			<ul class="gallery">
				<li><h3>
						코 스<br>모 스
					</h3>
					<p>너무 화려하지 않으며 고귀한 느낌을 가지고 있다. 붉은 색이 단연 으뜸이며 한 송이만 있어도 빼어나다.</p></li>
				<li><h3>
						수 선<br>화
					</h3>
					<p>드물게 푸른색을 띠고 있으며 작지만 시원해 보이는 어린 꽃이라고 할 수 있다. 여럿이 함께 있을 때 더욱
						아름답다.</p></li>
				<li>
					<h3>
						연 꽃<br> &nbsp;
					</h3>
					<p>색도 모양도 화려하며 이름과 걸맞지 않게 아름다운 꽃으로 매우 완숙한 이미지를 풍기는 꽃이다.</p>
				</li>
				<li><h3>
						모 란<br>꽃
					</h3>
					<p>태양만 바라보는 일편단심의 꽃으로 얼굴이 큰 편에 속하며 송이가 적어야 제격이다.</p></li>
				<li><h3>
						라 일<br>락
					</h3>
					<p>태양만 바라보는 일편단심의 꽃으로 얼굴이 큰 편에 속하며 송이가 적어야 제격이다.</p></li>
			</ul>
		</div>
	</div>
</body>

</body>
</html>