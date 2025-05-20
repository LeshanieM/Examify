<%--IT23154230 - H.H.W.Palliyaguruge. --%>
<%@page import="model.Examiner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XXXX-Online Examinations</title>
<link rel="stylesheet" type="text/css" href="examinerInfoH.css">
</head>
<body>
<header>
        <h1>EXAMIFY - Online examinations </h1>
        <nav>
            <a href="">Home</a> |
            <a href="">About</a> |
            <a href="">Contact</a>
        </nav>
    </header>
<div class="form-wrapper">
<h2 class="h2">Update Examiner Page</h2>

	<br>
	<%
		Examiner examiner = (Examiner)request.getAttribute("examiner");
	%>

	<form method="POST" action="UpdateExaminerServlet">
	<% if (examiner != null) { %>
		<table>
			<tr>
				<td>Examiner ID</td>
				<td><input type="text" name="examinerID" disabled="disabled"
					value="<%=examiner.getExaminerID() %>" /></td>
			</tr>
			<tr>
				<td>Examiner Name</td> 
				<td><input type="text" name="examinerName"
					value="<%=examiner.getExaminerName() %>" /></td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td><input type="text" name="contact"
					value="<%=examiner.getContactNo() %>" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"
					value="<%=examiner.getAddress()%>" /></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td><input type="text" name="qualification"
					value="<%=examiner.getQualification()%>" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"
					value="<%=examiner.getEmail()%>" /></td>
			</tr>
			
			
			<tr>
				<td colspan="2"><input type="hidden" name="examinerID"
					value="<%=examiner.getExaminerID()%>" /> <input type="submit"
					value="Update Examiner" class="update-button"/></td>
			</tr>
		</table>
		
	</form>

	<table>
		<tr>
			<td colspan="2">
				<form method="POST" action="DeleteExaminerServlet">
					<input type="hidden" name="examinerID"
						value="<%=examiner.getExaminerID()%>"/> <input type="submit"
						value="Delete Examiner" class="delete-button"/>
				</form>
			</td>
		</tr>
	</table>
	<%} %>
</div>
</body>
</html>