package test;

import dao.StudentDAO14;

/**
 * @author 冰
 */
public class TestJDBCDelete14 {
    public static void main(String[] args) {
        try {
            StudentDAO14.delete("王五");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
