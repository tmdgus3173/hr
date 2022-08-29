<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<c:import url="menu"></c:import>
</div>

	<form method="post" action="${pageContext.request.contextPath}/addRegion">
		<div>
			regionId : 
			<input type="text" name="regionId">
		</div>
		<div>
			regionName : 
			<input type="text" name="regionName">
		</div>
		<div>
			<button type="submit"> 변환</button>
		</div>
		
		
	
	</form>
	<div>
		<c:import url="footer"></c:import>
	</div>
</body>
</html>