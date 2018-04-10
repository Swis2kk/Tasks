package org.learning.list;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DuplicatesEliminatorTest {

    @Test
    public void shouldRemoveConsecutiveDuplicatesInAList() throws Exception {
        List<String> compressedList = DuplicatesEliminator.compress(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e"));
        assertThat(compressedList).hasSize(5);
        assertThat(compressedList).contains("a", "b", "c", "d", "e");
    }

    @Test
    public void shouldNotRemoveNonConsecutiveSimilarElementsFromAList() throws Exception {
        List<String> compressedList = DuplicatesEliminator.compress(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(compressedList).hasSize(6);
        assertThat(compressedList).contains("a", "b", "c", "a", "d", "e");
    }
}