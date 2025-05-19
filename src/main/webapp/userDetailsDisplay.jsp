<%@ page import="lk.sliit.vendorbooking.User" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User List</title>
    <link rel="stylesheet" href="css/userDetailsDisplay.css">
</head>
<body>
<h2>User List</h2>
<table border="1">
    <thead>
    <tr>
        <th>Full Name</th>
        <th>Username</th>
        <th>NIC</th>
        <th>Gender</th>
        <th>Address</th>
        <th>Email</th>
        <th>Contact Number</th>
        <th>Password</th> <!-- Only for testing; remove in production for security -->
    </tr>
    </thead>
    <tbody>
    <%
        List<User> users = (List<User>) request.getAttribute("users");
        for (User user : users) {
    %>
    <tr>
        <td><%= user.getFullName() %></td>
        <td><%= user.getUserName() %></td>
        <td><%= user.getNic() %></td>
        <td><%= user.getGender() %></td>
        <td><%= user.getAddress() %></td>
        <td><%= user.getEmail() %></td>
        <td><%= user.getContactNumber() %></td>
        <td><%= user.getPassword() %></td> <!-- Consider hashing; don’t show password in production -->
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
