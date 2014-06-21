package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static unit.LengthUnit.MILE;

public class MileTest {


    @Test
    public void should_3_mile_equal_3_mile() {
        assertThat(new Mile(3, MILE), is(new Mile(3, MILE)));
    }

    @Test
    public void should_3_mile_not_equal_4_miles() {
        assertThat(new Mile(3, MILE), not(new Mile(4, MILE)));
    }

    @Test
    public void should_3_mile_not_equal_2_mile() {
        assertThat(new Mile(3, MILE), not(new Mile(2, MILE)));
    }
}
