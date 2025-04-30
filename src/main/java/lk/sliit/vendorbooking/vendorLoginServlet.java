package lk.sliit.vendorbooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/vendorLogin")
public class vendorLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public vendorLoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the login credentials from the form
        Vendor vendorNew = new Vendor();
        vendorNew.setVendorNIC(request.getParameter("vendorIDLogin"));
        vendorNew.setVendorPassword(request.getParameter("vendorPasswordLogin"));
        vendorNew.setVendorEmail(request.getParameter("vendorEmailLogin"));

        // Create VendorService to validate the vendor
        vendorService vs = new vendorService();
        boolean status = vs.validateVendor(vendorNew);

        System.out.println("Status: " + status);
        System.out.println("Vendor ID: " + vendorNew.getVendorNIC());
        System.out.println("Vendor Email: " + vendorNew.getVendorEmail());
        System.out.println("Vendor Password: " + vendorNew.getVendorPassword());

        if(status) {
            // Get the vendor details by email
            Vendor specificVendor = vs.getVendorByEmail(vendorNew.getVendorEmail());
            request.setAttribute("specificVendor", specificVendor);

            // Forward to the vendor profile page
            System.out.println("Forwarding to vendorProfile.jsp");
            RequestDispatcher rd = request.getRequestDispatcher("vendorProfile.jsp");
            rd.forward(request, response);
        } else {
            // If login fails, forward back to the vendor login page
            System.out.println("Login failed, forwarding to vendorLogin.jsp");
            RequestDispatcher rd = request.getRequestDispatcher("vendorLogin.jsp");
            rd.forward(request, response);
        }

    }

}
