<%-- IT23157446 - B.A.L.M.U.Bogoda Arachchi --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page import="model.NewExam" %>
<%@ page import="service.NewExamServiceImpl" %>
<%@ page import="service.INewExamService" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New exam details</title>

<link rel = "stylesheet"
   type = "text/css"
   href = "NewExamCSS.css" />

</head>
<body>

<jsp:include page="header.jsp" />

<h1>All New Exams</h1>

<table border ="1">
	<thead>
		<tr>
		
			<th>Exam ID</th>
			<th>Course Name</th>
			<th>Exam Type</th>
			<th>Date</th>
			<th>Course ID</th>
			<th>Edit</th>
			<th>Delete</th>
			
		
		</tr>
	</thead>
	
	<tbody>
	
		<%
		
			INewExamService iNewExamService = new NewExamServiceImpl();
			ArrayList<NewExam> newExamList = iNewExamService.getNewExam();		
		%>
		
		<%
			
			for(NewExam newExams : newExamList){
			
			
			
		%>
		
		<%-- get data --%>
			<tr>
				<td> <%= newExams.geteID() %></td>
				<td> <%= newExams.getCourseName() %> </td>
				<td> <%= newExams.getExamType() %> </td>
				<td> <%= newExams.getDate() %> </td>
				<td> <%= newExams.getCourseID() %> </td>
				
				<td>
				
				<%-- send data to get servlet --%>
					<form action ="<%= request.getContextPath()%>/GetNewExamServlet" method="post" name="F1" id="F1">
						
						<input type = "hidden" name="eID" value = "<%= newExams.geteID() %>">
						<input type = "submit" name="Edit" value =" Edit"  class="text2">
						
					</form>
				</td>
				
				<td>
				
						<%-- send data to delete servlet --%>
					<form action ="<%= request.getContextPath()%>/DeleteNewExamServlet" method="post" name="F1" id="F1" onsubmit="return confirmDelete();">
						
						<input type = "hidden" name="eID" value = "<%= newExams.geteID() %>">
						<input type = "submit" name="Delete" value ="Delete"  class="text2">
						
					</form>
					
					<script type="text/javascript">
    					function confirmDelete() {
       					 return confirm("Are you sure you want to delete this exam?");
    					}
					</script>
				</td>
		
		
			</tr>
		
		<%
			
			}
				
		%>
	
	
	</tbody>
</table>

<jsp:include page="footer.jsp" />

</body>
</html>