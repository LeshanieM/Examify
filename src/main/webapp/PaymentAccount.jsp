<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	h1{text-align: center;}


	.table-container{
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


<h1>Payment Information</h1>

	
	<div class="table-container">
	<table border="1">
	<c:forEach var ="pay" items= "${Payment1}">
	
	<!--update  -->
		<c:set var = "PID" value = "${pay.PID }"/>
		<c:set var = "name" value = "${pay.getName() }"/>
		<c:set var = "number" value = "${pay.getNumber() }"/>
		<c:set var = "expiry_date" value = "${pay.expiry_date}"/>
		<c:set var = "cvv" value = "${pay.getCvv()}"/>
		
	
	<!--insert  -->
		<tr>
			<td>PaymentID</td>
			<td>${pay.PID}</td>
		</tr>
		
		<tr>
			<td>Owner Name</td>
			<td>${pay.getName()}</td>
		</tr>
		
		<tr>
			<td>card number</td>
			<td>${pay.getNumber()}</td>
		</tr>
		
		<tr>
			<td>Expiry_Date</td>
			<td>${pay.expiry_date}</td>
		</tr>
		
		<tr>
			<td>CVV</td>
			<td>${pay.getCvv()}</td>
		</tr>
		
		
	
	</c:forEach>
	</table>
	
	
	<!--update  -->
		<c:url value = "PaymentUpdate.jsp" var="PayUpdate">
			<c:param name="PID" value = "${PID }"/>
			<c:param name="name" value = "${name }"/>
			<c:param name="number" value = "${number }"/>
			<c:param name="expiry_date" value = "${expiry_date}"/>
			<c:param name="cvv" value = "${cvv}"/>
			
		</c:url>
	
	<a href = "${PayUpdate}">
	
	
	<br>
	<br>
	<br>
	<input type = "button" name = "update" value = "Update"  >
	</a>
	
	
	<!--delete  -->
		<c:url value = "DeletePayment.jsp" var="PayDelete">
			<c:param name="PID" value = "${PID }"/>
			<c:param name="name" value = "${name }"/>
			<c:param name="number" value = "${number }"/>
			<c:param name="expiry_date" value = "${expiry_date}"/>
			<c:param name="cvv" value = "${cvv}"/>
		</c:url>
	
	
	<a href = "${PayDelete}">
	<input type = "button" name = "delete" value = "delete" >
	</a>
	</div>
	<jsp:include page="footer.jsp" />   
</body>
</html>