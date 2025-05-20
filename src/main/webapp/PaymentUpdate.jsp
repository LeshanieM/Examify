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



		<%
			String PID = request.getParameter("PID");
			String Name = request.getParameter("name");
			String Number = request.getParameter("number");
			String Expiry_date = request.getParameter("expiry_date");
			String CVV = request.getParameter("cvv");
		
		%>

	
		<h1>Edit Information</h1>
		
		<!--Update payment form--> 
		<div class="form-container">
		<form action ="UpdatePayment" method="post">
		
			PID <input type="text" name="exam1" value = "<%= PID %>" readonly ><br><br>
			
			Name <input type="text" name="exam2" value = "<%= Name %>"  ><br><br>
			
			Number <input type="number" name="exam3" value = "<%= Number %>"  ><br><br>
			
			Expiry_Date <input type="date" name="exam4" value = "<%= Expiry_date %>" ><br><br>
			
			CVV <input type="number" name="exam5" value = "<%= CVV %>" ><br><br>
			
			
			
			<input type="submit" name="submit" value="Update Info" ><br>
		
		</form>
		</div>

</body>
</html>