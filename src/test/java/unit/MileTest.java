package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class MileTest {


    @Test
    public void should_3_mile_equals_3_mile() {
        assertThat(new Mile(3), is(new Mile(3)));
    }

    @Test
    public void should_3_mile_not_equals_4_miles() {
        assertThat(new Mile(3), not(new Mile(4)));
    }



}
