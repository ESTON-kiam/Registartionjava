@WebServlet("/voterRegistrationServlet")
public class VoterRegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Retrieve the request parameters and validate them
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String dob = request.getParameter("dob");
    // Validate and sanitize the input data

    // Pass the data to the class that saves it to the database
    VoterRegistrationDao voterRegistrationDao = new VoterRegistrationDao();
    VoterRegistrationDto voterRegistrationDto = new VoterRegistrationDto(name, address, dob);
    voterRegistrationDao.save(voterRegistrationDto);

    // Redirect the user to a confirmation page
    response.sendRedirect("confirmation.html");
  }
}