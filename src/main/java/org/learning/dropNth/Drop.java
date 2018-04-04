package org.learning.dropNth;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Drop {

    public static <T> List<T> dropEveryNth (List<T> elements, int n) {
        IntStream.range(0, elements.size()).filter(value -> value % 3 == 0).mapToObj(()->elements.)
        return elements;
    }

    private static boolean isOdd() {

    }

    public static void main(String[] args) {
        dropEveryNth(new LinkedList<>(Arrays.asList(1,2,3)), 2);
    }
}