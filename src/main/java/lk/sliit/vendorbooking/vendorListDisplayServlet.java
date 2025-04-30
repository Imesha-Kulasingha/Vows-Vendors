package lk.sliit.vendorbooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/vendorCategoryList")
public class vendorListDisplayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Inside doGet method of vendorListDisplayServlet");

        // Get the category parameter from URL
        String category = request.getParameter("category");
        System.out.println("Category: " + category);

        vendorService service = new vendorService();

        if (category != null) {
            System.out.println("Category: " + category);
        } else {
            System.out.println("Category parameter is missing");
        }


        if (category != null && !category.isEmpty()) {
            // Fetch the vendors from database based on category
            List<Vendor> vendorList = service.getVendorsByCategory(category);
            System.out.println(vendorList);

            for (Vendor vendor : vendorList) {
                System.out.println("Vendor Name: " + vendor.getVendorName());
            }


            // Attach the list to the request
            request.setAttribute("vendorList", vendorList);
            request.setAttribute("selectedCategory", category);

            // Forward to JSP
            RequestDispatcher dispatcher = request.getRequestDispatcher("vendorList.jsp");
            dispatcher.forward(request, response);
        } else {
            // If no category provided, redirect back or show error
            System.out.println("Category parameter is missing");
            response.sendRedirect("vendorCategory.jsp");
        }
    }
}

