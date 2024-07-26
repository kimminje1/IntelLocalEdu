<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ch1_63tableTest1.jsp</title>
	
</head>
<body>
	
   	<table border = "1px">
   		<tr>            
            <td colspan="2" width = "200px" style="border:solid red 1px">1-1</td>
            <td width = "100px" style="border:solid red 1px">1-3</td>
            <td width = "100px" style="border:solid red 1px">1-4</td>
        </tr>
        <tr>
            <td rowspan="3" width = "100px" style="border:solid blue 1px" >2번</td>
            <td width= "100px" style="border:solid blue 1px">2-2</td>
            <td width= "100px" style="border:solid blue 1px">2-3</td>
           	<td width= "100px" style="border:solid blue 1px">2-4</td>
        </tr>
        <tr>            
           
            <td width= "100px" style="border-bottom: 1px solid black ;">3-2</td>
            <td width= "100px" style="border-bottom: 1px solid black;">3-3</td>
           	<td width= "100px" style="border-bottom: 1px solid black;">3-4</td>
        </tr>
        <tr>            
          
            <td width= "100px" style="border-bottom: 2px solid yellow;
           	border-right: 2px solid yellow;">4-2</td>
            <td width= "100px" style="border-bottom: 2px solid yellow;
           	border-right: 2px solid yellow;">4-3</td>
           	<td width= "100px" style="border-bottom: 2px solid yellow;
           	border-right: 2px solid yellow;">4-4</td>
        </tr>
    </table>
   

</body>
</html>