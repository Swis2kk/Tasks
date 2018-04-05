package org.learning.dropNth;

import java.util.*;

public class Drop {

    public static <T> List<T> dropEveryNth(List<T> elements, int n) {
        Objects.requireNonNull(elements, "elements required not null");
        if (n > elements.size() || n < 1) {
            return elements;
        }
        List<T> list = new ArrayList<>();
        int count = 1;
        for (T t : elements) {
            if (count % n != 0) {
                list.add(t);
            }
            count++;
        }
        return list;
    }
}

