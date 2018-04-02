package org.learning.findKth;

import java.util.List;

public class Sample {

    public static int kth (List<Integer> numbers, int k) {
        numbers.sort(Integer::compareTo);
        return numbers.get(k);
    }
}
