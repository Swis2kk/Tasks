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
        assertThat(result).hasSize(5);
        assertThat(result).contains("a", "b", "d", "e", "g", "h", "j", "k");
    }
}
