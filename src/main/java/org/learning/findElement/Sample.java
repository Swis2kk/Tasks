package org.learning.findElement;

import java.util.List;

public class Sample {

    public static <T> int length(List <T> elements) {
        if (elements.size() <1) {
            return 0;
        } else {
            return elements.size();
        }
    }
}
