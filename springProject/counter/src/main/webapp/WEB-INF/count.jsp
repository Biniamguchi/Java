<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

		<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		
<title>Current Visit Count</title>
</head>
<body>
	<h1>You have visited <a class="links" data-toggle="tooltip" title="test"href="/"> http//localhost:8080 </a> <c:out value="${count}"/> times </h1>
	<h2><a class="links" data-toggle="tooltip" title="Test another visit?"href="/">Test another visit?</a></h2>
	<h2><a href="/reset">Reset Visits</a></h2>
</body>
</html>