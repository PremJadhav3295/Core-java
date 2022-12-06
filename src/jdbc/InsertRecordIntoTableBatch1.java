package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordIntoTableBatch1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";
            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            String Query1 = "insert into employee values(1,'Sanket')";
            String Query2 = "insert into employee values(2,'Prathamesh')";
            String Query3 = "insert into employee values(3,'Akash')";
            String Query4 = "insert into employee values(4,'Rohan')";
            String Query5 = "insert into employee values(5,'Sumit')";

            statement.addBatch(Query1);
            statement.addBatch(Query2);
            statement.addBatch(Query3);
            statement.addBatch(Query4);
            statement.addBatch(Query5);

            int[] recordsInserted = statement.executeBatch();

            System.out.println("records inserted"+recordsInserted.length);

        } catch (SQLException e) {
            System.out.println("Exception while connecting to the database");
        } finally {
            connection.close();
        }
    }
}
