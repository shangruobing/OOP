package test;

import dao.StudentDAO14;

/**
 * @author 冰
 */
public class TestJDBCFind14 {
    public static void main(String[] args) {
        try {
            StudentDAO14.findAllStudent();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
