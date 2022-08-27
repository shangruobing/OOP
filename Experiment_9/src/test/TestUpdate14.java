package test;

import dao.StudentDAO14;

/**
 * @author 冰
 */
public class TestUpdate14 {
    public static void main(String[] args) {
        try {
            StudentDAO14.update("张三", "201910901101");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
