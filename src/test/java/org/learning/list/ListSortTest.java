package org.learning.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ListSortTest {

    @Test
    public void shouldSortByElementLength() throws Exception {
        List<List<String>> input = Arrays.asList(Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h"),
                Arrays.asList("d", "e"),
                Arrays.asList("i", "j", "k"),
                Arrays.asList("m", "n"),
                Arrays.asList("o"));

        List<List<String>> result = ListSort.lsort(input);

        assertThat(result).isEqualTo(Arrays.asList(Arrays.asList("o"),
                Arrays.asList("d", "e"),
                Arrays.asList("d", "e"),
                Arrays.asList("m", "n"),
                Arrays.asList("a", "b", "c"),
                Arrays.asList("f", "g", "h"),
                Arrays.asList("i", "j", "k")));
    }

    @Test
    public void shouldSortByLengthFrequency() throws Exception {
        List<List<String>> input = Arrays.asList(Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e"),
                Arrays.asList("f", "g", "h"),
                Arrays.asList("d", "e"),
                Arrays.asList("i", "j", "k", "l"),
                Arrays.asList("m", "n"),
                Arrays.asList("o"));

        List<List<String>> result = ListSort.lfsort(input);

        assertThat(result).isEqualTo(Arrays.asList(Arrays.asList("i", "j", "k", "l"),
                Arrays.asList("o"),
                Arrays.asList("a", "b", "c"),
                Arrays.asList("f", "g", "h"),
                Arrays.asList("d", "e"),
                Arrays.asList("d", "e"),
                Arrays.asList("m", "n")));
    }
}
