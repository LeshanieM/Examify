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
			String name = request.getParameter("name");
			String number = request.getParameter("number");
			String expiry_date = request.getParameter("expiry_date");
			String cvv = request.getParameter("cvv");
			
		%>



		<h1>Delete Information</h1>
		
		<div class="form-container">
		<form action ="DeletePayment" method="post" >
		
			PID <input type="text" name="exam1" value = "<%= PID %>" readonly ><br><br>
			
			Name <input type="text" name="exam2" value = "<%= name %>" readonly ><br><br>
			
			Number <input type="text" name="exam3" value = "<%= number %>" readonly ><br><br>
			
			Expiry_Date <input type="text" name="exam4" value = "<%= expiry_date %>" readonly ><br><br>
			
			CVV <input type="text" name="exam5" value = "<%= cvv %>" readonly ><br><br>
			
			
			
			<input type="submit" name="submit" value="Delete Info"  ><br>
		
		</form>
		</div>

</body>
</html>