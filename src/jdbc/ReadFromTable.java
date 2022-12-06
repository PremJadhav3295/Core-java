package jdbc;

import java.sql.*;

public class ReadFromTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/csj25";
        String username = "root";
        String password = "Prem@2001";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            String query = "select * from student";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+
                        resultSet.getString(2)+" "+
                        resultSet.getInt(3)+" "+
                        resultSet.getString(4));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.println("Exception while connecting server");
        }
    }
}
