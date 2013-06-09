<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>shiftdata Index</title>
</head>
<body>
<p>Hello shiftdata Index !!!</p>
<form method="post" action="input">
<input type="text" ${f:text("shiftType")}/><br>
<input type="text" ${f:text("calendarDate")}/><br>
<input type="submit" value="shiftData">
</form>
<!--
<c:out value="${shiftData}"/>

<c:forEach var="e" items="${shftDataList}">
</c:forEach>
 -->
</body>
</html>
