package lk.sliit.vendorbooking;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.sliit.vendorbooking.vendorClass.*;

import java.io.IOException;
import java.util.List;


@WebServlet("/addVendor")
public class addVendorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public addVendorServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Vendor Newvendor = new Vendor();

        //vendorInfo
        Newvendor.setVendorNIC(request.getParameter("vendorNIC"));
        Newvendor.setVendorName(request.getParameter("vendorName"));
        Newvendor.setVendorAddress(request.getParameter("vendorAddress"));
        Newvendor.setVendorPhone(request.getParameter("contactNumber"));
        Newvendor.setVendorEmail(request.getParameter("vemail"));
        Newvendor.setVendorPassword(request.getParameter("vpassword"));
        Newvendor.setVendorContactName(request.getParameter("contactPerson"));

        //Biz details
        //Newvendor.setBizName(request.getParameter("businessName"));
        //Newvendor.setBizAddress(request.getParameter("bizAddress"));
        //Newvendor.setBizLicenceNumber(String.valueOf(request.getParameter("license")));
        //Newvendor.setBizCategory(request.getParameter("vendorType"));
        //Newvendor.setSocialMediaLinks(request.getParameter("socialMedia"));

        BusinessDetails bizDetails = new BusinessDetails();
        bizDetails.setBizName(request.getParameter("businessName"));
        bizDetails.setBizAddress(request.getParameter("bizAddress"));
        bizDetails.setBizLicenceNumber(request.getParameter("license"));
        bizDetails.setBizCategory(request.getParameter("vendorType"));
        bizDetails.setSocialMediaLinks(request.getParameter("socialMedia"));

        Newvendor.setBusinessDetails(bizDetails); // ← Add this line to inject into Vendor


        //services
        //Newvendor.setServiceDescription(request.getParameter("serviceDescription"));
        //Newvendor.setPriceRange(Integer.parseInt(request.getParameter("priceRange")));
        //Newvendor.setAvailableDays(request.getParameter("availabilityDays"));
        //Newvendor.setAvailableTime(request.getParameter("availableTime"));
        //Newvendor.setServiceArea(request.getParameter("serviceArea"));
        //Newvendor.setSpecialPackages(request.getParameter("specialPackages"));
        //Newvendor.setSpecialRequirements(request.getParameter("specialReq"));

        // ServiceDetails
        ServiceDetails serviceDetails = new ServiceDetails();
        serviceDetails.setServiceDescription(request.getParameter("serviceDescription"));
        serviceDetails.setPriceRange(Integer.parseInt(request.getParameter("priceRange")));
        serviceDetails.setAvailableDays(request.getParameter("availabilityDays"));
        serviceDetails.setAvailableTime(request.getParameter("availableTime"));
        serviceDetails.setServiceArea(request.getParameter("serviceArea"));
        serviceDetails.setSpecialPackages(request.getParameter("specialPackages"));
        Newvendor.setServiceDetails(serviceDetails); // <-- this line is critical


        //portfolio
        //Newvendor.setPortfolio(request.getParameter("portfolio"));
        //Newvendor.setTnc(request.getParameter("tnc"));
        //Newvendor.setPictures(request.getParameter("pictures"));
        // Portfolio (via Portfolio object)

        // Requirements
        Requirements requirements = new Requirements();
        requirements.setSpecialRequirements(request.getParameter("specialReq"));
        Newvendor.setRequirements(requirements); // <-- this too

// Portfolio
        Portfolio portfolio = new Portfolio();
        portfolio.setPortfolio(request.getParameter("portfolio"));
        portfolio.setTnC(request.getParameter("tnc"));
        portfolio.setPictures(request.getParameter("pictures"));
        Newvendor.setPortfolio(portfolio); // <-- and this

        vendorService vs = new vendorService();

        vs.registerVendor(
                request.getParameter("vendorName"),
                request.getParameter("vemail"),
                request.getParameter("vpassword"),
                request.getParameter("businessName"),
                request.getParameter("bizAddress"),
                request.getParameter("license"),
                request.getParameter("vendorType"),
                request.getParameter("socialMedia"),
                request.getParameter("serviceDescription"),
                Integer.parseInt(request.getParameter("priceRange")),
                request.getParameter("availabilityDays"),
                request.getParameter("availableTime"),
                request.getParameter("serviceArea"),
                request.getParameter("specialPackages")
        );

        vendorService service = new vendorService();
        service.registerVendor(Newvendor);

        // Get all vendors to show on JSP
        List<Vendor> vendorList = service.getAllVendors(); // <- We need to create this


        request.setAttribute("vendors", vendorList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("vendorDetailsDisplay.jsp");
        dispatcher.forward(request, response);
    }



}

