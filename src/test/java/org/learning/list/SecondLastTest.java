package org.learning.list;

import org.junit.Assert;
import org.junit.Test;
import org.learning.list.SecondLast;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class SecondLastTest {

    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        Assert.assertThat(SecondLast.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
        Assert.assertThat(SecondLast.secondLast(numbers), is(equalTo(10)));
    }
}
