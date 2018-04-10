package org.learning.list;

import java.util.List;

public class FindKth {

    public static <T> T kth(List<T> elements, int k) {
        if (elements == null) {
            throw new IllegalArgumentException("Entry can't be null");
        } else {
            if (k <= elements.size()) {
                return elements.get(k);
            } else {
                throw new IllegalArgumentException("Wrong entry in k");
            }
        }
    }
}
