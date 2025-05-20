<%-- IT23149380 - P.G.T.N.D.Gallage --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert Results</title>
	<link rel = "stylesheet" type = "text/css" href = "css_t/insertResultsStyles.css">
</head>

<body>

	<jsp:include page="header.jsp" />
  
	<div class="container">
        
        <div class="image-section">
            <img src="images_t/insertResults.jpg" alt="resultsDetails">
        </div>
        
        <div class="form-section">
            <h1>Insert Results</h1>

			<form action ="insert" method ="post">
				StudentID <input type="text" name="sid" required><br>
				ExamID <input type="text" name="eid" required><br>
				Marks <input type="number" name="marks" required min="0" max="100"><br><br>
				Grade <input type="text" name="grade" required><br>
				
				<input type="submit" name="submit" value="Add Results">
			</form>
        </div>
    </div>
    
    <jsp:include page="footer.jsp" />
    
</body>
</html>

    
    
    