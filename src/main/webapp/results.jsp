<%-- IT23149380 - P.G.T.N.D.Gallage --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Results</title>
    <link rel = "stylesheet" type = "text/css" href = "css_t/resultsStyles.css"> 
</head>

<body>

	<jsp:include page="header.jsp" />

    <div class="container">
        
        <div class="image-section">
            <img src="images_t/results.jpg" alt="Description of Image">
        </div>
        
        <div class="form-section">
            <h1>Search</h1>
            <form action="results" method="post">
                Student ID <input type="text" name="sid" placeholder="Enter student ID"><br>
                <input type="submit" name="submit" value="Search">
            </form>
        </div>
    </div> 
    
    <jsp:include page="footer.jsp" />   
    
</body>
</html>
