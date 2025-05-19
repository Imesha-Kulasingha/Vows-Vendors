<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <link rel="stylesheet" href="css/userRegistration.css">

</head>
<body>

<div class="container">
    <h2>User Registration</h2>
    <form action="addUser" method="POST">
        <!-- Full Name -->
        <div class="form-group">
            <label for="fullName">Full Name</label>
            <input type="text" id="fullName" name="fullName" required>
        </div>

        <!-- Username -->
        <div class="form-group">
            <label for="userName">Username (What should we call you?)</label>
            <input type="text" id="userName" name="userName" required>
        </div>

        <!-- NIC -->
        <div class="form-group">
            <label for="nic">NIC (National Identity Card Number)</label>
            <input type="text" id="nic" name="nic" required>
        </div>

        <!-- Gender -->
        <div class="form-group">
            <label>Gender</label>
            <label><input type="radio" name="gender" value="Male" required> Male</label>
            <label><input type="radio" name="gender" value="Female"> Female</label>
        </div>

        <!-- Address -->
        <div class="form-group">
            <label for="address">Address</label>
            <textarea id="address" name="address" rows="4" required></textarea>
        </div>

        <!-- Email -->
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
        </div>

        <!-- Contact Number -->
        <div class="form-group">
            <label for="contactNumber">Contact Number</label>
            <input type="tel" id="contactNumber" name="contactNumber" pattern="[0-9]{10}" required>
        </div>

        <!-- Password -->
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
        </div>

        <!-- Submit Button -->
        <button type="submit">Register</button>
    </form>
</div>

</body>
</html>
