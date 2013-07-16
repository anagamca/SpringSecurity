<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <title>Home Page</title>
  </head>
<body>
<div id="content">
<h1>Home Page</h1>
<p>
Anyone can view this page.
</p>
<p>You can also view <a href="<c:url value="/home" />" > Home</a> page with out any authentication.
</p>
<p>You can also view <a href="<c:url value="/secure/secureView" />" > Secure </a> page but need authentication.
</p>

<p>You can also view <a href="<c:url value="/secure/extreme/secureView" />" > Secure </a> page but need admin rights.
</p>

</div>
</body>
</html>
