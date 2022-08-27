package test;

import com.CardEO14;
import dao.CardDAO14;

/**
 * @author 冰
 */
public class TestUpdate14 {
    public static void main(String[] args) {
        CardEO14 card = CardDAO14.findById(10);
        card.setCode("20");
        CardDAO14.update(card);
    }
}
