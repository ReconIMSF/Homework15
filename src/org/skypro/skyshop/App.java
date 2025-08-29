package org.skypro.skyshop;

import org.skypro.skyshop.product.DiscountProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.utilities.BestResultNotFound;
import org.skypro.skyshop.utilities.SearchEngine;
import org.skypro.skyshop.product.Article;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        ProductBasket productBasket = new ProductBasket(5); //объявляем первую корзину
        ProductBasket productBasket1 = new ProductBasket(5); // объявляем вторую корзину
        // Набиваем продукты для внесения в корзину

        System.out.println("Ввод данных о продуктах и статьях.");
        Product apple = new SimpleProduct("Яблоко", 50);
        Product sushi = new SimpleProduct("Суши", 150);
        Product bread = new SimpleProduct("Хлеб", 75);
        Product zukkini = new SimpleProduct("Кабачок", 80);
        Product cola = new SimpleProduct("Кола", 110);
        Product mushrooms = new SimpleProduct("Грибы", 95);
        Product pepsi = new DiscountProduct("Пепси", 70, 5);
        Product porridge = new FixPriceProduct("Каша");
        Article porridgeArt = new Article("Каша", "Каша овсяная, вкусная и полезная");
        Article breadArt = new Article("Хлеб", "Хлеб, он всему голова, пшеничный, первый сорт");
        try {
            DiscountProduct veal = new DiscountProduct("Телятина", 140, 800);
            SimpleProduct chicken = new SimpleProduct("Курица", 0);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка ввода информации! Проверьте базу данных!");
            e.printStackTrace();
        } finally {
            System.out.println("Ввод данных завершен.");
        }



        // Объявляем поисковой движок и набиваем в него поисковые фразы
        SearchEngine searchEngine = new SearchEngine(10);
        searchEngine.add(apple);
        searchEngine.add(sushi);
        searchEngine.add(bread);
        searchEngine.add(zukkini);
        searchEngine.add(cola);
        searchEngine.add(mushrooms);
        searchEngine.add(pepsi);
        searchEngine.add(porridge);
        searchEngine.add(porridgeArt);
        searchEngine.add(breadArt);



        System.out.println("Цена продукта " + pepsi.getProductName() + " " + pepsi.getProductPrice());

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
        productBasket1.addProduct(sushi);
        productBasket1.addProduct(pepsi);
        productBasket1.addProduct(porridge);
        // выводим содержимое и сумму корзины 2
        productBasket1.printBasket();

        // проверяем методы по проверке содержимого в корзине
        System.out.println("Есть ли в корзине яблоко?" + productBasket1.checkProduct("Яблоко"));
        System.out.println("Есть ли в корзине кола?" + productBasket1.checkProduct("Кола"));

        // очищаем корзину
        productBasket1.clearBusket();
        System.out.println("Корзина 2");
        productBasket1.printBasket();

        // проводим поиск, выводим результат
        searchEngine.search("Хлеб");
        searchEngine.search("Пепси");
        searchEngine.search("Каша");
        try {
            searchEngine.searchString("Яблоко");
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }
        try {
            searchEngine.searchString("Ядро");
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }
    }
}