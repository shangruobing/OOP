package test;

import com.CardEO14;
import dao.CardDAO14;

/**
 * @author 冰
 */
public class TestDelete14 {
    public static void main(String[] args) {
        CardEO14 card = CardDAO14.findById(5);
        CardDAO14.delete(card);
    }
}
