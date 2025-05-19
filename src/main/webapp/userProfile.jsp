<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="lk.sliit.vendorbooking.User" %>

<%
    String userEmail = (String) session.getAttribute("userEmail");
    if (userEmail == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    User user = (User) session.getAttribute("specificUser");
    if (user == null) {
        System.out.println("<h2 style='text-align:center; margin-top:50px;'>No user data available.</h2>");
        return;
    }
%>


<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
    <link rel="stylesheet" href="css/userProfile.css">

</head>
<body>
<div class="container">
    <h2>User Profile</h2>

    <div class="user-detail"><span class="label">Full Name:</span> <span class="value"><%= user.getFullName() %></span></div>
    <div class="user-detail"><span class="label">Username:</span> <span class="value"><%= user.getUserName() %></span></div>
    <div class="user-detail"><span class="label">NIC:</span> <span class="value"><%= user.getNic() %></span></div>
    <div class="user-detail"><span class="label">Gender:</span> <span class="value"><%= user.getGender() %></span></div>
    <div class="user-detail"><span class="label">Address:</span> <span class="value"><%= user.getAddress() %></span></div>
    <div class="user-detail"><span class="label">Email:</span> <span class="value"><%= user.getEmail() %></span></div>
    <div class="user-detail"><span class="label">Contact Number:</span> <span class="value"><%= user.getContactNumber() %></span></div>
</div>

<a href="index.jsp">return to home page</a>

</body>
</html>
