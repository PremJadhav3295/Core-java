package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordIntoTableBatch2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";

            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            String query1 = "insert into employee values(6,'rahul')";
            String query2 = "insert into employee values(7,'mayur')";
            String query3 = "insert into employee values(8,'roshan')";
            String query4 = "insert into employee values(9,'kunal')";
            String query5 = "insert into employee values(10,'ganesh')";

            statement.addBatch(query1);
            statement.addBatch(query2);
            statement.addBatch(query3);
            statement.addBatch(query4);
            statement.addBatch(query5);

            int[] recordInserted = statement.executeBatch();

            System.out.println("record inserted"+recordInserted.length);

        } catch (SQLException e) {
            System.out.println("Exception while connecting the server");
        }finally {
            connection.close();
        }
    }
}
