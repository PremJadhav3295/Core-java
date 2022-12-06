package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordPrepareStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter thr product id to be deleted");
            int product_id = scanner.nextInt();

            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";
            connection = DriverManager.getConnection(url,username,password);

            String query = "delete from product where product_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,product_id);
            preparedStatement.executeUpdate();

            System.out.println("record update"+preparedStatement);

        } catch (Exception e) {
            System.out.println("Exception while connecting database");
        }finally {
            connection.close();
        }
    }
}
