package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordIntoTableDynamic1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the employee id and name");
            int employee_id = scanner.nextInt();
            String employee_name = scanner.next();

            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";
            connection = DriverManager.getConnection(url,username,password);
            String query ="insert into employee values(?,?)";
          //  PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?)");

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,employee_id);
            preparedStatement.setString(2,employee_name);
            preparedStatement.executeUpdate();

            System.out.println("records inserted "+preparedStatement);
        } catch (SQLException e) {
            System.out.println("Exception while connecting the databases");
        } finally {
            connection.close();
        }
    }
}
