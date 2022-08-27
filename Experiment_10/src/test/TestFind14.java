package test;

import com.CardEO14;
import dao.CardDAO14;

import java.util.ArrayList;

/**
 * @author 冰
 */
public class TestFind14 {
    public static void main(String[] args) {
        ArrayList<CardEO14> cardList = new ArrayList<>(CardDAO14.findAllCards());
        for (CardEO14 card : cardList) {
            System.out.println(card);
        }
    }
}

