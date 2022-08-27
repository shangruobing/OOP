package Experiment_3;

import java.sql.Date;

/**
 * @author 冰
 */
public class SaleItem14 {
    private String productName;
    private double price;
    private int quantity;
    private Date saleDay;

    /**
     *
     * @param productName 所销售的产品名称
     * @param price 产品价格
     * @param quantity 销售数量
     * @param saleDay 销售日期
     */
    public SaleItem14(String productName, double price, int quantity, Date saleDay) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.saleDay = saleDay;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getSaleDay() {
        return saleDay;
    }

    @Override
    public String toString() {
        return quantity + " " + productName + " sold in " + saleDay +
                "at the price of $ " + price + " each.";
    }

    public static void main(String[] args) {
        SaleItem14 Item14 = new SaleItem14("bread", 2, 10,
                new Date(121, 2, 25));
        System.out.println(Item14);
    }
}
