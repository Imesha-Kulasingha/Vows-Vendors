<%@ page import="lk.sliit.vendorbooking.vendorClass.Vendor" %>
<%@ page import="lk.sliit.vendorbooking.vendorService" %> <!-- Corrected class name to VendorService -->

<%
    String email = request.getParameter("email");
    Vendor vendor = null;

    // Check if the email is provided in the request
    if (email != null && !email.isEmpty()) {
        vendorService service = new vendorService(); // Fixed class name to VendorService
        vendor = service.getVendorByEmail(email); // Ensure this method is correctly implemented in VendorService
    }
%>

<%
    // Retrieve session attributes for the logged-in user
    String userName = (String) session.getAttribute("userName");
    String userEmail = (String) session.getAttribute("userEmail");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vendor Details</title>
    <link rel="stylesheet" href="css/specificvendorDetails.css">
</head>
<body>
<h2>Vendor Details</h2>

<%
    // Check if the vendor object is not null and display vendor information
    if (vendor != null) {
%>
<table border="1">
    <tr><th>Name</th><td><%= vendor.getVendorName() %></td></tr>
    <tr><th>Email</th><td><%= vendor.getVendorEmail() %></td></tr>
    <tr><th>Address</th><td><%= vendor.getVendorAddress() %></td></tr>
    <tr><th>Phone</th><td><%= vendor.getVendorPhone() %></td></tr>
    <tr><th>Business Name</th><td><%= vendor.getBusinessDetails().getBizName() %></td></tr>
    <tr><th>Category</th><td><%= vendor.getBusinessDetails().getBizCategory() %></td></tr>
    <tr><th>Description</th><td><%= vendor.getServiceDetails().getServiceDescription() %></td></tr>
    <tr><th>Price Range</th><td><%= vendor.getServiceDetails().getPriceRange() %></td></tr>
    <tr><th>Available Days</th><td><%= vendor.getServiceDetails().getAvailableDays() %></td></tr>
    <tr><th>Available Time</th><td><%= vendor.getServiceDetails().getAvailableTime() %></td></tr>
    <tr><th>Service Area</th><td><%= vendor.getServiceDetails().getServiceArea() %></td></tr>
    <tr><th>Special Packages</th><td><%= vendor.getServiceDetails().getSpecialPackages() %></td></tr>
    <tr><th>Portfolio</th><td><%= vendor.getPortfolio() %></td></tr>
    <tr><th>Terms & Conditions</th><td><%= vendor.getPortfolio().getTnC() %></td></tr>
</table>

<form action="booking" method="post">
    <input type="hidden" name="vendorID" value="<%= vendor.getVendorNIC() %>">
    <input type="hidden" name="vendorName" value="<%= vendor.getBusinessDetails().getBizName() %>">
    <input type="hidden" name="vendorEmail" value="<%= vendor.getVendorEmail() %>">
    <input type="hidden" name="price" value="<%= vendor.getServiceDetails().getPriceRange() %>">

    <input type="hidden" name="userName" value="<%= userName != null ? userName : "Guest" %>"> <!-- Default to "Guest" if userName is null -->
    <input type="hidden" name="userEmail" value="<%= userEmail != null ? userEmail : "N/A" %>"> <!-- Default to "N/A" if userEmail is null -->

    <button type="submit">Book Vendor</button>
</form>

<%
} else {
%>
<p>Vendor not found.</p>
<%
    }
%>

</body>
</html>
