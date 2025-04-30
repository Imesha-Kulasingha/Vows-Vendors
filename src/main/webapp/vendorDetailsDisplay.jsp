<%@ page import="lk.sliit.vendorbooking.Vendor" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vendor List</title>
</head>
<body>
<h2>Vendor List</h2>
<table border="1">
    <thead>
    <tr>
        <th>Vendor ID</th>
        <th>Vendor Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Contact Name</th>
        <th>Phone</th>
        <th>Business Name</th>
        <th>Business Address</th>
        <th>Category</th>
        <th>Service Description</th>
        <th>Price Range</th>
        <th>Available Days</th>
        <th>Available Time</th>
        <th>Service Area</th>
        <th>Special Packages</th>
        <th>Portfolio</th>
        <th>Terms and Conditions</th>
        <th>Pictures</th>
        <th>Special Requirements</th>
    </tr>
    </thead>
    <tbody>
    <%
        // Retrieve the list of vendors from request attribute
        List<Vendor> vendors = (List<Vendor>) request.getAttribute("vendors");

        // Loop through the list of vendors
        for (Vendor vendor : vendors) {
    %>
    <tr>
        <td><%= vendor.getVendorNIC() %></td>
        <td><%= vendor.getVendorName() %></td>
        <td><%= vendor.getVendorEmail() %></td>
        <td><%= vendor.getVendorAddress() %></td>
        <td><%= vendor.getVendorContactName() %></td>
        <td><%= vendor.getVendorPhone() %></td>
        <td><%= vendor.getBizName() %></td>
        <td><%= vendor.getBizAddress() %></td>
        <td><%= vendor.getBizCategory() %></td>
        <td><%= vendor.getServiceDescription() %></td>
        <td><%= vendor.getPriceRange() %></td>
        <td><%= vendor.getAvailableDays() %></td>
        <td><%= vendor.getAvailableTime() %></td>
        <td><%= vendor.getServiceArea() %></td>
        <td><%= vendor.getSpecialPackages() %></td>
        <td><%= vendor.getPortfolio() %></td>
        <td><%= vendor.getTnc() %></td>
        <td><%= vendor.getPictures() %></td>
        <td><%= vendor.getSpecialRequirements() %></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>

