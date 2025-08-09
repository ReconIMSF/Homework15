package org.skypro.skyshop.utilities;
import java.lang.String;
import java.util.Arrays;

public class SearchEngine {
    private final Searchable[] searchables;
    private int size = 0;

    public SearchEngine(int capacity) {
        searchables = new Searchable[capacity];
    }

    public void add(Searchable searchTerm) {
        if (size < searchables.length) {
            searchables[size] = searchTerm;
            size++;
        } else {
            System.out.println("Массив переполнен, невозможно добавить элемент.");
        }
    }

    public Searchable[] search(String searchLine) {
        int count = 0;
        Searchable[] results = new Searchable[5];
        for (Searchable searchable : searchables) {
            if (count < results.length) {
                String searchTerm = searchable.getSearchTerm();
                if (searchTerm.contains(searchLine)) {
                    results[count] = searchable;
                    count++;
                }
            } else {
                System.out.println("Массив переполнен, невозможно добавить элемент.");
            }
        }
        return results;
    }
}