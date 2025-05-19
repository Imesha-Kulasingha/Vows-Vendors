<%@ page import="lk.sliit.vendorbooking.vendorClass.Vendor" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%
    String vendorEmail = (String) session.getAttribute("vendorEmail");
    if (vendorEmail == null) {
        response.sendRedirect("vendorLogin.jsp");
        return;
    }

    Vendor vendor = (Vendor) session.getAttribute("specificVendor");
    if (vendor == null) {
%>
<h2 style="text-align:center; margin-top:50px;">No vendor data available.</h2>
<%
        return;
    }
%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vendor Profile</title>
    <link rel="stylesheet" href="css/vendorProfile.css">
</head>
<body>

<h2>Vendor Profile</h2>

<%-- Retrieve the vendor object from the request attribute --%>
<%
    Vendor vendor1 = (Vendor) request.getAttribute("specificVendor");
%>

<%-- Display the vendor's personal information --%>
<h3>Personal Information</h3>
<p><strong>Name:</strong> <%= vendor.getVendorName() %></p>
<p><strong>Email:</strong> <%= vendor.getVendorEmail() %></p>
<p><strong>Phone:</strong> <%= vendor.getVendorPhone() %></p>
<p><strong>Contact Name:</strong> <%= vendor.getVendorContactName() %></p>
<p><strong>Address:</strong> <%= vendor.getVendorAddress() %></p>

<%-- Display the business details --%>
<h3>Business Information</h3>
<p><strong>Business Name:</strong> <%= vendor.getBusinessDetails().getBizName() %></p>
<p><strong>Business Address:</strong> <%= vendor.getBusinessDetails().getBizAddress() %></p>
<p><strong>License Number:</strong> <%= vendor.getBusinessDetails().getBizLicenceNumber() %></p>
<p><strong>Business Category:</strong> <%= vendor.getBusinessDetails().getBizCategory() %></p>
<p><strong>Social Media Links:</strong> <%= vendor.getBusinessDetails().getSocialMediaLinks() %></p>

<%-- Display the service details --%>
<h3>Service Information</h3>
<p><strong>Service Description:</strong> <%= vendor.getServiceDetails().getServiceDescription() %></p>
<p><strong>Price Range:</strong> <%= vendor.getServiceDetails().getPriceRange() %></p>
<p><strong>Available Days:</strong> <%= vendor.getServiceDetails().getAvailableDays() %></p>
<p><strong>Available Time:</strong> <%= vendor.getServiceDetails().getAvailableTime() %></p>
<p><strong>Service Area:</strong> <%= vendor.getServiceDetails().getServiceArea() %></p>
<p><strong>Special Packages:</strong> <%= vendor.getServiceDetails().getSpecialPackages() %></p>

<%-- Display the portfolio and other media --%>
<h3>Portfolio</h3>
<p><strong>Portfolio:</strong> <%= vendor.getPortfolio() %></p>
<p><strong>Terms and Conditions:</strong> <%= vendor.getPortfolio().getTnC() %></p>
<p><strong>Pictures:</strong> <%= vendor.getPortfolio().getPictures() %></p>

<%-- Display special requirements --%>
<h3>Special Requirements</h3>
<p><%= vendor.getRequirements().getSpecialRequirements() %></p>

<a href="index.jsp">return to home page</a>

</body>
</html>
