<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Secret Code</title>
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
    <div class="container secret-page">
        <c:if test="${isIncorrect}">
            <p class="incorrect">You must train harder!</p>
        </c:if>
        <p>What is the code?</p>
        <form action="/processCode" method="POST">
            <input type="text" name="code" /><br />
            <input type="submit" value="Try Code"/>
        </form>
    </div>
</body>
</html> -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Secret Code</title>
</head>
<body>


<p>${msg}</p>
<h3>What is the code?</h3>
<form action="/process" method="POST">
<textarea name="code"></textarea><br>
<br>
<input type="submit" value="Try Code">
</form>
</body>
</html>