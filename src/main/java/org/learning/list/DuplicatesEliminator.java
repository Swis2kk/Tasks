package org.learning.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DuplicatesEliminator {

    public static <T> List<T> compress(List<T> elements) {
        Objects.requireNonNull(elements, "null not accepted");
        if (elements.isEmpty()) {
            throw new IllegalArgumentException("Entry must not be empty");
        }

        List<T> list = new ArrayList<>();
        list.add(elements.get(0));
        for (int i = 1; i < elements.size(); i++) {
            if (!elements.get(i - 1).equals(elements.get(i))) {
                list.add(elements.get(i));
            }
        }
        return list;
    }
}
