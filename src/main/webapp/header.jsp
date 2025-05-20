<%-- IT23149380 - P.G.T.N.D.Gallage --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><base href="." />
<title>EXAMIFY - Online examinations</title>
<style>
  /* Base styles */
  body {
    margin: 0;
    padding: 0;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    min-height: 100vh;
  }

  /* Header styles */
  header {
    width: 100%;
    background: linear-gradient(135deg, #1976d2 0%, #64b5f6 100%);
    box-shadow: 0 2px 15px rgba(0, 0, 0, 0.1);
    position: fixed;
    top: 0;
    left: 0;
    height: 70px;
    z-index: 1000;
  }

  header ul {
    list-style-type: none;
    margin: 0;
    padding: 0 20px;
    display: flex;
    align-items: center;
    height: 100%;
  }

  header li {
    margin: 0 5px;
    position: relative;
  }

  header li a {
    color: white;
    text-decoration: none;
    padding: 10px 15px;
    font-size: 1rem;
    font-weight: 500;
    transition: all 0.3s ease;
    border-radius: 5px;
    display: block;
  }

  header li a:hover {
    background: rgba(255, 255, 255, 0.2);
    transform: translateY(-2px);
  }

  header li.login a {
    background: rgba(255, 255, 255, 0.2);
    border: 2px solid white;
    padding: 8px 20px;
    margin-left: 10px;
  }

  header li.login a:hover {
    background: white;
    color: #1976d2;
  }

  header img {
    height: 60px;
    width: auto;
    margin-right: 20px;
    transition: transform 0.3s ease;
  }

  header img:hover {
    transform: scale(1.05);
  }

  @media (max-width: 768px) {
    header ul {
      padding: 0 10px;
      overflow-x: auto;
    }

    header li a {
      padding: 8px 10px;
      font-size: 0.9rem;
    }
  }
</style>
</head>
<body>
  <header>
    <ul>
      <li><img src="images_t/logo_examify.jpg" alt="logo"></li>
      <li><a href="home.jsp">Home</a></li>
      <li><a href="NewExamIndex.jsp">Exams</a></li>
      <li><a href="insertResults.jsp">Results</a></li>
      <li><a href="PaymentInsert.jsp">Payments</a></li>
      <li><a href="index.jsp">Examiner</a></li>
      <li><a href="about.jsp">About Us</a></li>
      <li><a href="contact.jsp">Contact Us</a></li>
      <li><a href="register.jsp">Register</a></li>
      <li class="login"><a href="Login.jsp">Login</a></li>
      <li class="login"><a href="logout.jsp">Logout</a></li>
    </ul>
  </header>
</body>
</html>