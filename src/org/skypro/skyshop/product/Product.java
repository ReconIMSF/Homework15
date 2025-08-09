package org.skypro.skyshop.product;
import org.skypro.skyshop.utilities.Searchable;

import java.lang.String;

public abstract class Product implements Searchable { // абстрактный класс для товаров
    public boolean isSpecial;
    protected String productName;

    public Product(String productName) { // конструктор для товаров
        this.productName = productName;
    }

    public abstract int getProductPrice(); // геттер для цены товара

    public abstract String getProductName(); // геттер для названия товара

    public abstract String setProductName(String productName); // сеттер для цены товара

    @Override
    public abstract String toString(); // метод для вывода информации о товаре

    public abstract boolean isSpecial(); // метод для указания на специальный товар
}

