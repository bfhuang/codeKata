package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static unit.LengthUnit.FEET;
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

    @Test
    public void should_1_mile_equal_1760_yards() {
        assertThat(new Length(1, MILE), is(new Length(1760,YARD)));
    }

    @Test
    public void should_1761_yards_not_equal_1_mile() {
        assertThat(new Length(1761, YARD), not(new Length(1, MILE)));
    }

    @Test
    public void should_1759_yards_not_equal_1_mile() {
        assertThat(new Length(1759, YARD), not(new Length(1, MILE)));
    }

    @Test
    public void should_2_feet_equal_2_feet() {
        assertThat(new Length(2, FEET), is(new Length(2, FEET)));
    }

    @Test
    public void should_3_feet_equals_1_yard() {
        assertThat(new Length(3,FEET), is(new Length(1, YARD)));
    }
}
