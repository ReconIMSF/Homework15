package org.skypro.skyshop.product;

import org.skypro.skyshop.utilities.Searchable;

public class FixPriceProduct extends Product { // товар с фиксированной ценой наследует из класса товаров
    private final int PRODUCT_PRICE = 80; // установление фиксированной цены на товар

    public FixPriceProduct(String productName) { // конструктор для товара с фиксированной ценой
        super(productName);
    }

    @Override
    public int getProductPrice() { // геттер цены для товара с фиксированной ценой
        return PRODUCT_PRICE;
    }

    @Override
    public String getProductName() { // геттер названия для товара с фиксированной ценой
        return productName;
    }

    @Override
    public String setProductName(String productName) { // сеттер названия для товара с фиксированной ценой
        this.productName = productName;
        return productName;
    }

    @Override
    public String toString() { // метод для вывода информации о товаре с фиксированной ценой
        return "Продукт с фиксированной ценой " + productName + " стоит " + getProductPrice();
    }

    @Override
    public boolean isSpecial() { // пометка "Специальный товар" на товаре с фиксированной ценой
        return true;
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
