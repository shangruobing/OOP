package com;

import java.sql.*;

import static dao.StudentDAO14.getConnection;

/**
 * @author 冰
 */
public class JdbcUtils14 {
    public static void getAverageAge() throws SQLException {
        Connection conn = getConnection();
        PreparedStatement preStmt = conn.prepareStatement("SELECT AVG(YEAR(GETDATE())-YEAR(s_birthday)) FROM tb_student");
        ResultSet result = preStmt.executeQuery();
        while (result.next()) {
            int num = result.getInt(1);
            System.out.println("平均年龄：" + num + "岁");
        }
        preStmt.close();
        conn.close();
    }

    public static void getNumberOfMenAndWomen() throws SQLException {
        Connection conn = getConnection();
        PreparedStatement preStmt = conn.prepareStatement("SELECT s_gentle,count(*) FROM tb_student GROUP BY s_gentle");
        ResultSet result = preStmt.executeQuery();
        while (result.next()) {
            String res = result.getString(1);
            int num = result.getInt(2);
            System.out.println("\t" + res + "\t" + num + "人");
        }
        preStmt.close();
        conn.close();
    }
}
