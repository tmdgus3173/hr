<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- menu.jsp include(forward) -->
	<div>
		<c:import url="/WEB-INF/view/inc/menu.jsp"></c:import>
	</div>
	<!-- end menu.jsp include -->
		<hr>
	<div>
		<a href="${pageContext.request.contextPath}/addCountry">add country</a>
	</div>
	<table border="1">
		<tr>
			<th>countryId</th>
			<th>countryName</th>
			<th>regionId</th>
			<th>regionName</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="c" items="${countryList}">
			<tr>
				<td>${c.countryId}</td>
				<td>${c.countryName}</td>
				<td>${c.regionId}</td>
				<td>${c.regionName}</td>
				<th><a href="${pageContext.request.contextPath}/modifyCountry?countryId=${c.COUNTRYID}">수정</a></th>
				<th><a href="${pageContext.request.contextPath}/removeCountry?countryId=${c.COUNTRYID}">삭제</a></th>
			</tr>
		</c:forEach>
	</table>
		<hr>
	<!-- footer.jsp include(forward) -->
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>