import java.sql.*;

public class VoterRegistrationDAO {
    public static void saveData(String name, int age, String address) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "username", "password");

            PreparedStatement ps = con.prepareStatement("INSERT INTO voters (name, age, address) VALUES (?, ?, ?)");
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}