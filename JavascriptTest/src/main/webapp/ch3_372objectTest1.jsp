<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_372objectTest1.jsp</title>

<style type="text/css">
	
</style>
<script type="text/javascript">

//호텔사이트예시만들기

//호텔 방 객체를 생성하자


	var hotel ={
		roomSize: '40평',
		bedCount:'2개',
		roomName:'201호'	
	}
	function hotelPrintInfo() {
		var hotelInfoObj=document.getElementById('hotel_info');
		hotelInfoObj.innerHTML ='';
		hotelInfoObj.innerHTML += '<div>방 평수: '+ hotel.roomSize+'</div>'
		hotelInfoObj.innerHTML += '<div>방 이름(호실): '+ hotel.roomName+'</div>'
		hotelInfoObj.innerHTML += '<div>침대 개수: '+ hotel.bedCount+'</div>'
		hotelInfoObj.innerHTML +='<div>방 평수: '+hotel.roomSize+" 침대 개수: "
		+hotel.bedCount+" 방 이름(호실): "+hotel.roomName+'</div>'
		
		
	}
	 window.onload=function(){
		 hotelPrintInfo();
	 }
	
	
	
	
	
</script>


</head>



<body>
	 <div id='hotel_info'>
	 	 여기에 모든 정보를 출력하자
	 </div>

</body>

<script type="text/javascript">


</script>

</html>