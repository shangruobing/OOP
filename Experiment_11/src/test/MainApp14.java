package test;

import com.ContactsEO14;
import com.StudentEO14;
import dao.ContactsDAO14;
import dao.StudentDAO14;

/**
 * @author 冰
 */
public class MainApp14 {
    public static void main(String[] args) {
        ContactsEO14 contacts;
        String[][] data = new String[][]{{"13577070376", "手机", "2"}, {"723636683", "QQ", "2"},
                {"3215873382", "QQ", "3"}};

        //存储信息
       /* for (String[] inf : data) {
            contacts = new ContactsEO14();
            contacts.setInformation(inf[0]);
            contacts.setType(inf[1]);
            ContactsDAO14.save(contacts);
        }*/

        // 打印信息
        StudentEO14 stu;
        stu = StudentDAO14.findById(3);
        System.out.println(stu.getName() + stu.getContacts());
        contacts = ContactsDAO14.findById(103);
        System.out.println(contacts.getStudent());
    }
}
