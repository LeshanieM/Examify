<%-- IT23149380 - P.G.T.N.D.Gallage --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Update</title>
	<link rel = "stylesheet" type = "text/css" href = "css_t/updateResultsStyles.css">
</head>

<body>

	<jsp:include page="header.jsp" />

	<br><br><br><br>
	<h1>Update Results</h1>
	
	<%--Update Results Form--%>

	<form action ="update" method ="post">
	
	<%
		String RID = request.getParameter("rid");
		String studentID = request.getParameter("sid");
		String examID = request.getParameter("eid");
		String marks = request.getParameter("marks");
		String grade = request.getParameter("grade");
	%>
	
	<table>
		<tr>
			<td>ResultsID</td>
			<td><input type="text" name="rid" value="<%= RID %>" readonly></td>
		</tr>
		<tr>
			<td>StudentID</td>
			<td><input type="text" name="sid" value="<%= studentID %>"></td>
		</tr>
		<tr>
			<td>ExamID</td>
			<td><input type="text" name="eid" value="<%= examID %>"></td>
		</tr>
		<tr>
			<td>Marks</td>
			<td><input type="text" name="marks" value="<%= marks %>"></td>
		</tr>
		<tr>
			<td>Grade</td>
			<td><input type="text" name="grade" value="<%= grade %>"></td>
	</tr>			
	</table>
	<br>

	<input type="submit" name="submit" value="Update Results">
	</form>
	
	<jsp:include page="footer.jsp" />
    
</body>
</html>

