import java.sql.*;
class Jdbc {
    public static void main(String args[]) {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "Psgr@123"
            );
            // Create Statement
            Statement stmt = con.createStatement();
            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            // Display Result
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("dept")
                );
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}