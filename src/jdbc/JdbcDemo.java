package jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String userName = "root";
        String pass = "Zsgs@2025";

        String str = """
                    Create table Employee (
                    empid int,
                    empname varchar(30),
                    empage int );
                    """;
        String use = "Use testdb";
        String st2 = "Desc Employee;";
        String str1 = "Create database if not exists testdb";
        System.out.println(tableView(url,userName,pass,st2));
//        System.out.println(execute(url,userName,pass,use));

    }
    static String tableView(String url, String user, String pass, String st) {
        try ( Connection conn = DriverManager.getConnection(url,user,pass);
              Statement stmt = conn.createStatement() ) {
//            stmt.executeUpdate(use);
            ResultSet res = stmt.executeQuery(st);
            while (res.next()) {
                return res.getString(2);
            }
            return "";
        }
        catch (SQLException e) {
            return e+"";
        }
    }
    static String execute(String url, String user, String pass, String st) {
        try ( Connection conn = DriverManager.getConnection(url,user,pass);
              Statement stmt = conn.createStatement() ) {
                stmt.executeUpdate(st);
            return "Query executed Successfully";
        }
        catch (SQLException e) {
            e.printStackTrace();
            return e + "";
        }
    }
}
