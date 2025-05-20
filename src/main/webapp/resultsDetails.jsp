<%-- IT23149380 - P.G.T.N.D.Gallage --%>

<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Results Details</title>
    <link rel = "stylesheet" type = "text/css" href = "css_t/resultsDetailsStyles.css">
    	<jsp:include page="header.jsp" />
</head>

<body>

	<jsp:include page="header.jsp" />

    <div class="content">
    
    	<br><br>
        <h1>Results</h1>
        
        <table>
            <c:forEach var="res" items="${resDetails}">
            	
			<c:set var="rid" value="${res.RID}"/>
			<c:set var="sid" value="${res.studentID}"/>
			<c:set var="eid" value="${res.examID}"/>
			<c:set var="marks" value="${res.marks}"/>
			<c:set var="grade" value="${res.grade}"/>
			
            <tr>
                <td>Results ID:</td>
                <td>${res.getRID()}</td>
            </tr>
            <tr>
                <td>Student ID:</td>
                <td>${res.getStudentID()}</td>
            </tr>
            <tr>
                <td>Exam ID:</td>
                <td>${res.getExamID()}</td>
            </tr>
            <tr>
                <td>Marks:</td>
                <td>${res.getMarks()}</td>
            </tr>
            <tr>
                <td>Grade:</td>
                <td>${res.getGrade()}</td>
            </tr>
            </c:forEach>
        </table>
        
        <c:url value="updateResults.jsp" var="resupdate">
            <c:param name="rid" value="${rid}"/>
            <c:param name="sid" value="${sid}"/>
            <c:param name="eid" value="${eid}"/>
            <c:param name="marks" value="${marks}"/>
            <c:param name="grade" value="${grade}"/>
        </c:url> 
        
        <a href="${resupdate}">
            <input type="button" name="update" value="Update Results">
        </a>
        
        <br>
        
        <c:url value="deleteResults.jsp" var="resdelete">
            <c:param name="rid" value="${rid}" />
            <c:param name="sid" value="${sid}" />
            <c:param name="eid" value="${eid}" />
            <c:param name="marks" value="${marks}" />
            <c:param name="grade" value="${grade}" />
        </c:url>
        
        <a href="${resdelete}">
            <input type="button" name="delete" value="Delete Results">
        </a>
    </div>

	<jsp:include page="footer.jsp" />
	
</body>
</html>
