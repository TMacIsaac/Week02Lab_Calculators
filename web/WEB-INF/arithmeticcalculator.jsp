<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2020, 5:37:41 PM
    Author     : 838771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link href="assets/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <h1>Arithmetic Calculator</h1>
        
        <form method="POST" action="arithmetic">
            <label>first: </label>
            <input type="text" name="variable1" value="${var1}">
            <label>Second: </label>
            <input type="text" name="variable2" value="${var2}">
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="/">  
            <p>Result: ${result}</p>
            <br>
            <a href="http://localhost:8084/Week02Lab_Calculators/age">Age Calculator</a>
            
            
        </form>
    </body>
</html>
