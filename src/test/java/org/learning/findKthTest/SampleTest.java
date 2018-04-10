package org.learning.findKthTest;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.learning.findKth.Sample;

import java.util.Arrays;
import java.util.List;

public class SampleTest {

    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(Sample.kth(numbers, 2), CoreMatchers.is(CoreMatchers.equalTo(3)));
    }
}
