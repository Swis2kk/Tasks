package org.learning.list;


import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListSort {

    public static <T> List<List<T>> lsort(List<List<T>> input) {
        Objects.requireNonNull(input, "input required not null");
        input.sort(Comparator.comparing(List::size));
        return input;
    }

    public static <T> List<List<T>> lfsort(List<List<T>> input) {
        Objects.requireNonNull(input, "input required not null");
        return input.stream()
                .collect(Collectors.groupingBy(List::size))
                .values()
                .stream()
                .sorted(Comparator.comparingInt(List::size))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
