<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 26/04/2018
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<style type="text/css">
    .input {
        height: 380px;
        width: 430px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    .login input {
        padding: 5px;
        margin: 5px
    }
</style>
<body>
<form method="post" action="calculator">
    <div class="input">
        <h2>Simple Calculator</h2>
        <p>First operand: </p><input type="number" name="firstNumber" size="30">
        <p>Operator: </p><select name="option">
        <option value="Summation">Summation</option>
        <option value="Subtraction">Subtraction</option>
        <option value="Multiplication">Multiplication</option>
        <option value="Division">Division</option>
    </select>
       <p>Second operand: </p> <input type="number" name="secondNumber" size="30">
        <hr>
        <input type="submit" value="Calculate"/>
    </div>
</form>
</body>
</html>
