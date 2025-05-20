<%--IT23154230 - H.H.W.Palliyaguruge. --%>
<%@page import="model.Examiner" %>
<%@page import="java.util.ArrayList"%>
<%@page import="service.ExaminerServiceImpl"%>
<%@page import="service.IExaminerService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of examiners</title>
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
<h3>Examiners </h3>
<a href ="index.jsp">Add Examiner</a>
	
	<br>
	<br>
	  <div align="left">
		<table border="1">
		 <caption>List of Examiners</caption>
		 <tr>
                <th>Examiner ID</th>
                <th>Examiner Name</th>
                <th>Contact Number</th>
                <th>Address</th>
                <th>Qualification</th>
                <th>Email</th>
                <th>Select</th>
            </tr>
            
           <% 
           IExaminerService iExaminerService = new ExaminerServiceImpl();
			ArrayList<Examiner> arrayList = iExaminerService.getExaminers();
			
			for(Examiner examiner : arrayList){
			%>
			 <tr>
				<td> <%=examiner.getExaminerID() %> </td>
				<td> <%=examiner.getExaminerName() %> </td>
				<td> <%=examiner.getContactNo() %> </td>
				<td> <%=examiner.getAddress() %> </td>
				<td> <%=examiner.getQualification()%> </td>
				<td> <%=examiner.getEmail() %> </td>
				
				<td> 
				<form method="POST" action="GetExaminerServlet">
				<input type="text" name="examinerID" value="<%=examiner.getExaminerID()%>"/>
				 <input type="submit" value= "Select Examiner" class="select-button" /> 
				 </form>
				 </td>	
				</tr>			
			<%	
			   }
            %>   
            
              
		</table>
		
		</div>
		</div>
		
</body>
</html>