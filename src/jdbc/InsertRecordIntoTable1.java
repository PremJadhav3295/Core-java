package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertRecordIntoTable1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";
            connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "insert into product values(1,'watch',1000)";
            String query1 = "insert into product values(2,'table',2000)";
            String query2 = "insert into product values(3,'laptop',30000)";

            int i = statement.executeUpdate(query);
            int j = statement.executeUpdate(query1);
            int k = statement.executeUpdate(query2);
            System.out.println("record inserted"+i);
            System.out.println("record inserted"+j);
            System.out.println("record inserted"+k);


        } catch (SQLException e) {
            System.out.println("Exception while connecting to database");
        }finally {
            connection.close();
        }


    }
}
