public class VoterRegistrationDao {
  public void save(VoterRegistrationDto voterRegistrationDto) throws SQLException {
    // Establish a connection to the MySQL database
    Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    // Save the data to the database using JDBC
    // ...
    // Close the connection
    connection.close();
  }
}