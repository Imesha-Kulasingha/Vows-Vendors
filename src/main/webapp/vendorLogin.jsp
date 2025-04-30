<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vendor Login</title>
</head>
<body>
<h2>Vendor Login</h2>
<form action="vendorLogin" method="post">
    <label for="vendorIDLogin">Vendor ID:</label>
    <input type="text" id="vendorIDLogin" name="vendorIDLogin" required><br><br>

    <label for="vendorEmailLogin">Email:</label>
    <input type="email" id="vendorEmailLogin" name="vendorEmailLogin" required><br><br>

    <label for="vendorPasswordLogin">Password:</label>
    <input type="password" id="vendorPasswordLogin" name="vendorPasswordLogin" required><br><br>

    <a href="vendorRegister.jsp">Don't have an account?Register as a Vendor</a><br><br>

    <button type="submit">Login</button>
</form>
</body>
</html>
