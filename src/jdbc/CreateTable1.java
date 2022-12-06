package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password ="Prem@2001";
            connection = DriverManager.getConnection(url,username,password);


            Statement statement = connection.createStatement();
            boolean isTableCreated = statement.execute("create table product(product_id int,product_name varchar(50),product_price int)");
            System.out.println("table created "+isTableCreated);

        } catch (SQLException e) {
            System.out.println("exception while connecting to the database");
        }finally {
            connection.close();
        }
    }
}
