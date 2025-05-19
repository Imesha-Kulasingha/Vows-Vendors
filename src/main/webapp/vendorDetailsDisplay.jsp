<%@ page import="lk.sliit.vendorbooking.vendorClass.Vendor" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vendor List</title>
    <link rel="stylesheet" href="css/vendorDetailsDisplay.css">
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
        <td><%= vendor.getBusinessDetails().getBizName() %></td>
        <td><%= vendor.getBusinessDetails().getBizAddress() %></td>
        <td><%= vendor.getBusinessDetails().getBizCategory() %></td>
        <td><%= vendor.getServiceDetails().getServiceDescription() %></td>
        <td><%= vendor.getServiceDetails().getPriceRange() %></td>
        <td><%= vendor.getServiceDetails().getAvailableDays() %></td>
        <td><%= vendor.getServiceDetails().getAvailableTime() %></td>
        <td><%= vendor.getServiceDetails().getServiceArea() %></td>
        <td><%= vendor.getServiceDetails().getSpecialPackages() %></td>
        <td><%= vendor.getPortfolio() %></td>
        <td><%= vendor.getPortfolio().getTnC() %></td>
        <td><%= vendor.getPortfolio().getPictures() %></td>
        <td><%= vendor.getRequirements().getSpecialRequirements() %></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>

