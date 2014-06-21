package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MileTest {

    private Mile mile;

    @Test
    public void should_3_mile_equals_3_mile() {
        mile = new Mile(3);

        assertThat(mile, is(new Mile(3)));
    }



}
