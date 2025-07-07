package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        ProductBasket productBasket = new ProductBasket(5); //объявляем первую корзину
        ProductBasket productBasket1 = new ProductBasket(5); // объявляем вторую корзину
        // Набиваем продукты для внесения в корзину
        Product apple = new SimpleProduct("Яблоко", 50);
        Product sushi = new SimpleProduct("Суши", 150);
        Product bread = new SimpleProduct("Хлеб", 75);
        Product zukkini = new SimpleProduct("Кабачок", 80);
        Product cola = new SimpleProduct("Кола", 110);
        Product mushrooms = new SimpleProduct("Грибы", 95);

        // заполняем корзину 1
        System.out.println("Корзина 1");
        productBasket.addProduct(apple);
        productBasket.addProduct(bread);
        productBasket.addProduct(cola);
        productBasket.addProduct(zukkini);
        productBasket.addProduct(mushrooms);
        // выводим содержимое и сумму корзины 1
        productBasket.printBasket();

        // заполняем корзину 2
        System.out.println("Корзина 2");
        productBasket1.addProduct(apple);
        productBasket1.addProduct(apple);
        productBasket1.addProduct(apple);
        productBasket1.addProduct(sushi);
        // выводим содержимое и сумму корзины 2
        productBasket1.printBasket();

        // проверяем методы по проверке содержимого в корзине
        System.out.println("Есть ли в корзине яблоко?" + productBasket1.checkProduct("Яблоко"));
        System.out.println("Есть ли в корзине кола?" + productBasket1.checkProduct("Кола"));

        // очищаем корзину
        productBasket1.clearBusket();
        System.out.println("Корзина 2");
        productBasket1.printBasket();
    }
}