package org.skypro.skyshop.product;

import org.skypro.skyshop.utilities.Searchable;

public class SimpleProduct extends Product { // обычный товар наследует из класса товаров
    private int productPrice;
    private String name;

    public SimpleProduct(String productName, int productPrice) { // конструктор для обычного товара
        super(productName);
        if (productPrice <= 0) {
            throw new IllegalArgumentException("Цена товара не может быть меньше или равна нулю!");
        }
        this.productPrice = productPrice;
    }

    public int getProductPrice() { // геттер для цены обычного товара
        return productPrice;
    }

    public void setProductPrice(int productPrice) { // сеттер для цены обычного товара
        this.productPrice = productPrice;
    }

    @Override
    public String getProductName() { // геттер для названия обычного товара
        return productName;
    }

    @Override
    public String setProductName(String productName) { // сеттер для названия обычного товара
        this.productName = productName;
        return productName;
    }

    @Override
    public String toString() { // вывод информации для обычного товара
        return "Продукт " + productName + " стоит " + productPrice;
    }

    @Override
    public boolean isSpecial() { // отсутствие пометки "Специальный товар" для обычного товара
        return false;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getSearchTerm() {
        return productName + " " + getContentType();
    }

    @Override
    public String getStringRepresentation() {
        return super.getStringRepresentation();
    }
}




