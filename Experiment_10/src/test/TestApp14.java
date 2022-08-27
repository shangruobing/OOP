package test;

import com.CardEO14;
import dao.CardDAO14;

import java.math.BigDecimal;

/**
 * @author 冰
 */
public class TestApp14 {
    public static void main(String[] args) {
        CardEO14 card = CardDAO14.findById(2);
        card.setBalance(BigDecimal.valueOf(0));
        card.deposit(BigDecimal.valueOf(100.00));
        System.out.println("充值成功，余额为" + card.getBalance());
        CardDAO14.update(card);
        card.pay(BigDecimal.valueOf(8.30));
        CardDAO14.update(card);
        System.out.println("支付成功，余额为" + card.getBalance());
    }
}

