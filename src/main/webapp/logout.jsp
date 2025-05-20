<html><head><base href="/">
<meta charset="UTF-8">
<title>Logout Page</title>
<style>
  :root {
    --primary-color: #2c3e50;
    --accent-color: #3498db;
    --bg-color: #f5f6fa;
    --text-color: #2c3e50;
    --shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
    --gradient: linear-gradient(135deg, #3498db, #2980b9);
  }

  body {
    font-family: 'Poppins', sans-serif;
    background: var(--bg-color);
    min-height: 100vh;
    margin: 0;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    color: var(--text-color);
    position: relative;
    overflow: hidden;
  }

  .container {
    background: rgba(255, 255, 255, 0.95);
    padding: 3rem 4rem;
    border-radius: 20px;
    box-shadow: var(--shadow);
    backdrop-filter: blur(10px);
    animation: float 6s ease-in-out infinite;
    position: relative;
    z-index: 2;
  }

  h1 {
    font-size: 2.8rem;
    text-align: center;
    margin-bottom: 2.5rem;
    color: var(--primary-color);
    font-weight: 600;
    animation: fadeIn 1s ease-in-out;
    position: relative;
  }

  h1::after {
    content: '';
    position: absolute;
    bottom: -10px;
    left: 50%;
    transform: translateX(-50%);
    width: 60px;
    height: 4px;
    background: var(--gradient);
    border-radius: 2px;
  }

  form {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 1.5rem;
  }

  .text2 {
    background: var(--gradient);
    color: white;
    border: none;
    padding: 1.2rem 4rem;
    font-size: 1.3rem;
    border-radius: 50px;
    cursor: pointer;
    transition: all 0.4s cubic-bezier(0.175, 0.885, 0.32, 1.275);
    text-transform: uppercase;
    letter-spacing: 2px;
    font-weight: 500;
    position: relative;
    overflow: hidden;
  }

  .text2::before {
    content: '';
    position: absolute;
    top: 0;
    left: -100%;
    width: 100%;
    height: 100%;
    background: linear-gradient(90deg, transparent, rgba(255,255,255,0.2), transparent);
    transition: 0.5s;
  }

  .text2:hover {
    transform: translateY(-3px);
    box-shadow: 0 8px 25px rgba(52, 152, 219, 0.3);
  }

  .text2:hover::before {
    left: 100%;
  }

  .text2:active {
    transform: translateY(0);
  }

  /* Animated background */
  .background-shapes {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    z-index: 1;
    opacity: 0.5;
  }

  .shape {
    position: absolute;
    filter: blur(80px);
    animation: moveShape 20s infinite;
  }

  .shape-1 {
    top: 20%;
    left: 20%;
    width: 300px;
    height: 300px;
    background: rgba(52, 152, 219, 0.4);
    animation-delay: 0s;
  }

  .shape-2 {
    top: 60%;
    right: 20%;
    width: 400px;
    height: 400px;
    background: rgba(41, 128, 185, 0.4);
    animation-delay: -5s;
  }

  .shape-3 {
    bottom: 10%;
    left: 30%;
    width: 200px;
    height: 200px;
    background: rgba(52, 152, 219, 0.3);
    animation-delay: -10s;
  }

  @keyframes float {
    0%, 100% { transform: translateY(0); }
    50% { transform: translateY(-10px); }
  }

  @keyframes fadeIn {
    from {
      opacity: 0;
      transform: translateY(-30px);
    }
    to {
      opacity: 1;
      transform: translateY(0);
    }
  }

  @keyframes moveShape {
    0% { transform: translate(0, 0) rotate(0deg); }
    33% { transform: translate(100px, 100px) rotate(120deg); }
    66% { transform: translate(-50px, 50px) rotate(240deg); }
    100% { transform: translate(0, 0) rotate(360deg); }
  }

  @media (max-width: 768px) {
    .container {
      padding: 2rem;
      margin: 1rem;
    }
    
    h1 {
      font-size: 2rem;
    }
    
    .text2 {
      padding: 1rem 3rem;
      font-size: 1.1rem;
    }
  }
</style>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
</head>
<body>
  <div class="background-shapes">
    <div class="shape shape-1"></div>
    <div class="shape shape-2"></div>
    <div class="shape shape-3"></div>
  </div>
  
  <div class="container">
    <h1>Are you sure you want to log out?</h1>
    
    <form action="LogoutServlete" method="get" name="F1" id="F1">
      <input type="submit" name="Logout" value="Logout" class="text2">
    </form>
  </div>

</body></html>