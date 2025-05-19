package lk.sliit.vendorbooking;

import lk.sliit.vendorbooking.DSA.VendorLinkedList;
import lk.sliit.vendorbooking.vendorClass.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class vendorService implements VendorInterface {
    private static VendorLinkedList vendorList = new VendorLinkedList();

    public void registerVendor(Vendor vendor1){
        try{
            String query = "INSERT INTO vendorregistration VALUES ('"
                    + vendor1.getVendorNIC() + "', '"
                    + vendor1.getVendorName() + "', '"
                    + vendor1.getVendorPassword() + "', '"
                    + vendor1.getVendorEmail() + "', '"
                    + vendor1.getVendorAddress() + "', '"
                    + vendor1.getVendorContactName() + "', '"
                    + vendor1.getVendorPhone() + "', '"
                    + vendor1.getBusinessDetails().getBizName() + "', '"
                    + vendor1.getBusinessDetails().getBizAddress() + "', '"
                    + vendor1.getBusinessDetails().getBizLicenceNumber() + "', '"
                    + vendor1.getBusinessDetails().getBizCategory() + "', '"
                    + vendor1.getBusinessDetails().getSocialMediaLinks() + "', '"
                    + vendor1.getServiceDetails().getServiceDescription() + "', '"
                    + vendor1.getServiceDetails().getPriceRange() + "', '"
                    + vendor1.getServiceDetails().getAvailableDays() + "', '"
                    + vendor1.getServiceDetails().getAvailableTime() + "', '"
                    + vendor1.getServiceDetails().getServiceArea() + "', '"
                    + vendor1.getServiceDetails().getSpecialPackages() + "', '"
                    + vendor1.getPortfolio() + "', '"
                    + vendor1.getPortfolio().getTnC() + "', '"
                    + vendor1.getPortfolio().getPictures() + "', '"
                    + vendor1.getRequirements().getSpecialRequirements() + "')";

            Statement s1= DBconnect.getConnection().createStatement();
            System.out.println("Executing query: " + query);
            s1.executeUpdate(query);

            // Add vendor to linked list after successful DB insert
            vendorList.add(vendor1);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    // ✅ Overloaded method with Business Details and Services
    public void registerVendor(
            String vendorName, String email, String password,
            String bizName, String bizAddress, String bizLicenceNumber, String bizCategory, String socialMediaLinks,
            String serviceDescription, int priceRange, String availableDays, String availableTime,
            String serviceArea, String specialPackages
    ) {
        Vendor v = new Vendor();

        // Basic info
        v.setVendorName(vendorName);
        v.setVendorEmail(email);
        v.setVendorPassword(password);

        // Business Details
        //v.setBizName(bizName);
        //v.setBizAddress(bizAddress);
        //v.setBizLicenceNumber(bizLicenceNumber);
        //v.setBizCategory(bizCategory);
        //v.setSocialMediaLinks(socialMediaLinks);
        BusinessDetails bd = new BusinessDetails();
        bd.setBizName(bizName);
        bd.setBizAddress(bizAddress);
        bd.setBizLicenceNumber(bizLicenceNumber);
        bd.setBizCategory(bizCategory);
        bd.setSocialMediaLinks(socialMediaLinks);

        v.setBusinessDetails(bd);


        // Services
        //v.setServiceDescription(serviceDescription);
        //v.setPriceRange(priceRange);
        //v.setAvailableDays(availableDays);
        //v.setAvailableTime(availableTime);
        //v.setServiceArea(serviceArea);
        //v.setSpecialPackages(specialPackages);


        ServiceDetails sd = new ServiceDetails();
        sd.setServiceDescription(serviceDescription);
        sd.setPriceRange(priceRange);
        sd.setAvailableDays(availableDays);
        sd.setAvailableTime(availableTime);
        sd.setServiceArea(serviceArea);
        sd.setSpecialPackages(specialPackages);

        v.setServiceDetails(sd);

        // Register using existing method
        registerVendor(v);
    }


    //show info
    public List<Vendor> getAllVendors() {
        List<Vendor> list = new ArrayList<>();

        try (Connection conn = DBconnect.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM vendorregistration")) {

            while (rs.next()) {
                Vendor v = new Vendor();

                // Vendor Info
                v.setVendorNIC(rs.getString("vendorID"));
                v.setVendorName(rs.getString("Vname"));
                v.setVendorPassword(rs.getString("password"));
                v.setVendorEmail(rs.getString("email"));
                v.setVendorAddress(rs.getString("address"));
                v.setVendorContactName(rs.getString("contactNumber"));
                v.setVendorPhone(rs.getString("contactPerson"));

                // Business Details
                //v.setBizName(rs.getString("bizName"));
                //v.setBizAddress(rs.getString("bizAddress"));
                //v.setBizLicenceNumber(rs.getString("bizLicenceNumber"));
                //v.setBizCategory(rs.getString("bizCategory"));
                //v.setSocialMediaLinks(rs.getString("socialMediaLinks"));

                // Services
                //v.setServiceDescription(rs.getString("serviceDescription"));
                //v.setPriceRange(rs.getInt("priceRange"));
                //v.setAvailableDays(rs.getString("availableDays"));
                //v.setAvailableTime(rs.getString("availableTime"));
                //v.setServiceArea(rs.getString("serviceArea"));
                //v.setSpecialPackages(rs.getString("specialPackages"));

                // Portfolio
                //v.setPortfolio(rs.getString("portfolio"));
                //v.setTnc(rs.getString("tncDoc"));
                //v.setPictures(rs.getString("picture"));

                // Additional Requirements
                //v.setSpecialRequirements(rs.getString("specialRequirements"));



                // Business Details
                BusinessDetails bd = new BusinessDetails();
                bd.setBizName(rs.getString("bizName"));
                bd.setBizAddress(rs.getString("bizAddress"));
                bd.setBizLicenceNumber(rs.getString("bizLicenceNumber"));
                bd.setBizCategory(rs.getString("bizCategory"));
                bd.setSocialMediaLinks(rs.getString("socialMediaLinks"));
                v.setBusinessDetails(bd);

                // Service Details
                ServiceDetails sd = new ServiceDetails();
                sd.setServiceDescription(rs.getString("serviceDescription"));
                sd.setPriceRange(rs.getInt("priceRange"));
                sd.setAvailableDays(rs.getString("availableDays"));
                sd.setAvailableTime(rs.getString("availableTime"));
                sd.setServiceArea(rs.getString("serviceArea"));
                sd.setSpecialPackages(rs.getString("specialPackages"));
                v.setServiceDetails(sd);

                // Portfolio
                Portfolio p = new Portfolio();
                p.setPortfolio(rs.getString("portfolio"));
                p.setTnC(rs.getString("tncDoc"));
                p.setPictures(rs.getString("picture"));
                v.setPortfolio(p);

                // Additional Requirements
                Requirements r = new Requirements();
                r.setSpecialRequirements(rs.getString("specialRequirements"));
                v.setRequirements(r);

                // Debugging: print out vendor details
                System.out.println("Retrieved Vendor: " + v.getVendorName());

                list.add(v);
                //return vendorList.getAll();
            }
            return vendorList.getAll();

        } catch (SQLException e) {
            // Log the exception or rethrow it as needed
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
    // Validate Vendor by NIC, Email, and Password
    public boolean validateVendor(Vendor vendor2) {
        System.out.println("Establishing database connection...");
        try {
            String query = "SELECT * FROM vendorregistration WHERE vendorID = '" + vendor2.getVendorNIC() +
                    "' AND email = '" + vendor2.getVendorEmail() +
                    "' AND password = '" + vendor2.getVendorPassword() + "'";

            Statement s2 = DBconnect.getConnection().createStatement();
            if (s2 != null) {
                System.out.println("Database connection successful.");
            } else {
                System.out.println("Failed to establish database connection.");
            }
            ResultSet rs = s2.executeQuery(query);

            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Get Vendor by Email
    public Vendor getVendorByEmail(String email) {
        Vendor specificVendor = null;
        try {
            String query = "SELECT * FROM vendorregistration WHERE email = '" + email + "'";
            System.out.println("Executing SQL: " + query + " with email: " + email);
            Statement stmt = DBconnect.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                specificVendor = new Vendor();

                // Vendor Info
                specificVendor.setVendorNIC(rs.getString("vendorID"));
                specificVendor.setVendorName(rs.getString("Vname"));
                specificVendor.setVendorPassword(rs.getString("password"));
                specificVendor.setVendorEmail(rs.getString("email"));
                specificVendor.setVendorAddress(rs.getString("address"));
                specificVendor.setVendorContactName(rs.getString("contactPerson"));
                specificVendor.setVendorPhone(rs.getString("contactNumber"));

                // Business Details
                //specificVendor.setBizName(rs.getString("bizName"));
                //specificVendor.setBizAddress(rs.getString("bizAddress"));
                //specificVendor.setBizLicenceNumber(rs.getString("bizLicenceNumber"));
                //specificVendor.setBizCategory(rs.getString("bizCategory"));
                //specificVendor.setSocialMediaLinks(rs.getString("socialMediaLinks"));

                // Services
                //specificVendor.setServiceDescription(rs.getString("serviceDescription"));
                //specificVendor.setPriceRange(rs.getInt("priceRange"));
                //specificVendor.setAvailableDays(rs.getString("availableDays"));
                //specificVendor.setAvailableTime(rs.getString("availableTime"));
                //specificVendor.setServiceArea(rs.getString("serviceArea"));
                //specificVendor.setSpecialPackages(rs.getString("specialPackages"));

                // Portfolio
                //specificVendor.setPortfolio(rs.getString("portfolio"));
                //specificVendor.setTnc(rs.getString("tncDoc"));
                //specificVendor.setPictures(rs.getString("picture"));

                // Additional Requirements
                //specificVendor.setSpecialRequirements(rs.getString("specialRequirements"));


// Business Details
                BusinessDetails bd = new BusinessDetails();
                bd.setBizName(rs.getString("bizName"));
                bd.setBizAddress(rs.getString("bizAddress"));
                bd.setBizLicenceNumber(rs.getString("bizLicenceNumber"));
                bd.setBizCategory(rs.getString("bizCategory"));
                bd.setSocialMediaLinks(rs.getString("socialMediaLinks"));
                specificVendor.setBusinessDetails(bd);

// Services
                ServiceDetails sd = new ServiceDetails();
                sd.setServiceDescription(rs.getString("serviceDescription"));
                sd.setPriceRange(rs.getInt("priceRange"));
                sd.setAvailableDays(rs.getString("availableDays"));
                sd.setAvailableTime(rs.getString("availableTime"));
                sd.setServiceArea(rs.getString("serviceArea"));
                sd.setSpecialPackages(rs.getString("specialPackages"));
                specificVendor.setServiceDetails(sd);

// Portfolio
                Portfolio pf = new Portfolio();
                pf.setPortfolio(rs.getString("portfolio"));
                pf.setTnC(rs.getString("tncDoc"));
                pf.setPictures(rs.getString("picture"));
                specificVendor.setPortfolio(pf);

// Additional Requirements
                Requirements r = new Requirements();
                r.setSpecialRequirements(rs.getString("specialRequirements"));
                specificVendor.setRequirements(r);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return specificVendor;
    }

    public List<Vendor> getVendorsByCategory(String category) {
        List<Vendor> vendors = new ArrayList<>();

        // Build the query string with the category directly (note: be careful of SQL injection risk)
        String query = "SELECT * FROM vendorregistration WHERE LOWER(TRIM(bizCategory)) = LOWER(TRIM('" + category + "'))";

        // Use try-with-resources to ensure connection and statement are closed automatically
        try (
                Connection conn = DBconnect.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
        ) {
            while (rs.next()) {
                Vendor vendor = new Vendor();

                vendor.setVendorNIC(rs.getString("vendorID"));
                vendor.setVendorName(rs.getString("Vname"));
                vendor.setVendorEmail(rs.getString("email"));
                vendor.setVendorAddress(rs.getString("address"));
                vendor.setVendorPhone(rs.getString("contactNumber"));
                vendor.setVendorContactName(rs.getString("contactPerson"));

                //vendor.setBizName(rs.getString("bizName"));
                //vendor.setBizAddress(rs.getString("bizAddress"));
                //vendor.setBizLicenceNumber(rs.getString("bizLicenceNumber"));
                //vendor.setBizCategory(rs.getString("bizCategory"));
                //vendor.setSocialMediaLinks(rs.getString("socialMediaLinks"));

                //vendor.setServiceDescription(rs.getString("serviceDescription"));
                //vendor.setPriceRange(rs.getInt("priceRange"));
                //vendor.setAvailableDays(rs.getString("availableDays"));
                //vendor.setAvailableTime(rs.getString("availableTime"));
                //vendor.setServiceArea(rs.getString("serviceArea"));
                //vendor.setSpecialPackages(rs.getString("specialPackages"));

                //vendor.setPortfolio(rs.getString("portfolio"));
                //vendor.setTnc(rs.getString("tncDoc"));
                //vendor.setPictures(rs.getString("picture"));

                //vendor.setSpecialRequirements(rs.getString("specialRequirements"));

                //vendors.add(vendor);

                // Business Details
                BusinessDetails biz = new BusinessDetails();
                biz.setBizName(rs.getString("bizName"));
                biz.setBizAddress(rs.getString("bizAddress"));
                biz.setBizLicenceNumber(rs.getString("bizLicenceNumber"));
                biz.setBizCategory(rs.getString("bizCategory"));
                biz.setSocialMediaLinks(rs.getString("socialMediaLinks"));
                vendor.setBusinessDetails(biz);

// Service Details
                ServiceDetails service = new ServiceDetails();
                service.setServiceDescription(rs.getString("serviceDescription"));
                service.setPriceRange(rs.getInt("priceRange"));
                service.setAvailableDays(rs.getString("availableDays"));
                service.setAvailableTime(rs.getString("availableTime"));
                service.setServiceArea(rs.getString("serviceArea"));
                service.setSpecialPackages(rs.getString("specialPackages"));
                vendor.setServiceDetails(service);

// Portfolio
                Portfolio pf = new Portfolio();
                pf.setPortfolio(rs.getString("portfolio"));
                pf.setTnC(rs.getString("tncDoc"));
                pf.setPictures(rs.getString("picture"));
                vendor.setPortfolio(pf);

// Requirements
                Requirements req = new Requirements();
                req.setSpecialRequirements(rs.getString("specialRequirements"));
                vendor.setRequirements(req);

// Add to list
                vendors.add(vendor);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vendors;
    }

}

