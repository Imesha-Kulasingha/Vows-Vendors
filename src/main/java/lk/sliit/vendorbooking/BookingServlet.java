package lk.sliit.vendorbooking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import lk.sliit.vendorbooking.vendorClass.Vendor;
import lk.sliit.vendorbooking.vendorClass.BusinessDetails;  // Import if needed

import java.io.IOException;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {

    private final BookingService bookingService = new BookingService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String vendorID = request.getParameter("vendorID");
            String vendorName = request.getParameter("vendorName");
            String vendorEmail = request.getParameter("vendorEmail");

            String userName = request.getParameter("userName");
            String userEmail = request.getParameter("userEmail");

            double price = 20.0;
            try {
                price = Double.parseDouble(request.getParameter("price"));
            } catch (NumberFormatException e) {
                System.out.println("Invalid price format: " + e.getMessage());
            }

            Vendor vendor = new Vendor();
            vendor.setVendorNIC(vendorID);
            vendor.setVendorEmail(vendorEmail);

            // Initialize BusinessDetails if null and set business name
            if (vendor.getBusinessDetails() == null) {
                vendor.setBusinessDetails(new BusinessDetails());
            }
            vendor.getBusinessDetails().setBizName(vendorName);

            User user = new User();
            user.setUserName(userName);
            user.setEmail(userEmail);

            Booking booking = new Booking(vendor, user, price);
            booking.setStatus("Pending"); // Set booking status

            bookingService.createBooking(booking);

            HttpSession session = request.getSession();
            session.setAttribute("bookingMessage", userName + " requested this service. Your booking is pending.");

            // Redirect to bookings page
            response.sendRedirect("myBookings.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
