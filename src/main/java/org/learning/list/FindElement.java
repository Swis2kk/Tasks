package org.learning.list;

import java.util.List;

public class FindElement {

    public static <T> int length(List<T> elements) {
        if (elements == null) {
            throw new IllegalArgumentException("null not accepted");
        } else {
            return elements.size();
        }
    }
}
