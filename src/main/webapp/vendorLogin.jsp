<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vendor Login</title>
    <style>
        /* Basic Reset */
        body, h2, form, input, label, button {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        body {
            background-color: #f4f4f9;
            padding: 2rem;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h2 {
            text-align: center;
            margin-bottom: 1.5rem;
            color: #333;
        }

        form {
            background-color: #fff;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        label {
            font-size: 1rem;
            margin-bottom: 0.5rem;
            color: #333;
            display: block;
        }

        input {
            width: 100%;
            padding: 0.8rem;
            margin-bottom: 1.2rem;
            border-radius: 4px;
            border: 1px solid #ccc;
            font-size: 1rem;
        }

        input[type="email"] {
            text-transform: lowercase;
        }

        a {
            display: block;
            text-align: center;
            margin-bottom: 1rem;
            font-size: 1rem;
            text-decoration: none;
            color: #667eea;
        }

        a:hover {
            text-decoration: underline;
        }

        button {
            width: 100%;
            padding: 1rem;
            background-color: #667eea;
            color: #fff;
            font-size: 1.2rem;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #5a67d8;
        }
    </style>
</head>
<body>
<div>
    <h2>Vendor Login</h2>
    <form action="vendorLogin" method="post">
        <label for="vendorIDLogin">Vendor ID:</label>
        <input type="text" id="vendorIDLogin" name="vendorIDLogin" required>

        <label for="vendorEmailLogin">Email:</label>
        <input type="email" id="vendorEmailLogin" name="vendorEmailLogin" required>

        <label for="vendorPasswordLogin">Password:</label>
        <input type="password" id="vendorPasswordLogin" name="vendorPasswordLogin" required>

        <a href="vendorRegister.jsp">Don't have an account? Register as a Vendor</a>

        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>
