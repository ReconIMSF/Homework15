package org.skypro.skyshop.product;

public class DiscountProduct extends Product { // товар со скидкой наследует из класса товаров
    private int basePrice;
    private int discount;

    public DiscountProduct(String productName, int basePrice, int discount) { // конструктор для товара со скидкой
        super(productName);
        this.basePrice = basePrice; // базовая цена
        this.discount = discount; // размер скидки
    }

    public void setBasePrice(int basePrice) { // сеттер для базовой цены
        this.basePrice = basePrice;
    }

    public int getDiscount() { // геттер для размера скидки
        return discount;
    }

    public void setDiscount(int discount) { // сеттер для размера скидки
        this.discount = discount;
    }

    @Override
    public int getProductPrice() { // геттер для цены товара со скидкой
        return (int) (basePrice * (1 - discount / 100.0));
    }

    @Override
    public String getProductName() { // геттер для названия товара со скидкой
        return productName;
    }

    @Override
    public String setProductName(String productName) { // сеттер для названия товара со скидкой
        this.productName = productName;
        return productName;
    }

    @Override
    public String toString() { // вывод информации о товаре со скидкой
        return "Продукт со скидкой " + productName +
                " стоит " + getProductPrice() + " (скидка " + discount + "%)";
    }

    @Override
    public boolean isSpecial() { // пометка "Специальный товар" для товара со скидкой
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
