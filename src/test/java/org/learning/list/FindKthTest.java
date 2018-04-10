package org.learning.list;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindKthTest {

    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(org.learning.list.FindKth.kth(numbers, 2), CoreMatchers.is(CoreMatchers.equalTo(3)));
    }
}
