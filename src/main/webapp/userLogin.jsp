<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="css/userLogin.css">
</head>
<body>
<h2>Login</h2>
<form action="userLogin" method="post">
    <label for="usernameL">Username:</label>
    <input type="text" id="usernameL" name="usernameL" required><br><br>

    <label for="email_Login">Email:</label>
    <input type="text" id="email_Login" name="email_Login" required><br><br>

    <label for="passwordL">Password:</label>
    <input type="password" id="passwordL" name="passwordL" required><br><br>

    <a href="userRegister.jsp">Don't have an account?Register as a user</a><br><br>

    <button type="submit">Login</button>
</form>
</body>
</html>
