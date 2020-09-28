<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2020, 5:37:05 PM
    Author     : 838771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        <link href="assets/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="POST" action="age">
            
        <label>Enter your age: </label>
        <input type="text" name="current_age" value="${input}">
        <input type="submit" value="Age Next Birthday">
        <p>${message}${age}</p>
        
        </form>
        <a href="http://localhost:8084/Week02Lab_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
