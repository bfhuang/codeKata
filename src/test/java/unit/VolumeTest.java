package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static unit.VolumeFactory.*;

public class VolumeTest {

    @Test
    public void should_1_tbsp_equal_1_tbsp() {
        assertThat(tbsp(1), is(tbsp(1)));
    }

    @Test
    public void should_1_tsp_equal_1_tsp() {
        assertThat(tsp(1), is(tsp(1)));
    }

    @Test
    public void should_1_oz_equal_1_oz() {
        assertThat(oz(1), is(oz(1)));
    }

    @Test
    public void should_1_oz_equal_2_tbsp() {
        assertThat(oz(1), is(tbsp(2)));
    }

    @Test
    public void should_1_tbsp_equal_3_tsp() {
        assertThat(tbsp(1), is(tsp(3)));
    }

    @Test
    public void should_6_tsp_equal_1_oz() {
        assertThat(tsp(6), is(oz(1)));
    }


}