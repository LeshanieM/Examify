<%-- IT23157446 - B.A.L.M.U.Bogoda Arachchi --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login here</title>

<link rel = "stylesheet"
   type = "text/css"
   href = "Login.css" />
   
</head>
<body>
<div class="login-container">
    <div class="login-header">
      <h1>Welcome Back</h1>
    </div>
    <form action ="LoginServlett" method="post">
      <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required placeholder="Enter your username">
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required placeholder="Enter your password">
      </div>
      <input type = "submit" name="Login" value =" Login"  class = "login-btn">
     
    </form>
    <div class="footer-text">
      <p>Don't have an account? <a href="https://example.com/signup">Sign up</a></p>
    </div>
  </div>

	

</body>
</html>

