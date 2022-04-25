<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring with Hibernate</title>
</head>
<body>

<h3>Product List</h3>
<c:if test="${!empty productList}">
<table class="data">
<tr>
	<th>Name</th>
	<th>Price</th>
	<th>Date Added</th>
</tr>

<c:forEach items="${productList}" var="product">
	<tr> 
		<td>${product.name }</td>
		<td>${product.price }</td>
		<td>${product.dateAdded }</td>
	</tr>

</c:forEach>
</table>
</c:if>

</body>
</html>