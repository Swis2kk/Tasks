package org.learning.list;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DropTest {

    @Test
    public void shouldDropEveryNthElementStream() throws Exception {
        List<String> result = Drop.streamDrop(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result).hasSize(8);
        assertThat(result).contains("a", "b", "d", "e", "g", "h", "j", "k");
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void streamMethodShouldThrowExceptionIfnSmallerOrEqulsToZero() throws Exception {
        expected.expect(IllegalArgumentException.class);
        List<String> result = Drop.streamDrop(Collections.emptyList(), 0);
    }

    @Test
    public void streamMethodShouldThrowExeptionIfListIsEmpty() throws Exception {
        expected.expect(IllegalArgumentException.class);
        List<String> result = Drop.streamDrop(Collections.emptyList(), 0);
    }
}
