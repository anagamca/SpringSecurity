<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Secured Page</title>
</head>
<body>
<h1>
	Hello ${yourName}!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="<c:url value="../../j_spring_security_logout" />" > Logout</a>
</body>
</html>
