package org.learning.list;


import java.util.*;

public class ListSort {

    public static <T> List<List<T>> lsort(List<List<T>> input) {
        Objects.requireNonNull(input, "input required not null");
        Collections.sort(input, Comparator.comparingInt(List::size));
        return input;
    }

    public static <T> List<List<T>> lfsort(List<List<T>> input) {


        return null;
    }

    public static void main(String[] args) {
        System.out.print(lfsort(Arrays.asList(Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h"),
                Arrays.asList("d", "e"),
                Arrays.asList("i", "j", "k"),
                Arrays.asList("i", "j", "k", "k", "k"),
                Arrays.asList("m", "n"),
                Arrays.asList("m", "n"),
                Arrays.asList("o"))));
    }
}
