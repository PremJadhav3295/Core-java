package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordWithScanner {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product Id : ");
        int productId=scanner.nextInt();
        System.out.print("Product Name : ");
        String productName=scanner.next();
        System.out.print("Product Price : ");
        int productPrice=scanner.nextInt();

        try {
            String url = "jdbc:mysql://localhost:3306/csj255";
            String username = "root";
            String password = "Prem@2001";
            connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            int i = statement.executeUpdate("insert into product values("+productId+",'"+productName+"',"+productPrice+")");
            System.out.println("record inserted "+i);


        } catch (SQLException e) {
            System.out.println("Exception while connecting to database");
        }finally {
            connection.close();
        }


    }
}
