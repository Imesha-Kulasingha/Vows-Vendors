package lk.sliit.vendorbooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


@WebServlet("/addUser")
public class addUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public addUserServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User newUser = new User();

        newUser.setFullName(request.getParameter("fullName"));
        newUser.setUserName(request.getParameter("userName"));
        newUser.setNic(request.getParameter("nic"));
        newUser.setGender(request.getParameter("gender"));
        newUser.setAddress(request.getParameter("address"));
        newUser.setEmail(request.getParameter("email"));
        newUser.setContactNumber(request.getParameter("contactNumber"));
        newUser.setPassword(request.getParameter("password"));

        // Service to handle DB logic (you'll create this class)
        userService service = new userService();
        service.registerUser(newUser);

        // Retrieve all users and forward to JSP
        List<User> userList = service.getAllUsers();
        request.setAttribute("users", userList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("userDetailsDisplay.jsp");
        dispatcher.forward(request, response);
    }
}
