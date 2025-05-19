package lk.sliit.vendorbooking;

import lk.sliit.vendorbooking.vendorClass.Vendor;
import lk.sliit.vendorbooking.vendorClass.BusinessDetails;
import lk.sliit.vendorbooking.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingService {

    public void createBooking(Booking booking) {
        try {
            System.out.println("Creating booking...");

            // Debug: Check if booking, user, or vendor is null
            System.out.println("Booking: " + booking);
            System.out.println("User: " + booking.getUser());
            System.out.println("Vendor: " + booking.getVendor());

            System.out.println("Booking in createBooking method with price: " + booking.getPrice());

            String query = "INSERT INTO vendorbookings (bizName, vendorID, vendorEmail, userName, userEmail, price) VALUES ('"
                    + booking.getVendor().getBusinessDetails().getBizName() + "', '"
                    + booking.getVendor().getVendorNIC() + "', '"
                    + booking.getVendor().getVendorEmail() + "', '"
                    + booking.getUser().getUserName() + "', '"
                    + booking.getUser().getEmail() + "', "
                    + booking.getPrice() + ")";

            System.out.println("Generated SQL: " + query);

            Statement stmt = DBconnect.getConnection().createStatement();
            int result = stmt.executeUpdate(query);

            System.out.println("Query executed. Rows affected: " + result);

        } catch (Exception e) {
            System.out.println("Exception during createBooking:");
            e.printStackTrace();
        }
    }

    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        System.out.println("Fetching all bookings...");

        try {
            String query = "SELECT * FROM vendorbookings";
            Statement stmt = DBconnect.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Processing a booking row...");

                Vendor vendor = new Vendor();
                // Create and set BusinessDetails object inside Vendor
                BusinessDetails businessDetails = new BusinessDetails();
                businessDetails.setBizName(rs.getString("bizName"));
                vendor.setBusinessDetails(businessDetails);

                vendor.setVendorNIC(rs.getString("vendorID"));
                vendor.setVendorEmail(rs.getString("vendorEmail"));

                User user = new User();
                user.setUserName(rs.getString("userName"));
                user.setEmail(rs.getString("userEmail"));

                double price = rs.getDouble("price");

                Booking booking = new Booking(vendor, user, price);
                bookings.add(booking);

                System.out.println("Added booking: " + businessDetails.getBizName() + " | " + user.getUserName());
            }

        } catch (Exception e) {
            System.out.println("Exception during getAllBookings:");
            e.printStackTrace();
        }

        System.out.println("Total bookings fetched: " + bookings.size());
        return bookings;
    }
}
