<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>폼</title>
 <style>
        body {
            margin: 10;
            display: flex;
            height: 100vh; /* Viewport height to make sure it takes the full height of the screen */
        }
        .left-space {
            flex: 1; /* 1/4 of the width */
        }
        .table-container {
            flex: 3; /* 3/4 of the width */
            display: flex;
            align-items: center;
            justify-content: center;
        }
        table {
            border-collapse: collapse;
            width: 80%; /* Adjust table width as needed */
        }
        th, td {
            border: 1px solid #000;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>


<body>
	<div class="left-space"></div>
    <div class="table-container">
        <table>
            <thead>
                <tr>
                    <th>Header 1</th>
                    <th>Header 2</th>
                    <th>Header 3</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Row 1, Cell 1</td>
                    <td>Row 1, Cell 2</td>
                    <td>Row 1, Cell 3</td>
                </tr>
                <tr>
                    <td>Row 2, Cell 1</td>
                    <td>Row 2, Cell 2</td>
                    <td>Row 2, Cell 3</td>
                </tr>
                <!-- Add more rows as needed -->
            </tbody>
        </table>
    </div>    

</body>
</html>