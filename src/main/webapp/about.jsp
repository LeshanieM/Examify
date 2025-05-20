<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--IT23154230 - H.H.W.Palliyaguruge. --%>
<!DOCTYPE html>
<html><head><base href="." />
<title>EXAMIFY - Online examinations</title>
<style>
  body {
    margin: 0;
    padding: 0;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: linear-gradient(135deg, #e0f7fa 0%, #b3e5fc 100%);
    min-height: 100vh;
  }

  .hero-section {
    padding: 60px 20px;
    text-align: center;
    background: rgba(255, 255, 255, 0.9);
    margin: 20px auto;
    border-radius: 15px;
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    max-width: 1200px;
  }

  .hero-image {
    width: 40%;
    max-width: 500px;
    border-radius: 15px;
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s ease;
  }

  .hero-image:hover {
    transform: scale(1.02);
  }

  h2 {
    color: #1565c0;
    font-size: 2.5em;
    margin: 30px 0;
    font-weight: 600;
    text-transform: uppercase;
    letter-spacing: 1px;
  }

  .content-text {
    font-size: 1.2em;
    line-height: 1.6;
    color: #37474f;
    max-width: 800px;
    margin: 20px auto;
    padding: 0 20px;
  }

  .team-section {
    background: rgba(255, 255, 255, 0.95);
    padding: 50px 20px;
    margin: 40px auto;
    border-radius: 15px;
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    max-width: 1200px;
  }

  .team-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    gap: 30px;
    padding: 30px;
    justify-items: center;
  }

  .team-member {
    background: white;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 3px 10px rgba(0, 0, 0, 0.1);
    transition: transform 0.3s ease, box-shadow 0.3s ease;
    width: 100%;
    max-width: 250px;
  }

  .team-member:hover {
    transform: translateY(-5px);
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
  }

  .team-member h3 {
    color: #1565c0;
    font-size: 1.5em;
    margin: 10px 0;
  }

  .team-member p {
    color: #546e7a;
    font-size: 1.1em;
  }

  strong {
    color: #1565c0;
    font-weight: 600;
  }

  @media (max-width: 768px) {
    .hero-image {
      width: 80%;
    }
    
    h2 {
      font-size: 2em;
    }
    
    .content-text {
      font-size: 1.1em;
    }
    
    .team-grid {
      grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
      gap: 20px;
    }
  }
</style>
</head>
<body>
<jsp:include page="header.jsp" />
  <div class="hero-section">
    <img src="images_h/im3.jpg" alt="Examify Platform" class="hero-image">
    <h2>About EXAMIFY</h2>
    <p class="content-text">
      Welcome to <strong>EXAMIFY</strong>, your trusted partner for online examination management. 
      Our platform is designed to simplify and streamline the entire exam process, from registration to results, 
      ensuring efficiency and accuracy at every step.
    </p>
    <p class="content-text">
      Our team is dedicated to providing the best-in-class service to educational institutions, 
      universities, and certification bodies. We believe in innovation and reliability, and our platform 
      reflects these values, ensuring secure and scalable exam solutions.
    </p>
    <p class="content-text">
      Whether you're an institution administering exams or a candidate preparing to take one, 
      EXAMIFY is here to make the process smooth and seamless.
    </p>
  </div>

  <div class="team-section">
    <h2>Meet Our Team</h2>
    <div class="team-grid">
      <div class="team-member">
        <h3>Himaya P.</h3>
        <p>Founder / CEO</p>
      </div>
      <div class="team-member">
        <h3>Leshanie M.</h3>
        <p>Head of Operations</p>
      </div>
      <div class="team-member">
        <h3>Hiranya C.</h3>
        <p>Lead Developer</p>
      </div>
      <div class="team-member">
        <h3>Tharushi G.</h3>
        <p>Lead Developer</p>
      </div>
    </div>
  </div>
  
</body>
</html>