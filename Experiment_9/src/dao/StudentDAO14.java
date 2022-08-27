package dao;

import com.Student14;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 冰
 */
public class StudentDAO14 {
    public static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=study";
    public static final String userName = "ruobing";
    public static final String userPassword = "010209";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL, userName, userPassword);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void save(Student14 std) {
        Connection conn = getConnection();
        PreparedStatement preStmt;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            preStmt = conn.prepareStatement("INSERT INTO tb_student(s_code,s_name,s_gentle,s_birthday)values(?,?,?,?)");
            preStmt.setString(1, std.getCode());
            preStmt.setString(2, std.getName());
            preStmt.setString(3, std.getGentle());
            preStmt.setString(4, sdf.format(std.getBirthday()));
            preStmt.executeUpdate();
            preStmt.close();
            System.out.println("insert into OK!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student14> findAllStudent() {
        Connection conn = getConnection();
        ArrayList<Student14> students = new ArrayList<>();
        try {
            PreparedStatement preStmt = conn.prepareStatement("SELECT * FROM tb_student");
            ResultSet rs = preStmt.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Student14 std;
            while (rs.next()) {
                std = new Student14();
                std.setId(Integer.parseInt(rs.getString(1)));
                std.setCode(rs.getString(2));
                std.setName(rs.getString(3));
                std.setGentle(rs.getString(4));
                std.setBirthday(sdf.parse(rs.getString(5)));
                students.add(std);
                //System.out.println(std);
            }
            preStmt.close();
            conn.close();
        } catch (SQLException | ParseException ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void delete(String name) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement preStmt = conn.prepareStatement("DELETE FROM tb_student WHERE s_name = ?");
        preStmt.setString(1, name);
        preStmt.executeUpdate();
        preStmt.close();
        conn.close();
        System.out.println("Delete OK!");
    }

    public static void update(String name, String code) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement preStmt = conn.prepareStatement("UPDATE tb_student SET s_code = ? WHERE s_name = ?");
        preStmt.setString(1, code);
        preStmt.setString(2, name);
        preStmt.executeUpdate();
        preStmt.close();
        conn.close();
        System.out.println("Update OK!");
    }

}
