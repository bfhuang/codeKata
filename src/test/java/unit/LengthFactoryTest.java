package unit;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static unit.LengthFactory.feet;
import static unit.LengthFactory.mile;
import static unit.LengthFactory.yard;
import static unit.LengthUnit.FEET;
import static unit.LengthUnit.MILE;
import static unit.LengthUnit.YARD;

public class LengthFactoryTest {
    @Test
    public void should_create_mile_length() {
        assertThat(mile(1).getUnit(), is(MILE));
    }

    @Test
    public void should_create_yard_length() {
        assertThat(yard(1).getUnit(), is(YARD));
    }

    @Test
    public void should_create_feet_length() {
        assertThat(feet(1).getUnit(), is(FEET));
    }
}