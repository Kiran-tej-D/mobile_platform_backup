 package practice.JDBC;

// import java.sql.*;

// public class jdbcDemo {
//     public static void main(String[] args) throws ClassNotFoundException, SQLException {
//         String driverClassName = "";
//         String url = "";
//         String username = "";
//         String pass = "";
//         String query = "";

//         // Load the driver
//         Class.forName(driverClassName);

//         // Create a connection
//         Connection conn = DriverManager.getConnection(url, username, pass);

//         // Prepare a statement --> query to exec
//         Statement st = conn.createStatement();
//         int count = st.executeUpdate(query);

//         System.out.println("Rows effected: " + count);
//         conn.close();
//     }
// }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public final class App {
    public static void main(String[] args) {
        String sql = "select * from test1";
 
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test", "root", "");
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
 
            ResultSet resultSet = preparedStatement.executeQuery();
 
            while (resultSet.next()) {
                long age = resultSet.getLong("age");
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("salary");
 
                System.out.println(name + ", " + age + ", " + salary);
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}