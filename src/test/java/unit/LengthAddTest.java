package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static unit.LengthFactory.*;


public class LengthAddTest {
    @Test
    public void should_1_mile_add_1_mile_equals_2_mile() {
        assertThat(mile(1).add(mile(1)), is(mile(2)));
    }

    @Test
    public void should_1_yard_add_1_yard_equal_2_yard() {
        assertThat(yard(1).add(yard(1)), is(yard(2)));
    }

    @Test
    public void should_1_yard_add_1_mile_equal_1761_yard() {
        assertThat(yard(1).add(mile(1)), is(yard(1761)));
    }

    @Test
    public void should_1_mile_add_1760_yard_equal_2_mile() {
        assertThat(mile(1).add(yard(1760)), is(mile(2)));
    }

    @Test
    public void should_1760_yard_add_1760_yard_equal_2_mile() {
        assertThat(yard(1760).add(yard(1760)), is(mile(2)));
    }

    @Test
    public void should_4_feet_add__1_yard_equal_7_feet() {
        assertThat(feet(4).add(yard(1)), is(feet(7)));
    }


}
