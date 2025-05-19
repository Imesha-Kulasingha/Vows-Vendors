package lk.sliit.vendorbooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.sliit.vendorbooking.DSA.VendorSort;
import lk.sliit.vendorbooking.vendorClass.Vendor;

import java.io.IOException;
import java.util.List;

@WebServlet("/vendorCategoryList")
public class vendorListDisplayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Inside doGet method of vendorListDisplayServlet");

        // Get the category and sortBy parameters from URL
        String category = request.getParameter("category");
        String sortBy = request.getParameter("sortBy");
        System.out.println("Category: " + category);
        System.out.println("SortBy: " + sortBy);

        vendorService service = new vendorService();

        if (category != null && !category.isEmpty()) {
            // Fetch the vendors from database based on category
            List<Vendor> vendorList = service.getVendorsByCategory(category);

            // Sort if needed
            if ("priceAsc".equals(sortBy)) {
                VendorSort.bubbleSortVendorsByPrice(vendorList);
            } else if ("priceDesc".equals(sortBy)) {
                VendorSort.bubbleSortVendorsByPriceDesc(vendorList);
            }

            // Debugging output
            for (Vendor vendor : vendorList) {
                System.out.println("Vendor Name: " + vendor.getVendorName());
            }

            // Set attributes for JSP
            request.setAttribute("vendorList", vendorList);
            request.setAttribute("selectedCategory", category);
            request.setAttribute("sortBy", sortBy);

            // Forward to vendor list page
            RequestDispatcher dispatcher = request.getRequestDispatcher("vendorList.jsp");
            dispatcher.forward(request, response);
        } else {
            System.out.println("Category parameter is missing");
            response.sendRedirect("vendorCategory.jsp");
        }
    }
}
