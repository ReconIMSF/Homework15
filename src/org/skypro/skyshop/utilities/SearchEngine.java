package org.skypro.skyshop.utilities;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> searchables = new ArrayList<>();
    // В случае, когда количество элементов неизвестно заранее, вместо массива лучше использовать коллекцию,
    // которая может динамически изменять свой размер. Например, можно использовать класс ArrayList, который
    // реализует интерфейс List и позволяет добавлять элементы без необходимости задавать фиксированную длину.

    public void add(Searchable searchTerm) {
        searchables.add(searchTerm);
    }

    public String[] search(String searchLine) {
        String[] results = new String[5];
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
        return results;
    }
}