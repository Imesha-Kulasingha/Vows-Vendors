<%@ page import="java.sql.*, javax.sql.*" %>
<%
    String vendorEmail = request.getParameter("vendorEmail");
    String userEmail = (String) session.getAttribute("userEmail"); // assume logged-in user

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingvendordb", "root", "");

        PreparedStatement ps = con.prepareStatement("INSERT INTO bookings (userEmail, vendorEmail, status) VALUES (?, ?, 'Pending')");
        ps.setString(1, userEmail);
        ps.setString(2, vendorEmail);
        ps.executeUpdate();

        con.close();
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
%>
<p>Your booking is pending. Vendor will accept or deny soon.</p>
<a href="index.jsp">Back to Dashboard</a>
