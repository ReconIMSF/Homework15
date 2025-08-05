package org.skypro.skyshop.basket;
import java.util.Arrays;
import java.lang.String;

import org.skypro.skyshop.product.Product; // импорт из пакета товара

public class ProductBasket { // описание класса корзины для товара в магазине
    private final Product[] products; // корзина - массив без элементов
    private int size; // количество продуктов в корзине

    public ProductBasket(int basket) { // метод для объявления корзины
        products = new Product[basket];
        size = 0; // по умолчанию корзина пуста
    }

    public void addProduct(Product product) { // добавляем продукты в корзину
        if (size >= products.length) {
            System.out.println("Корзина заполнена, невозможно добавить продукт!");
        }
        products[size] = product;
        size++;
    }

    public int getTotalAmount() { // определяем стоимость товаров в корзине
        int amount = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                amount += products[i].getProductPrice();
            }
        }
        return amount;
    }

    public void printBasket() { // вывод информации о товарах в корзине
        int specialCount = 0;
        if (size == 0) {
            System.out.println("Корзина пуста!");
        }
        for (Product value : products) { // проверяем, есть ли в лотке в корзине товар
            if (value != null) {
                System.out.println(value.toString()); // если да - печатаем
            }
        }
        for (Product product : products) { // подсчёт специальных товаров
            if (product != null && product.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого стоимость корзины: " + getTotalAmount());
        System.out.println("Специальных товаров " + specialCount);
    }

    public boolean checkProduct(String productName) { // проверяем, есть ли в корзине определённый товар
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clearBusket() { // очищаем корзину
        Arrays.fill(products, null);
        size = 0;
    }
}
