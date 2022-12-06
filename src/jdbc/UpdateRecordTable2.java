package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordTable2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password ="Prem@2001";

            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            String query = "update employee set employee_name = 'kuldeep' where employee_id = 9";

            int i = statement.executeUpdate(query);
            System.out.println("record update"+i);

        } catch (SQLException e) {
            System.out.println("Exception while connecting to database");
        }finally {
            connection.close();
        }
    }
}
