<%--IT23154230 - H.H.W.Palliyaguruge --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "examinerInfoH.css" />
<meta charset="UTF-8">
<title>EXAMIFY -Online Examinations</title>
</head>
<body>
<jsp:include page="header.jsp" />

 <!-- Hero Section -->
<section style="background: url('images_h/im5.png') no-repeat center center/cover; height: 80vh; display: flex; justify-content: left; align-items: center; color: white; text-align: center; position: relative;">
    <div style="position: relative; z-index: 1;">
        <h1 style="font-size: 48px; margin-bottom: 20px;">Learn and Discover</h1>
        <!-- search bar -->
       <input type="text" placeholder="Search..." 
       style="padding: 5px; font-size: 16px; border: 1px solid #ccc; border-radius: 0; width: 200px; outline: none;"><input type='submit' value="search" style="background-color:grey;padding: 5px; font-size: 16px; border: 1px solid #ccc; border-radius: 0; width: 90px; outline: none;">
        
        <p style="font-size: 18px; margin-bottom: 30px; margin-left: 30px;">Ready to learn and have fun? Find a perfect course and join us today.</p>
       
        <div style="display: flex; justify-content: center;">
            <a href="Login.jsp" style="padding: 10px 20px; text-decoration: none; margin: 0 10px; border-radius: 5px; font-size: 16px; background-color: #ff4757; color: white;">Login</a>
            <a href="register.jsp" style="padding: 10px 20px; text-decoration: none; margin: 0 10px; border-radius: 5px; font-size: 16px; background-color: #1e90ff; color: white;">Register Now</a>
        </div>
    </div>
    <div style="content: ''; position: absolute; top: 0; left: 0; width: 100%; height: 100%; background-color: rgba(0, 0, 0, 0.5);"></div>
</section>
<footer style="background-color: #333; width:100%;height:43px;">

</footer>


<jsp:include page="footer.jsp" />
</body>
</html>