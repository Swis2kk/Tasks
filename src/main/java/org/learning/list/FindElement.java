package org.learning.list;

import java.util.List;
import java.util.Objects;

public class FindElement {

    public static <T> int length(List<T> elements) {
        Objects.requireNonNull(elements, "elements required not null");
            return elements.size();
    }
}
