import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        
        // Pass parameters to a class to save data to the database
        VoterRegistrationDAO.saveData(name, age, address);
        
        out.println("<h2>Registration Successful!</h2>");
        out.println("<p>Thank you for registering.</p>");
    }
}