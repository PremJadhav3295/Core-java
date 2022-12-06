package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordFromTable {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";

            connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String query = "delete from product where product_id = 5 ";

            statement.executeUpdate(query);
            System.out.println("record update"+statement);

        } catch (Exception e) {
            System.out.println("Exception while connecting database");
        }finally {
            connection.close();
        }
    }
}
