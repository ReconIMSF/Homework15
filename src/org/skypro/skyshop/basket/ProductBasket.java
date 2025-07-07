package org.skypro.skyshop.basket;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

import org.skypro.skyshop.product.Product; // импорт из пакета

public class ProductBasket {
    private final Product[] products;
    private int size; // количество продуктов в корзине

    public ProductBasket(int basket) {
        products = new Product[basket];
        size = 0;
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

    public void printBasket() {
        int specialCount = 0;
        if (size == 0) {
            System.out.println("Корзина пуста!");
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
        for (Product product : products) {
            if (product != null && product.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого стоимость корзины: " + getTotalAmount());
        System.out.println("Специальных товаров " + specialCount);
    }

    public boolean checkProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clearBusket() {
        Arrays.fill(products, null);
        size = 0;
    }
}
