<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<form method="post" action="${pageContext.request.contextPath}/modifyCountry">
		<div>
			countryId : 
			<input type="text" name="countryId" value="${countryMap.COUNTRYID}" readonly="readonly">
		</div>
		<div>
			countryName : 
			<input type="text" name="countryName" value="${countryMap.COUNTRYNAME}">
		</div>
		<div>
			regionName : 
			<select name="regionId">
				<option value="${countryMap.REGIONID}">${countryMap.REGIONNAME}</option>
				<option value="default">------------------------</option>
				<c:forEach var="r" items="${regionList}">
					<option value="${r.regionId}">${r.regionName}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			<button type="submit">modifyCountry</button>
		</div>
	</form>
		<hr>
	<!-- footer.jsp include(forward) -->
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>