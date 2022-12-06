package jdbc;

import java.sql.*;

public class connection1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password ="Prem@2001";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String Query = "select * from language";
            ResultSet resultSet=statement.executeQuery(Query);

            while (resultSet.next()){
                System.out.println( resultSet.getInt(1)+" "+
                                    resultSet.getString(2)+" "+
                                    resultSet.getTimestamp(3)
                );
            }
            connection.close();

        }
        catch (SQLException e){
            System.out.println("Exception while connecting server");
    }
    }

}
