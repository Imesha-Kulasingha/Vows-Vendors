package lk.sliit.vendorbooking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class userService {
    public void registerUser(User user1){
        try{
            String query = "INSERT INTO userdetails VALUES ('"
                    +user1.getFullName() +"','"
                    +user1.getUserName()+"','"
                    +user1.getNic()+"','"
                    +user1.getGender()+"','"
                    +user1.getAddress()+"','"
                    +user1.getEmail()+"','"
                    +user1.getContactNumber()+"','"
                    +user1.getPassword()+"')";

            Statement s1= DBconnect.getConnection().createStatement();
            System.out.println("Executing query: " + query);
            s1.executeUpdate(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //show info
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        try (Connection conn = DBconnect.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM userdetails")) {

            while (rs.next()) {
                User user = new User();

                user.setFullName(rs.getString("fullName"));
                user.setUserName(rs.getString("userName"));
                user.setNic(rs.getString("NIC"));
                user.setGender(rs.getString("gender"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setContactNumber(rs.getString("contactNumber"));
                user.setPassword(rs.getString("UserPassword"));

                // Optional: print debug info
                System.out.println("Retrieved User: " + user.getUserName());

                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Or log it properly
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    public boolean validateUser(User user2) {
        try {
          String query = "SELECT * FROM userdetails WHERE userName='"+user2.getUserName()+"'and email='"+user2.getEmail()+"' and userPassword = "+user2.getPassword()+"";
          Statement s2= DBconnect.getConnection().createStatement();

          ResultSet rs = s2.executeQuery(query);

          if(rs.next()){
              return true;
          }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User getUserByEmail(String email) {
        User specificUser = null;

        try {
            String query = "SELECT * FROM userdetails WHERE email = '" + email + "'";
            Statement stmt = DBconnect.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                specificUser = new User();

                specificUser.setFullName(rs.getString("fullName"));
                specificUser.setUserName(rs.getString("userName"));
                specificUser.setNic(rs.getString("NIC"));
                specificUser.setGender(rs.getString("gender"));
                specificUser.setAddress(rs.getString("address"));
                specificUser.setEmail(rs.getString("email"));
                specificUser.setContactNumber(rs.getString("contactNumber"));
                specificUser.setPassword(rs.getString("UserPassword")); // optional
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return specificUser;
    }

}
