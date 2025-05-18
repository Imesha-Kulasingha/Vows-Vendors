<%@ page import="lk.sliit.vendorbooking.BookingService" %>
<%@ page import="lk.sliit.vendorbooking.Booking" %>
<%@ page import="java.util.List" %>

<%
    BookingService bookingService = new BookingService();
    List<Booking> allBookings = bookingService.getAllBookings();
%>

<h2>All Bookings</h2>
<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <th>Vendor ID</th>
        <th>Vendor Name</th>
        <th>Vendor Email</th>
        <th>User Name</th>
        <th>User Email</th>
        <th>Price</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>

    <%
        for (Booking booking : allBookings) {
            String vendorID = booking.getVendor().getVendorNIC();
            String vendorName = booking.getVendor().getBizName();
            String vendorEmail = booking.getVendor().getVendorEmail();
            String userName = booking.getUser().getUserName();
            String userEmail = booking.getUser().getEmail();
            double price = booking.getPrice();
            String status = booking.getStatus();
    %>
    <tr>
        <td><%= vendorID %></td>
        <td><%= vendorName %></td>
        <td><%= vendorEmail %></td>
        <td><%= userName %></td>
        <td><%= userEmail %></td>
        <td><%= price %></td>
        <td><%= status %></td>
        <td>
            <% if ("Pending".equalsIgnoreCase(status)) { %>
            <form action="UpdateBookingStatusServlet" method="post" style="display:inline;">
                <input type="hidden" name="userEmail" value="<%= userEmail %>">
                <input type="hidden" name="vendorEmail" value="<%= vendorEmail %>">
                <input type="hidden" name="action" value="accept">
                <button type="submit">Accept</button>
            </form>
            <form action="UpdateBookingStatusServlet" method="post" style="display:inline;">
                <input type="hidden" name="userEmail" value="<%= userEmail %>">
                <input type="hidden" name="vendorEmail" value="<%= vendorEmail %>">
                <input type="hidden" name="action" value="deny">
                <button type="submit">Deny</button>
            </form>
            <% } else { %>
            No actions
            <% } %>
        </td>
    </tr>
    <%
        }
    %>
</table>
