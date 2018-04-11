package org.learning.list;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import java.util.Arrays;
import java.util.Collections;

public class FindElementTest {

    @Test
    public void listOfEmptyListShouldBe0() throws Exception {
        int length = FindElement.length(Collections.emptyList());
        Assert.assertThat(length, CoreMatchers.is(CoreMatchers.equalTo(0)));
    }

    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        Assert.assertThat(FindElement.length(Arrays.asList(1, 2, 3, 4, 5)), CoreMatchers.is(CoreMatchers.equalTo(5)));
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void whenNullLengthShouldThrowExeption() throws Exception {
        expected.expect(NullPointerException.class);
        expected.expectMessage("elements required not null");
        FindElement.length(null);
    }
}
