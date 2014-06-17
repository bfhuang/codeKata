package bowlingGame;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FrameTest {

	private Frame frame;

	@Test
	public void should_return_the_sum_of_two_hits() {
		frame = new Frame(3, 4);

		assertThat(frame.getScore(), is(7));
	}

}
