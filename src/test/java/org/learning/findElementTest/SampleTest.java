package org.learning.findElementTest;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.learning.findElement.Sample;

import java.util.Arrays;
import java.util.Collections;

public class SampleTest {

    @Test
    public void listOfEmptyListShouldBe0() throws Exception {
        int length = Sample.length(Collections.emptyList());
        Assert.assertThat(length, CoreMatchers.is(CoreMatchers.equalTo(0)));
    }

    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        Assert.assertThat(Sample.length(Arrays.asList(1, 2, 3, 4, 5)), CoreMatchers.is(CoreMatchers.equalTo(5)));
    }


}
