<html><head><base href="//httpless.com"/><style>
h1 {

  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  font-size: 2.5em;
  text-shadow: 2px 2px 4px rgba(0,0,0,0.1);
}

.form-container {
  margin: 50px auto;
  width: 80%;
  max-width: 600px;
  background-color: white;
  padding: 30px;
  border-radius: 15px;
  box-shadow: 0 8px 16px rgba(0,0,0,0.1);
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.form-container:hover {
  transform: translateY(-5px);
  box-shadow: 0 12px 20px rgba(0,0,0,0.15);
}

.input-group {
  margin-bottom: 20px;
}

.input-group h3 {
  color: #34495e;
  margin-bottom: 10px;
  font-weight: 500;
}

input[type="text"] {
  width: 100%;
  padding: 12px;
  border: 2px solid #e0e0e0;
  border-radius: 8px;
  font-size: 16px;
  transition: border-color 0.3s ease;
  outline: none;
}

input[type="text"]:focus {
  border-color: #3498db;
}

input[type="submit"] {
  background-color: #3498db;
  color: white;
  padding: 12px 24px;
  border: none;
  border-radius: 8px;
  cursor: pointer;
  font-size: 16px;
  font-weight: 500;
  transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
  background-color: #2980b9;
}

body {
  background-color: #b2d6e4;
  margin: 0;
  padding: 20px;
  min-height: 100vh;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
</style></head><body>


<h1>Pay Information</h1>

<div class="form-container">
  <form action="Payment" method="post">
    <div class="input-group">
      <h3>Payment ID</h3>
      <input type="text" name="text1" placeholder="Enter payment ID">
    </div>
    <input type="submit" name="submit" value="Enter">
  </form>
</div>

</body></html>