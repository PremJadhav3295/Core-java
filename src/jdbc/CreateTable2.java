package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/csj25";
            String username = "root";
            String password = "Prem@2001";
            connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            boolean isTableCreated = statement.execute("create table student(student_id int, student_name varchar(50),\t" +
                     "student_age int,student_skill varchar(50))");
            System.out.println("table crated"+isTableCreated);
        } catch (SQLException e) {
            System.out.println("Exception while connecting to database");
        }finally {
            connection.close();
        }

    }
}
