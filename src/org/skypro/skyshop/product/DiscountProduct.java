package org.skypro.skyshop.product;

public class DiscountProduct extends Product {
    private int basePrice;
    private int discount;

    public DiscountProduct(String productName, int basePrice, int discount) {
        super(productName);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public int getProductPrice() {
        return (int) (basePrice * (1 - discount / 100.0));
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public String setProductName(String productName) {
        this.productName = productName;
        return productName;
    }

    @Override
    public String toString() {
        return "Продукт со скидкой " + productName +
                " стоит " + getProductPrice() + " (скидка " + discount + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
