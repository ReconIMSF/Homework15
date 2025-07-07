package org.skypro.skyshop.product;
import java.util.List;
import java.lang.String;

public class Product {
    private String productName;
    private int productPrice;

    public Product(String productName, int productPrice) { // конструктор для продуктов
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return productName + " : " +
               productPrice;
    }
}
