package lk.sliit.vendorbooking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/userLogin")
public class userLoginServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;

     public userLoginServlet() {
         super();
     }

     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.getWriter().append("Served at: ").append(request.getContextPath());
     }

     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         User userNew = new User();
         userNew.setUserName(request.getParameter("usernameL"));
         userNew.setPassword(request.getParameter("passwordL"));
         userNew.setEmail(request.getParameter("email_Login"));

         userService  us =new userService();
         boolean status = us.validateUser(userNew);

         if(status){

             HttpSession session = request.getSession();
             session.setAttribute("userEmail", userNew.getEmail());

             User specificUser = us.getUserByEmail(userNew.getEmail());
             //request.setAttribute("specificUser", specificUser);
             session.setAttribute("specificUser", specificUser);
             RequestDispatcher rd=request.getRequestDispatcher("userProfile.jsp");
             rd.forward(request, response);
         }
         else{
             RequestDispatcher rd=request.getRequestDispatcher("userLogin.jsp");
             rd.forward(request, response);
         }


     }

}
