<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>title</title>
<script type="text/javascript">


window.onload = function() {
    var bt = document.getElementById('bt');
    var area = document.getElementById('area');
    //이벤트객체 click=event
    bt.ondblclick = function(event) {
        console.log(event.target);	//dbclick
        console.log(event.type);    //<button id="bt" >클릭</button>
        console.log(event.clientX);
        console.log(event.clientY);
        console.log(event.screenX);
        console.log(event.screenY);                
    };
    area.onmousedown = function(event) {
        console.log(event.button);
    };
	};
</script>

<style type="text/css">
   div{
            height: 100px;
            background: #718c00;
            margin-top: 20px;
            color: #fff
        }
</style>



</head>



<body>
	 
	 <button id="bt" >클릭</button>
   	 <div id="area">여기에 마우스 왼쪽, 가운데, 오른쪽 버튼 클릭</div>
</body>




</html>