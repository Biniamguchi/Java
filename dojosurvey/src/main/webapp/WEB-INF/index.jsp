
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Survey</title>
        <!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
    </head>

    <body>
        <div>
            <fieldset>
                <form action="/survey" method="post">
                    Your Name:  <input type="text" name="name" placeholder="Your name"><br><br>
                    Dojo Location: <select name="location">
                        <option>Seattle</option>
                        <option>DC</option>
                        <option>Chicago</option>
                        <option>San Jose</option>
                    </select><br><br>
                    Favorite Language:  <select name="language">
                        <option>Python</option>
                        <option>C++</option>
                        <option>Java</option>
                        <option>JavaScript</option>
                    </select><br><br>
                    Comment (optional):<br><br><textarea name="comment" placeholder="Comment"></textarea><br><br>
                    <input type="submit" value="Button">
                </form>
            </fieldset>            
        </div>
    </body>
</html>