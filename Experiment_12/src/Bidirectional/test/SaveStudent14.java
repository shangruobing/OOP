package Bidirectional.test;

import Bidirectional.entity.StudentEO14;
import Bidirectional.dao.StudentDAO14;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 冰
 */
public class SaveStudent14 {
    public static void main(String[] args) throws ParseException {
        String[][] datas = {{"14", "尚若冰", "男", "2001-2-9"}, {"20", "岳姗", "女", "2000-12-19"},
                {"07", "李亮", "男", "2001-2-26"}, {"02", "吴翰芃", "男", "2001-3-17"}};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        StudentEO14 stu;
        for (String[] data : datas) {
            stu = new StudentEO14();
            stu.setCode(data[0]);
            stu.setName(data[1]);
            stu.setGender(data[2]);
            stu.setBirthday(sdf.parse(data[3]));
            StudentDAO14.save(stu);
        }
    }
}
