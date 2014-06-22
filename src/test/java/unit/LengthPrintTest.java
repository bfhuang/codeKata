package unit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static unit.LengthFactory.yard;

public class LengthPrintTest {

    @Test
    public void should_print_to_base_when_strategy_is_print_to_base() {
        Length yard = yard(1);

        assertThat(yard.print(new PrintToBaseStrategy()), is("3 FEET"));
    }
}
