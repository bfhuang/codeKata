package unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static unit.VolumeUnit.*;

public class VolumeFactoryTest {

    @Test
    public void should_create_oz() {
        assertThat((VolumeUnit) VolumeFactory.oz(1).getUnit(), is(OZ));
    }

    @Test
    public void should_create_tbsp() {
        assertThat((VolumeUnit) VolumeFactory.tbsp(1).getUnit(), is(TBSP));
    }

    @Test
    public void should_create_tsp() {
        assertThat((VolumeUnit) VolumeFactory.tsp(1).getUnit(), is(TSP));
    }

}