<%@ page import="java.util.List" %>
<%@ page import="lk.sliit.vendorbooking.Vendor" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vendor List</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 2rem;
            background-color: #f9f9f9;
        }

        h2 {
            text-align: center;
            margin-bottom: 2rem;
        }

        .vendor-list {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
            gap: 1.5rem;
            text-align: center;
        }

        .vendor-card {
            background-color: white;
            border-radius: 12px;
            padding: 1rem;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05);
            text-decoration: none;
            color: inherit;
            transition: transform 0.2s ease;
            cursor: pointer;
            display: block;
        }

        .vendor-card:hover {
            transform: scale(1.03);
        }

        .vendor-card img {
            width: 100%;
            height: 120px;
            object-fit: cover;
            border-radius: 8px;
            margin-bottom: 0.5rem;
        }
    </style>

</head>
<body>

<h2>Choose a Vendor</h2>

<div class="vendor-list">
    <%
        List<Vendor> vendorList = (List<Vendor>) request.getAttribute("vendorList");
        if (vendorList != null && !vendorList.isEmpty()) {
            for (Vendor vendor : vendorList) {
    %>
    <a class="vendor-card" href="vendorDetails.jsp?vendorName=<%= vendor.getVendorName() %>">
        <h3><%= vendor.getVendorName() %></h3>
        <p><%= vendor.getBizCategory() %></p>
    </a>
    <%
        }
    } else {
    %>
    <p>No vendors found.</p>
    <%
        }
    %>
</div>

</body>
</html>
