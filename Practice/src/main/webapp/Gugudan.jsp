<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>구구단</title>

<style type="text/css">

</style>


</head>



<body>
	<div id="gugudanOutput"></div>
</body>
<script type="text/javascript">
		
	/* function setGugudan() {
		for (var i = 1; i <10; i++) {
			num+'*'+(&nbsp*i)+i=(num*i);
		}
	}
	function getGugudan() {
		setGugudan()
		document.write(setGugudan());
	}
	 */
	 /* var num = 2; */
		 let result = '';
	    function setGugudan(putNum) {
	     
	      for (var i = 1; i < 10; i++) {
	        let spaces = '';
	        for (var j = 1; j < i; j++) {
	          spaces += '&nbsp;';
	        }
	        result += putNum + spaces +' * '+spaces+ i +spaces+ ' = ' +spaces+ (putNum * i) + '<br>';
	      }
	      
	    }

	    function getGugudan() {
	    	return result;
        }
	    setGugudan(2);
	    var resultObj=getGugudan();
	    var gugudanOutputObj=document.getElementById('gugudanOutput');
	   
	    gugudanOutputObj.innerHTML=resultObj;
</script>



</html>