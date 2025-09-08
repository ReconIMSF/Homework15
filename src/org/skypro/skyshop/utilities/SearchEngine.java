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

    public Searchable[] searchString(String search) {
        int size = 0;
        Searchable[] result = new Searchable[1];
        for (Searchable searchable : searchables) {
            if (size < result.length) {
                String searchLine = searchable.getSearchTerm();
                int count = 0;
                int index = 0;
                int substingIndex = searchLine.indexOf(search, index);
                while (substingIndex != -1) {
                    count++;
                    index = substingIndex + search.length();
                    substingIndex = searchLine.indexOf(search, index);
                }
                if (count > 0) {
                    result[size] = searchable;
                    size++;
                } else if (count <= 0) {
                    throw new BestResultNotFound(search);
                } else {
                    System.out.println("Массив переполнен, невозможно добавить элемент.");
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}