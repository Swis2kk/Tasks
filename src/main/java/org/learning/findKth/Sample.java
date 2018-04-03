package org.learning.findKth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample {

    public static <T> T kth(List<T> elements, int k) {
        if (elements.size() >= k) {
            elements.sort(Comparator.comparing(s -> s.hashCode()));
            return elements.get(k);
        } else {
            throw new IllegalArgumentException("Empty Entry");
        }
    }
}
