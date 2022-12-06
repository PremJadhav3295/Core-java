package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordIntoTableDynamic2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the product id,name and price");
            int product_id = scanner.nextInt();
            String product_name = scanner.next();
            int product_price = scanner.nextInt();

            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";

            connection = DriverManager.getConnection(url,username,password);

            String query = "insert into product values(?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,product_id);
            preparedStatement.setString(2,product_name);
            preparedStatement.setInt(3,product_price);
            preparedStatement.executeUpdate();

            System.out.println("record inserted "+preparedStatement);

        } catch (SQLException e) {
            System.out.println("Exception while connecting database");
        }finally {
            connection.close();
        }
    }

}
