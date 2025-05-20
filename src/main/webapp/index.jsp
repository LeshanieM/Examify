<%--IT23154230 - H.H.W.Palliyaguruge. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "examinerInfoH.css" />
   
<meta charset="UTF-8">
<title> EXAMIFY - Online Examinations</title>
<link rel="stylesheet" type="text/css" href="examinerInfoH.css">
</head>
<body>
<jsp:include page="header.jsp" />

<div class="form-wrapper">
<h2> Add examiner information </h2>
<form method="POST" action="AddExaminerServlet">
		<table>

			
			<tr>
				<td>Examiner Name</td>
				<td><input type="text" name="examinerName" required/></td>
			</tr>
			<tr>
				<td>contact Number</td>
				<td><input type="number" name="contact" required/></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" required/></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td><input type="text" name="qualification" required/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Examiner" class="add-button" /></td>
			</tr>
			<tr>	
				<td colspan="2"><input type="reset" value="Reset" class="reset-button" /></td>
			</tr>
		</table>
	</form>
	
	<form method="POST" action="ListExaminerServlet">
		<table>
			<tr>
				<td colspan="2"><input type="submit" value=" all Examiners" class="list-button" />
				</td>
			</tr>
		</table>
	</form>
	</div>
	
	<jsp:include page="footer.jsp" />
	
</body>
</html>