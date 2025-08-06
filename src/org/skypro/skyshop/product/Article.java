package org.skypro.skyshop.product;
import org.skypro.skyshop.utilities.Searchable;

public class Article implements Searchable {
    private final String articleName;
    private final String articleText;

    public Article(String articleName, String articleText) {
        this.articleName = articleName;
        this.articleText = articleText;
    }

    @Override
    public String toString() {
        return "Название статьи " + "\"" + articleName + "\"" + ", текст статьи " + "\"" + articleText + "\"";
    }

    @Override
    public String getName() {
        return articleName;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getSearchTerm() {
        return toString();
    }

    @Override
    public String getStringRepresentation() {
        return Searchable.super.getStringRepresentation();
    }
}
