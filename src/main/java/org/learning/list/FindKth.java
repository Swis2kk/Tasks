package org.learning.list;

import java.util.List;
import java.util.Objects;

public class FindKth {

    public static <T> T kth(List<T> elements, int k) {
        Objects.requireNonNull(elements, "elements required not null");
        if (k <= elements.size()) {
            return elements.get(k);
        } else {
            throw new IllegalArgumentException("Wrong entry in k");
        }
    }
}
