package com;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 冰
 */
@Entity
@Table(name = "tb_card")
@TableGenerator(name = "card_gen",
        table = "tb_generator",
        pkColumnName = "gen_name",
        valueColumnName = "gen_value",
        pkColumnValue = "CARD_PK",
        allocationSize = 1
)
@PersistenceContext(name = "cardPU")
public class CardEO14 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "card_gen")
    @Column(name = "id")
    private Integer id;
    @Column(name = "c_code")
    private String code;
    @Column(name = "c_balance")
    private BigDecimal balance;
    @Column(name = "c_state")
    private String state;

    public CardEO14() {
    }

    public CardEO14(String code, BigDecimal balance, String state) {
        this.code = code;
        this.balance = balance;
        this.state = state;
    }

    public boolean deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = balance.add(amount);
            return true;
        }
        return false;
    }

    public boolean pay(BigDecimal amount) {
        if ("available".equals(state.trim()) && balance.compareTo(amount) > 0) {
            this.balance = balance.subtract(amount);
            return true;
        }
        return false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CardEO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                ", state='" + state + '\'' +
                '}';
    }
}
