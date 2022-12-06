package jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordTable1 {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";

            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            String query = "update student set student_skill = 'framework' where student_id = 102";

            int i = statement.executeUpdate(query);
            System.out.println("record inserted"+i);

        } catch (SQLException e) {
            System.out.println("Exception while connecting database");
        }finally {
            connection.close();
        }
    }
}
