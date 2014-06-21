package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static unit.VolumeFactory.*;

public class VolumeAddTest {

    @Test
    public void should_1_oz_add_1_oz_equal_2_oz() {
       assertThat(oz(1).add(oz(1)),is(oz(2)));
    }

    @Test
    public void should_1_tbsp_add_3_tsp_equal_2_tbsp() {
       assertThat(tbsp(1).add(tsp(3)),is(tbsp(2)));
    }

    @Test
    public void should_1_tsp_add_1_oz_equal_7_tsp() {
       assertThat(tsp(1).add(oz(1)),is(tsp(7)));
    }


}
