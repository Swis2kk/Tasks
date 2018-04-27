package org.learning.list;

import java.util.AbstractMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Drop {

    public static <T> List<T> streamDrop(List<T> elements, int n) {
        Objects.requireNonNull(elements, "Elements required can not be null.");
        if (n > elements.size() || n <= 0) {
            throw new IllegalArgumentException("n entry can't be smaller ore == 0 or bigger them size of List.");
        }
        if (elements.size() == 0) {
            throw new IllegalArgumentException("List can not be empty.");
        }

        return IntStream.rangeClosed(0, elements.size() - 1)
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(elements.get(i), i))
                .filter(e -> (e.getValue() + 1) % n != 0)
                .map(AbstractMap.SimpleEntry::getKey)
                .collect(Collectors.toList());
    }
}

