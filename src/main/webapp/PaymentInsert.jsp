<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{text-align: center;}
	
		
		.form-container{
			margin: 50px auto;
            width: 80%;
            background-color: white; /* White background for the table */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Optional shadow */
	}
	
</style>
</head>
<body style="background-color:powderblue;">
<jsp:include page="header.jsp" />

<h1>Add a New payment here</h1>
		
		
		<div class="form-container">
		<form action ="PaymentInsert" method="post" >
		Name <input type="text" name="name1" required maxlength="45"><br><br>
		Card number <input type="number" name="name2" required><br><br>
		Expiry_date <input type="date" name="name3" required><br><br>
		CVV<input type="number" name="name4" required><br><br>
		
		<input type="submit" name="submit" value="Insert"  ><br>
		
		</form>
		</div>
<jsp:include page="footer.jsp" />   
</body>
</html>