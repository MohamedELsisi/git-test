package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Run {
    public static void main(String[] args) {
        Connection connection;
        PreparedStatement pre;



        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social", "root", "root");
            pre=connection.prepareStatement("insert into user (name,age,email,password,phone,address) values (?,?,?,?,?,?);");
            pre.setString(1, "EEEEE");
            pre.setInt(2, 20);
            pre.setString(3,"Egypt-Maadi");
            pre.setString(4, "hey");
            pre.setString(5, "010468");
            pre.setString(6, "tanta");

            pre.executeUpdate();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.printf("Done"); // return connection;

    }
}
