package org.skypro.skyshop.utilities;

public class BestResultNotFound extends RuntimeException {

    private String search;

    public BestResultNotFound(String search) {
        super();
        this.search = search;
    }

    @Override
    public String toString() {
        return "Ошибка BestResultNotFound:" +
                " Поиск по критерию " + search + " не дал результатов!";
    }
}
