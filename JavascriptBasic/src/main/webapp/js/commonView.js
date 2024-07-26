/**
 * 
 */

 function commonViewFnc(tempArr) {
		var commonviewObj = document.getElementById('commonview');
		var htmlStr = '';
		
		 for (var i = 0; i < tempArr.length; i++) {
			htmlStr += '<div style ="border:1px solid black;">'
			+tempArr[i]+'</div>';
		}
		 commonviewObj.innerHTML = htmlStr;
	}