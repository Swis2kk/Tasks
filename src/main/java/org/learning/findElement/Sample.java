package org.learning.findElement;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static <T> int length(List <T> elements) {
        if (elements == null) {
           throw new IllegalArgumentException("null not accepted");
       } else {
           return elements.size();
       }
    }
}
