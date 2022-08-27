package test;

import com.CardEO14;
import dao.CardDAO14;

import java.math.BigDecimal;

/**
 * @author 冰
 */
public class MainApp {
    public static void main(String[] args) {
        CardEO14 card= CardDAO14.findById(7);
        card.pay(BigDecimal.valueOf(8.30));
        CardDAO14.update(card);
        System.out.println("支付成功，余额为" + card.getBalance());

        card.setState("freeze");
        CardDAO14.update(card);
        System.out.println("支付失败 该卡已被"+card.getState());
    }
}
