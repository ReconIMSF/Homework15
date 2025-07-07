package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private final int PRODUCT_PRICE = 80;

    public FixPriceProduct(String productName) {
        super(productName);
    }

    @Override
    public int getProductPrice() {
        return PRODUCT_PRICE;
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
        return "Продукт с фиксированной ценой " + productName + " стоит " + getProductPrice();
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
