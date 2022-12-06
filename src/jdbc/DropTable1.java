package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";

            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            boolean tableDroped = statement.execute("drop table product");
            System.out.println("delete table"+tableDroped);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection.close();
        }
    }
}
