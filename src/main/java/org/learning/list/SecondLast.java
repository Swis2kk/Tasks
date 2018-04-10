package org.learning.list;

import java.util.List;

public class SecondLast {

    public static <T> T last(List<T> elements) {
       if (elements.size() >= 1) {
           return elements.get(elements.size()-1);
       } else {
           throw new IllegalArgumentException("Empty Entry");
       }
    }

    public static <T> T secondLast(List<T> elements) {
        if (elements.size() >= 1) {
            return elements.get(elements.size()-2);
        } else {
            throw new IllegalArgumentException("Empty Entry");
        }
    }
}
