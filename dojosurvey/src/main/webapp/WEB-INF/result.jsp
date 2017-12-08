<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="true" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
        <!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->        
    </head>
    <body>
        <fieldset>
                 <h3>Submitted Info</h3>
                <p>
                    Name:<c:out value="${name}"/>
                </p>
                <p>
                    Dojo Location:<c:out value="${location}"/>
                </p>
                <p>
                    Favorite Language:<c:out value="${anguage}"/>
                </p>        
                <p>
                    Comment:<c:out value="${comment}"/>
                </p>
    
        </fieldset>

     <!--    <a href="/reset">Go back</a> -->
    </body>
</html>
