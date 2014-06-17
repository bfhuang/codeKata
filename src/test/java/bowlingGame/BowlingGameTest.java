package bowlingGame;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BowlingGameTest {

	private BowlingGame game;

	@Test
	public void should_return_0_when_one_frame_is_not_finished() {
		game = new BowlingGame();
		game.hit(4);

		assertThat(game.getScore(), is(0));
	}

	@Test
	public void should_return_the__sum_when_frame_is_miss() {
		game = new BowlingGame();
		game.hit(3);
		game.hit(4);

		assertThat(game.getScore(), is(7));
	}

	@Test
	public void should_return_the__sum_when_the_two_frame_are_miss() {
		game = new BowlingGame();
		game.hit(4);
		game.hit(4);
		game.hit(4);
		game.hit(4);

		assertThat(game.getScore(), is(16));
	}

	@Test
	public void should_return_0_when_the_frame_is_spare() {
		game = new BowlingGame();
		game.hit(4);
		game.hit(6);

		assertThat(game.getScore(), is(0));
	}

	@Test
	public void should_return_10_and_the_next_hit_when_the_frame_is_spare_and_the_next_hit_is_less_than_10() {
		game = new BowlingGame();
		game.hit(4);
		game.hit(6);
		game.hit(3);

		assertThat(game.getScore(), is(13));
	}

	@Test
	public void should_return_0_when_the_frame_is_strike() {
		game = new BowlingGame();
		game.hit(10);

		assertThat(game.getScore(), is(0));
	}

	@Test
	public void should_return_0_when_the_frame_is_strike_and_just_one_next_hit() {
		game = new BowlingGame();
		game.hit(10);
		game.hit(3);

		assertThat(game.getScore(), is(0));
	}

	@Test
	public void should_return_10_and_next_two_hits_when_the_frame_is_strike_and_two_next_hit() {
		game = new BowlingGame();
		game.hit(10);
		game.hit(9);
		game.hit(1);

		assertThat(game.getScore(), is(20));
	}

	@Test
	public void should_return_18_when_creating_9_frames_with_each_hit_is_1() {
		game = new BowlingGame();
		create9FramesWithEachHitIs1AndTotalScoreIs18(game);

		assertThat(game.getScore(), is(18));
	}

	@Test
	public void should_award_0_time_when_the_last_is_miss() {
		game = new BowlingGame();
		create9FramesWithEachHitIs1AndTotalScoreIs18(game);
		game.hit(1);
		game.hit(1);

		assertThat(game.getScore(), is(20));
	}

	@Test
	public void should_award_1_time_when_the_last_is_spare() {
		game = new BowlingGame();
		create9FramesWithEachHitIs1AndTotalScoreIs18(game);
		game.hit(1);
		game.hit(9);
		game.hit(2);

		assertThat(game.getScore(), is(30));
	}


	@Test
	public void should_award_2_time_when_the_last_is_strike() {
		game = new BowlingGame();
		create9FramesWithEachHitIs1AndTotalScoreIs18(game);
		game.hit(10);
		game.hit(10);
		game.hit(1);

		assertThat(game.getScore(), is(39));
	}

	@Test
	public void should_return_300_score_when_the_game_finished_with_all_strike() {
		game = new BowlingGame();
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);
		game.hit(10);

		assertThat(game.getScore(), is(300));
	}

	private void create9FramesWithEachHitIs1AndTotalScoreIs18(BowlingGame game) {
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
		game.hit(1);
	}


}
