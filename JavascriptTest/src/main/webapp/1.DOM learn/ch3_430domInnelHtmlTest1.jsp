<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch3_430domInnelHtmlBasic1.jsp</title>

<style type="text/css">
div{
	width: 300px;
	border: 1px solid black;
}
p{
	border: 1px solid black;
}
</style>




</head>



<body>
	 <h1>innerHtml?</h1>
	 
	 <div id= 'divObj'>
	 	
	 </div>
	  
<!--    위의 div 태그를 아래와 같이 innerHtml로 작성하시오 -->
 <!--   <div id='divObj'>
      <form action="#" method="get">
         <div style="border: 1px solid black;">
            <input id='txt1' type="text" value="">
            <input id='txt2' type="text" value="비번 확인">
         </div>
         <div style="border: 1px solid black;">
            <input id='checkBtn' type="button" value="저장">
            <input id='goBtn' type="submit" value="전송">
         </div>
         
      </form>
   </div> -->

	  
	 <div>demo</div>

</body>
<script type="text/javascript">
	var divObj =document.getElementById('divObj');
	
	var htmlStr = '';
	
	htmlStr +='<form action="#" method="get">';
		htmlStr +='<div style="border: 1px solid black;">';
			htmlStr +='<input id="txt1" type="text" value="">';
			htmlStr +='<input id="txt2" type="text" value="비번 확인">';
		htmlStr +='</div>';
		htmlStr +='<div style="border: 1px solid black;">';
			htmlStr +='<input id="checkBtn" type="button" value="저장">';
			htmlStr +='<input id="goBtn" type="submit" value="전송">'; 
		htmlStr +='</div>'; 
	htmlStr +='</form>';
	divObj.innerHTML= htmlStr;
	//2번쨰방식 1옆의그거`입력
	/* divObj.innerHTML=
   `<form action="#" method="get">
    <div style="border: 1px solid black;">
       <input id="txt1" type="text" value="">
       <input id="txt2" type="text" value="비번 확인">
    </div>
    <div style="border: 1px solid black;">
       <input id="checkBtn" type="button" value="저장">
       <input id="goBtn" type="submit" value="전송">
    </div>
    </form>`;
 */
    
</script>


</html>