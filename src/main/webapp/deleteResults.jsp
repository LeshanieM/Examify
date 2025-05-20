<%-- IT23149380 - P.G.T.N.D.Gallage --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Delete</title>
	<link rel = "stylesheet" type = "text/css" href = "css_t/deleteResultsStyles.css">
</head>
<body>

	<jsp:include page="header.jsp" />

	<%
		String resultsID = request.getParameter("rid");
		String studentID = request.getParameter("sid");
		String examID = request.getParameter("eid");
		String marks = request.getParameter("marks");
		String grade = request.getParameter("grade");
	%>

	<br><br><br><br>
	<h1>Delete Results</h1>
	
	<%--Delete Results Form--%>

	<form action="delete" method="post">
	<table>
		<tr>
			<td>Results ID</td>
			<td><input type="text" name="rid" value="<%= resultsID %>" readonly></td>
		</tr>
		<tr>
			<td>Student ID</td>
			<td><input type="text" name="sid" value="<%= studentID %>" readonly></td>
		</tr>
		<tr>
			<td>Exam ID</td>
			<td><input type="text" name="eid" value="<%= examID %>" readonly></td>
		</tr>
		<tr>
			<td>Marks</td>
			<td><input type="text" name="marks" value="<%= marks %>" readonly></td>
		</tr>
		<tr>
			<td>Grade</td>
			<td><input type="text" name="grade" value="<%= grade %>" readonly></td>
		</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Delete Results">
	</form>
	
	<jsp:include page="footer.jsp" />
	
</body>
</html>