<!DOCTYPE html>

<%@ page session="true" %>
<%
    String userEmail = (String) session.getAttribute("userEmail");
%>


<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Canvas and Confetti</title>
    <link rel="stylesheet" href="css/index.css" />
</head>
<body>

<!-- Header -->
<header>
    <div class="logo">Canvas and Confetti</div>
    <nav>
        <a href="#">Home</a>
        <a href="vendorCategory.jsp">Vendors</a>
        <a href="#howitworks">How It Works</a>
        <a href="#bookings">Bookings</a>
        <a href="#guide">Wedding Guide</a>

        <% if (userEmail != null) { %>
        <a href="userProfile.jsp">My Profile</a>
        <a href="logout.jsp">Logout</a> <!-- Optional: add logout -->
        <% } else { %>
        <a href="login.jsp">Login</a>
        <a href="signIn.jsp">Sign Up</a>
        <% } %>

    </nav>
    <div class="auth-buttons">
        <a href="login.jsp"><button class="login-btn">Login</button></a>
        <a href="signIn.jsp"><button class="signup-btn">Sign Up</button></a>
    </div>
</header>

<!-- Hero Section -->
<section class="hero">
    <h1>Book the Best Vendors for Your Events</h1>
    <p>Find photographers, caterers, decorators, and more — all in one place.</p>
</section>

<!-- Vendor Categories -->
<section id="categories">
    <h2 class="section-title">Vendor Categories</h2>
    <div class="categories">
        <a href="#photographers" class="category-card">
            <img src="https://via.placeholder.com/180x120?text=Photographer" alt="Photographer">
            <h4>Photographers</h4>
        </a>
        <a href="#caterers" class="category-card">
            <img src="https://via.placeholder.com/180x120?text=Caterer" alt="Caterer">
            <h4>Caterers</h4>
        </a>
        <a href="#djs" class="category-card">
            <img src="https://via.placeholder.com/180x120?text=DJs" alt="DJs">
            <h4>DJs</h4>
        </a>
        <a href="#decorators" class="category-card">
            <img src="https://via.placeholder.com/180x120?text=Decor" alt="Decorators">
            <h4>Decorators</h4>
        </a>
        <a href="#planners" class="category-card">
            <img src="https://via.placeholder.com/180x120?text=Planners" alt="Event Planners">
            <h4>Event Planners</h4>
        </a>
    </div>
</section>

<!-- How It Works -->
<section id="howitworks">
    <h2 class="section-title">How Booking Works</h2>
    <div class="steps">
        <div class="step">
            <h4>1. Find a Vendor</h4>
            <p>Browse trusted professionals near you</p>
        </div>
        <div class="step">
            <h4>2. Check Availability</h4>
            <p>See who’s free for your date and time</p>
        </div>
        <div class="step">
            <h4>3. Send Booking Request</h4>
            <p>Send a message or booking inquiry</p>
        </div>
        <div class="step">
            <h4>4. Confirm & Celebrate</h4>
            <p>Lock it in and focus on your event!</p>
        </div>
    </div>
</section>

</body>
</html>
