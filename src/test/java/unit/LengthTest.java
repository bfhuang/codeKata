package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static unit.LengthUnit.MILE;
import static unit.LengthUnit.YARD;

public class LengthTest {


    @Test
    public void should_3_mile_equal_3_mile() {
        assertThat(new Length(3, MILE), is(new Length(3, MILE)));
    }

    @Test
    public void should_3_mile_not_equal_4_miles() {
        assertThat(new Length(3, MILE), not(new Length(4, MILE)));
    }

    @Test
    public void should_3_mile_not_equal_2_mile() {
        assertThat(new Length(3, MILE), not(new Length(2, MILE)));
    }

    @Test
    public void should_3_yards_equal_3_yards() {
        assertThat(new Length(3, YARD), is(new Length(3, YARD)));
    }

    @Test
    public void should_3_yards_not_equal_4_yards() {
        assertThat(new Length(3, YARD), not(new Length(4, YARD)));
    }

    @Test
    public void should_3_yards_not_equal_2_yards() {
        assertThat(new Length(3, YARD), not(new Length(2, YARD)));
    }
}
