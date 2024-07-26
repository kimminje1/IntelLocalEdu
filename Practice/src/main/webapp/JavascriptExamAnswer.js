/**
 * 
 */
function numCheck01() {
		var numValue= document.getElementsByName("num")[0].value;
		;
		
		if (isNaN(numValue)) {
			alert("숫자가 아닙니다");
		} else {
			alert("숫자입니다");
		}
	}
	
	
function searchStr02() {
    let text = document.getElementById('val').value;
    var preElement = document.querySelector("pre");
    let preText = preElement.innerText;
	if (preText.includes(text)) {
		
		alert(text+"라는 단어가 존재합니다");
	}
	else{
		alert(text+"검색어 (은)는 존재하지 않습니다.")
	}
}
  
function popupWin03(){
		
	  window.open('./JavascriptExamTestPopupWin.jsp',
	   'popup', 'width=430, height=500, location=no, status=no');
}  



function allchk04(el){
	var isChecked = document.getElementsByName("all")[0];
	var checkboxes = document.getElementsByName("subject");
		for (var i = 0; i < checkboxes.length; i++) {
			checkboxes[i].checked = el.checked;
		}
}

function guguDanView05(){
	
	var guguValObj=document.getElementById('guguVal');
	var guguPrintObj=document.getElementById('guguPrint');
	guguPrintObj.innerHTML = '';
	var val =guguValObj.value; 
	if(Number(val)>0){
		for (var i = 1; i <= 9; i++) {
			guguPrintObj.innerHTML+='<div>'+val+"*"+i +"="+(val*i)+'</div>';
		}
	}
	
};

f
