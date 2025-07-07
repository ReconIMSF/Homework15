package org.skypro.skyshop.product;
import java.lang.String;

public abstract class Product {
    public boolean isSpecial;
    protected String productName;

    public Product(String productName) { // конструктор для продуктов
        this.productName = productName;
    }
    public abstract int getProductPrice();

    public abstract String getProductName();

    public abstract String setProductName(String productName);

    @Override
    public abstract String toString();

    public abstract boolean isSpecial();
}
