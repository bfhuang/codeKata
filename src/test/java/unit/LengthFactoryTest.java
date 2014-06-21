package unit;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static unit.LengthFactory.*;
import static unit.LengthUnit.*;

public class LengthFactoryTest {
    @Test
    public void should_create_mile_length() {
        assertThat((LengthUnit)mile(1).getUnit(), is(MILE));
    }

    @Test
    public void should_create_yard_length() {
        assertThat((LengthUnit)yard(1).getUnit(), is(YARD));
    }

    @Test
    public void should_create_feet_length() {
        assertThat((LengthUnit)feet(1).getUnit(), is(FEET));
    }
}