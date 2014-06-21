package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static unit.LengthFactory.*;

public class LengthTest {

    @Test
    public void should_3_mile_equal_3_mile() {
        assertThat(mile(3), is(mile(3)));
    }

    @Test
    public void should_3_mile_not_equal_4_miles() {
        assertThat(mile(3), not(mile(4)));
    }

    @Test
    public void should_3_mile_not_equal_2_mile() {
        assertThat(mile(3), not(mile(2)));
    }

    @Test
    public void should_3_yards_equal_3_yards() {
        assertThat(yard(3), is(yard(3)));
    }

    @Test
    public void should_3_yards_not_equal_4_yards() {
        assertThat(yard(3), not(yard(4)));
    }

    @Test
    public void should_3_yards_not_equal_2_yards() {
        assertThat(yard(3), not(yard(2)));
    }

    @Test
    public void should_1_mile_equal_1760_yards() {
        assertThat(mile(1), is(yard(1760)));
    }

    @Test
    public void should_1761_yards_not_equal_1_mile() {
        assertThat(yard(1761), not(mile(1)));
    }

    @Test
    public void should_1759_yards_not_equal_1_mile() {
        assertThat(yard(1759), not(mile(1)));
    }

    @Test
    public void should_2_feet_equal_2_feet() {
        assertThat(feet(2), is(feet(2)));
    }

    @Test
    public void should_3_feet_equals_1_yard() {
        assertThat(feet(3), is(yard(1)));
    }
}
