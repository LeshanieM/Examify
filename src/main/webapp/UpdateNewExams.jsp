<%-- IT23157446 - B.A.L.M.U.Bogoda Arachchi --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.NewExam" %>
<%@ page import="service.NewExamServiceImpl" %>
<%@ page import="service.INewExamService" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update here</title>

<link rel = "stylesheet"
   type = "text/css"
   href = "NewExamCSS.css" />

</head>
<body>

<jsp:include page="header.jsp" />

	<h1>Update information</h1>
	
	<%
	
		String eID = (String) request.getAttribute("eID");
		
		INewExamService iNewExamService = new NewExamServiceImpl();
		ArrayList<NewExam> newExamList = iNewExamService.getNewExamById(eID);
	
	%>
	
	<%
			
			for(NewExam newExams : newExamList){
			
			
				
	%>
				<%-- send previous data when update --%>
		
		<form action ="<%= request.getContextPath()%>/UpdateNewExamServlet" method="post" name="F1" id="F1" >
			Exam ID <input type="text" name="eID"  value = "<%= newExams.geteID() %>" readonly class="text1" ><br>
			Course Name <input type="text" name="courseName"  value = "<%= newExams.getCourseName() %>" class="text1" ><br>
			Exam Name <input type="text" name="examType"  value = "<%= newExams.getExamType() %>" class="text1" ><br>
			Exam date <input type="text" name="date"  value = "<%= newExams.getDate() %>" class="text1" ><br>
			Course ID <input type="text" name="courseID"  value = "<%= newExams.getCourseID() %>" class="text1" ><br>
			<input type="submit" name="submit" value="Update" class="text2"><br>
		
		</form>
		
		<%
			
			}
				
		%>


<jsp:include page="footer.jsp" />
</body>
</html>