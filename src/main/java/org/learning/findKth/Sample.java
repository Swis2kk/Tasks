package org.learning.findKth;

import java.util.Comparator;
import java.util.List;

public class Sample {

    public static <T> T kth(List<T> elements, int k) {
        if (elements.size() >= 1) {
            elements.sort(Comparator.comparing(s -> s.hashCode()));
            int bigest = elements.get(elements.size()-1).hashCode();
            if (k > bigest) {
                throw new IllegalArgumentException("Incorrect entry in k");
            }
            return elements.get(k);
        } else {
            throw new IllegalArgumentException("Empty Entry");
        }
    }
}
