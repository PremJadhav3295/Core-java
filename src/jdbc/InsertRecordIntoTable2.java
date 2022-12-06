package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordIntoTable2 {
    public static void main(String[] args) throws SQLException {
        //Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";
            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            String query1 = "insert into student values(101,'sagar',22,'java')";
            String query2 = "insert into student values(102,'rohit',23,'cpp')";
            String query3 = "insert into student values(103,'rohan',24,'php')";
            int i = statement.executeUpdate(query1);
            int j = statement.executeUpdate(query2);
            int k = statement.executeUpdate(query3);

            System.out.println("record inserted"+i);
            System.out.println("record inserted"+j);
            System.out.println("record inserted"+k);

            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception while connecting to database");
        }
    }
}
