package org.skypro.skyshop.utilities;

public interface Searchable {

    public String getName();
    public String getContentType();
    public String getSearchTerm ();
    public default String getStringRepresentation() {
        return getName() + " " + getContentType();
    }
}
