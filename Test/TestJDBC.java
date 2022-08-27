package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author 冰
 */
public class TestJDBC {
    public static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=person";
    public static final String userName = "sa";
    public static final String userPassword = "123456";

    public static void main(String[] args) {
        try {//加载驱动程序
            Class.forName(driverName);
            System.out.println("加载驱动成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("加载驱动失败！");
        }
        try {//获得数据库连接
            Connection dbConn = DriverManager.getConnection(dbURL, userName, userPassword);
            System.out.println("连接数据库成功！");
            //操作数据库
            Statement stmt = dbConn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println("name: "+rs.getString("name")+" ID: "+
                        rs.getInt("ID")+" age: "+rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("SQL Server连接失败！");
        }
    }
}