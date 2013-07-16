<%@page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <title>Access Denied</title>
  </head>
<body>
<div id="content">
<h2>403 Access Denied</h2>

<p>
You appear to have not logged in or unauthorized to view this page. Please <a href="<c:url value='/'/>">start again</a> or click here to <a href="<c:url value="/j_spring_security_logout" />" > Logout</a> and login again.
</p>
</div>
</body>
</html>
