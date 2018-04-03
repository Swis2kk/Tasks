package org.learning.findElement;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static <T> int length(List <T> elements) {
        if (elements == null) {
           throw new NullPointerException();
       } else {
           return elements.size();
       }
    }


    public static void main(String[] args) {

        System.out.println(new ArrayList<>().size());
    }
}
