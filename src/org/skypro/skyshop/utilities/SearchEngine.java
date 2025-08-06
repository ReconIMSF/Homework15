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
            // Обработка ситуации, когда массив переполнен
            System.out.println("Массив переполнен, невозможно добавить элемент.");
        }
    }

    public void search(String searchLine) {
        String results[] = new String[5];
        int count = 0;
        for (Searchable searchable : searchables) {
            if (count == results.length) break;
            String searchTerm = searchable.getSearchTerm();
            if (searchTerm.contains(searchLine)) {
                results[count] = searchTerm;
                count++;
            }
        }
        System.out.println(Arrays.toString(results));
        return;
    }
}