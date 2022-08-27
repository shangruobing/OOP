package test;

import com.CardEO14;
import dao.CardDAO14;

import java.math.BigDecimal;

/**
 * @author 冰
 */
public class TestSave {
    public static void main(String[] args) {
        String[][] datas = {{"14", "0", "available"}, {"20", "100", "freeze"}, {"07", "200", "unavailable"}};
        CardEO14 card;
        for (String[] data : datas) {
            card = new CardEO14();
            card.setCode(data[0]);
            card.setBalance(new BigDecimal(data[1]));
            card.setState(data[2]);
            CardDAO14.save(card);
        }
    }
}

