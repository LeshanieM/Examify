<%--IT23154230 - H.H.W.Palliyaguruge. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .contact-container {
    display: flex;
    justify-content: center;
    align-items: stretch;
    padding: 50px;
    background: rgba(255, 255, 255, 0.95);
    margin: 20px;
    border-radius: 20px;
    box-shadow: 0 8px 32px rgba(0, 0, 0, 0.1);
    max-width: 1200px;
    gap: 40px;
    transition: transform 0.3s ease;
  }

  .contact-container:hover {
    transform: translateY(-5px);
  }

  .image-section, .content-section {
    flex: 1;
  }

  .contact-image {
    width: 100%;
    height: 100%;
    object-fit: cover;
    border-radius: 15px;
    box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s ease;
  }

  .contact-image:hover {
    transform: scale(1.02);
  }

  .content-section {
    padding: 30px;
    display: flex;
    flex-direction: column;
    justify-content: center;
  }

  h2 {
    color: #1565c0;
    font-size: 2.5em;
    margin-bottom: 30px;
    font-weight: 600;
    text-transform: uppercase;
    letter-spacing: 2px;
    position: relative;
  }

  h2::after {
    content: '';
    position: absolute;
    bottom: -10px;
    left: 0;
    width: 60px;
    height: 4px;
    background: #1565c0;
    border-radius: 2px;
  }

  .content-text {
    font-size: 1.2em;
    line-height: 1.6;
    color: #37474f;
    margin: 20px 0;
  }

  .contact-list {
    list-style: none;
    padding: 0;
    margin: 20px 0;
  }

  .contact-list li {
    font-size: 1.2em;
    line-height: 1.8;
    color: #37474f;
    margin: 15px 0;
    padding-left: 35px;
    position: relative;
    transition: transform 0.2s ease;
  }

  .contact-list li:hover {
    transform: translateX(5px);
  }

  .contact-list li::before {
    content: '→';
    color: #1565c0;
    font-weight: bold;
    position: absolute;
    left: 10px;
  }

  .availability {
    font-size: 1.1em;
    color: #546e7a;
    padding: 20px;
    background: #f5f5f5;
    border-radius: 12px;
    margin-top: 20px;
    border-left: 4px solid #1565c0;
  }

  @media (max-width: 768px) {
    .contact-container {
      flex-direction: column;
      padding: 20px;
      margin: 15px;
    }
    
    .content-section {
      padding: 20px 10px;
    }
    
    h2 {
      font-size: 2em;
    }
    
    .content-text, .contact-list li {
      font-size: 1.1em;
    }
  }
</style>

</head>
<body>
<jsp:include page="header.jsp" />
  <div class="contact-container">
    <div class="image-section">
      <img src="images_h/im2.jpg" alt="Contact Us" class="contact-image">
    </div>

    <div class="content-section">
      <h2>Contact Us!</h2>
      <p class="content-text">
        Whether you have questions about the exam platform, 
        need help with technical issues, or want more information about our services, feel free to reach out!
      </p>
      <p class="content-text">
        You can contact us at:
      </p>
      <ul class="contact-list">
        <li>Email: support.examify.com</li>
        <li>Phone: 0123243381</li>
        <li>Address: 143/25, main road, colombo</li>
      </ul>
      <div class="availability">
        Our team is available Monday to Friday, 9 AM to 5 PM.
      </div>
    </div>
  </div>
  <jsp:include page="footer.jsp" />
</body>
</html>