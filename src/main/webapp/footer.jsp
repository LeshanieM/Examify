<html>
<head>
  <base href="https://www.websitefooter.com/"><!-- base URL for relative paths -->
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
    /* Modern footer styles with improved aesthetics */
    body {
      margin: 0;
      padding: 0;
      height: 100%;
      display: flex;
      flex-direction: column;
    }

    .footer {
      background: linear-gradient(135deg, #1a1a1a, #2d2d2d);
      color: #fff;
      padding: 1rem 1.5rem; /* Reduced padding for shorter height */
      font-family: 'Segoe UI', system-ui, sans-serif;
      position: relative;
      overflow: hidden;
      flex-shrink: 0;
      width: 100%;
    }

    .footer::before {
      content: '';
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 2px;
      background: linear-gradient(90deg, #00ff88, #00a3ff);
    }

    .footerleft {
      display: flex;
      flex-direction: column;
      gap: 1rem;
      margin-bottom: .75rem; /* Reduced bottom margin */
    }

    .footerleft a {
      color: #00ff88;
      text-decoration: none;
      transition: color 0.3s ease;
      display: flex;
      align-items: center;
      gap: 0.5rem;
    }

    .footerleft a:hover {
      color: #00a3ff;
    }

    .footer p {
      font-size: 1rem; /* Reduced font size for a more compact footer */
      font-weight: 600;
      margin: 1rem 0;
      text-align: center;
      background: linear-gradient(90deg, #00ff88, #00a3ff);
      -webkit-background-clip: text;
      -webkit-text-fill-color: transparent;
    }

    #id1 {
      background: transparent;
      border: 2px solid #00ff88;
      color: #fff;
      padding: 0.5rem 1.5rem;
      margin: 0.5rem;
      border-radius: 25px;
      cursor: pointer;
      transition: all 0.3s ease;
    }

    #id1:hover {
      background: #00ff88;
      color: #1a1a1a;
      transform: translateY(-2px);
      box-shadow: 0 5px 15px rgba(0, 255, 136, 0.3);
    }

    .social-links {
      display: flex;
      justify-content: center;
      gap: 1.5rem;
      margin-top: 1rem; /* Reduced space between buttons and social icons */
    }

    .social-links a {
      transition: transform 0.3s ease;
    }

    .social-links a:hover {
      transform: translateY(-5px);
    }

    /* Responsive design */
    @media (max-width: 768px) {
      .footer {
        padding: 1rem;
      }

      .social-links {
        flex-wrap: wrap;
      }

      #id1 {
        width: 100%;
        margin: 0.5rem 0;
      }
    }

    /* SVG Icons */
    .icon {
      width: 24px;
      height: 24px;
      fill: currentColor;
    }
  </style>
</head>
<body>

  <!-- Your content goes here -->
  <div style="flex-grow: 1;">
    <!-- Page content -->
  </div>

  <!-- Footer -->
  <div class="footer">
    <div class="footerleft">
      <a href="tel:+94117123482">
        <svg class="icon" viewBox="0 0 24 24">
          <path d="M20.01 15.38c-1.23 0-2.42-.2-3.53-.56a.977.977 0 0 0-1.01.24l-1.57 1.97c-2.83-1.35-5.48-3.9-6.89-6.83l1.95-1.66c.27-.28.35-.67.24-1.02c-.37-1.11-.56-2.3-.56-3.53c0-.54-.45-.99-.99-.99H4.19C3.65 3 3 3.24 3 3.99C3 13.28 10.73 21 20.01 21c.71 0 .99-.63.99-1.18v-3.45c0-.54-.45-.99-.99-.99z"/>
        </svg>
        +94117123482
      </a>    
      <a href="https://mail.google.com/mail/">
        <svg class="icon" viewBox="0 0 24 24">
          <path d="M20 4H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 4l-8 5-8-5V6l8 5 8-5v2z"/>
        </svg>
        examify@gmail.com
      </a>
    </div>

    <p>Get In Touch</p>

    <div class="button-group">
      <a href="allNewExams.jsp"><input type="button" name="exam" value="Exams" id="id1"></a>
      <a href="results.jsp"><input type="button" name="results" value="Results" id="id1"></a>
      <a href="index.jsp"><input type="button" name="Examiners" value="Examiners" id="id1"></a>
      <a href="Payment.jsp"><input type="button" name="payment" value="Payment" id="id1"></a>
    </div>

    <div class="social-links">
      <a href="https://www.facebook.com/">
        <svg class="icon" viewBox="0 0 24 24">
          <path d="M12 2.04C6.5 2.04 2 6.53 2 12.06C2 17.06 5.66 21.21 10.44 21.96V14.96H7.9V12.06H10.44V9.85C10.44 7.34 11.93 5.96 14.22 5.96C15.31 5.96 16.45 6.15 16.45 6.15V8.62H15.19C13.95 8.62 13.56 9.39 13.56 10.18V12.06H16.34L15.89 14.96H13.56V21.96A10 10 0 0 0 22 12.06C22 6.53 17.5 2.04 12 2.04Z"/>
        </svg>
      </a>
      <a href="https://twitter.com/">
        <svg class="icon" viewBox="0 0 24 24">
          <path d="M22.46 6C21.69 6.35 20.86 6.58 20 6.69C20.88 6.16 21.56 5.32 21.88 4.31C21.05 4.81 20.13 5.16 19.16 5.36C18.37 4.5 17.26 4 16 4C13.65 4 11.73 5.92 11.73 8.29C11.73 8.63 11.77 8.96 11.84 9.27C8.28 9.09 5.11 7.38 3 4.79C2.63 5.42 2.42 6.16 2.42 6.94C2.42 8.43 3.17 9.75 4.33 10.5C3.62 10.5 2.96 10.3 2.38 10C2.38 10 2.38 10 2.38 10.03C2.38 12.11 3.86 13.85 5.82 14.24C5.46 14.34 5.08 14.39 4.69 14.39C4.42 14.39 4.15 14.36 3.89 14.31C4.43 16 6 17.26 7.89 17.29C6.43 18.46 4.46 19.08 2.38 19.08C2.04 19.08 1.7 19.06 1.36 19.01C3.26 20.26 5.99 21 8.44 21C15.98 21 20.72 13.63 20.72 8.27C20.72 8.09 20.72 7.91 20.71 7.73C20.92 7.53 21.11 7.33 21.28 7.12C21.54 7.03 21.77 6.91 22 6.69C22 6.68 22 6.68 22.01 6.68C22.02 6.68 22.02 6.68 22.02 6.68L22.46 6.02Z"/>
        </svg>
      </a>
    </div>

  </div>

</body>
</html>
