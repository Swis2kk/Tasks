package org.learning.findLastSecondLast;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class Sample {


    public static String last (List<String> strings) {
        return strings.stream().min(Comparator.reverseOrder()).get();
    }

    public static int secondLast (List<Integer> numbers) {
        numbers.sort(Comparator.naturalOrder());
        return numbers.get(numbers.size() - 2);
    }
}
