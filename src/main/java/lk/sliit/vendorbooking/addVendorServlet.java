package lk.sliit.vendorbooking;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
        Newvendor.setBizName(request.getParameter("businessName"));
        Newvendor.setBizAddress(request.getParameter("bizAddress"));
        Newvendor.setBizLicenceNumber(String.valueOf(request.getParameter("license")));
        Newvendor.setBizCategory(request.getParameter("vendorType"));
        Newvendor.setSocialMediaLinks(request.getParameter("socialMedia"));

        //services
        Newvendor.setServiceDescription(request.getParameter("serviceDescription"));
        Newvendor.setPriceRange(Integer.parseInt(request.getParameter("priceRange")));
        Newvendor.setAvailableDays(request.getParameter("availabilityDays"));
        Newvendor.setAvailableTime(request.getParameter("availableTime"));
        Newvendor.setServiceArea(request.getParameter("serviceArea"));
        Newvendor.setSpecialPackages(request.getParameter("specialPackages"));
        Newvendor.setSpecialRequirements(request.getParameter("specialReq"));

        //portfolio
        Newvendor.setPortfolio(request.getParameter("portfolio"));
        Newvendor.setTnc(request.getParameter("tnc"));
        Newvendor.setPictures(request.getParameter("pictures"));



        vendorService service = new vendorService();
        service.registerVendor(Newvendor);

        // Get all vendors to show on JSP
        List<Vendor> vendorList = service.getAllVendors(); // <- We need to create this


        request.setAttribute("vendors", vendorList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("vendorDetailsDisplay.jsp");
        dispatcher.forward(request, response);
    }



}

