package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private int productPrice;

    public SimpleProduct(String productName, int productPrice) {
        super(productName);
        this.productPrice = productPrice;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
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
        return "Продукт " + productName + " стоит " + productPrice;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}




