<%-- IT23157446 - B.A.L.M.U.Bogoda Arachchi --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add new exam here</title>

<link rel = "stylesheet"
   type = "text/css"
   href = "NewExamCSS.css" />

</head>
<body>


<jsp:include page="header.jsp" />

<h1>Insert new exam</h1>

	<form action ="<%= request.getContextPath()%>/AddNewExamServlet" method="post" name="F1" id="F1">
		Course Name <input type="text" name="courseName" class="text1"  required placeholder="Course Name"><br>
		Exam Name <input type="text" name="examType" class="text1"   required placeholder="Exam Type"><br>
		Exam date <input type="date" name="date" class="text1"  required min="2024-01-01" max="2024-12-31"><br>
		Course ID <input type="text" name="courseID" class="text1"  required placeholder="Course ID"><br>
		<input type="submit" name="submit" value="Insert"  class="text2" ><br>
		
	</form>
 
 
 
<jsp:include page="footer.jsp" />

</body>
</html>