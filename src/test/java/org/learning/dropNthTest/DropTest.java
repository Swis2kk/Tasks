package org.learning.dropNthTest;

import org.junit.Test;
import org.learning.dropNth.Drop;

import java.util.Arrays;
import java.util.List;

import static
        org.assertj.core.api.Assertions.assertThat;

public class DropTest {

    @Test
    public void shouldDropEveryNthElement() throws Exception {
        List<String> result = Drop.dropEveryNth(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result).hasSize(8);
        assertThat(result).contains("a", "b", "d", "e", "g", "h", "j", "k");
    }

    @Test
    public void shouldReturnSameListWhenNIsLargerThanListSize() throws Exception {
        List<String> result = Drop.dropEveryNth(Arrays.asList("a", "b"), 3);
        assertThat(result).hasSize(2);
        assertThat(result).contains("a", "b");
    }

    @Test
    public void shouldReturnSameListWhenNIsZero() throws Exception {
        List<String> result = Drop.dropEveryNth(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 0);
        assertThat(result).hasSize(11);
        assertThat(result).contains("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
    }


}
