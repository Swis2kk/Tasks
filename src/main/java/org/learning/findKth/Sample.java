package org.learning.findKth;

import java.util.List;

public class Sample {

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
