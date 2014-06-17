package bowlingGame;

import java.util.ArrayList;
import java.util.List;

import static bowlingGame.Frame.FULL_SCORE_FULL_A_FRAME;

public class BowlingGame {

	List<Integer> hits = new ArrayList<Integer>();
	List<Frame> frames = new ArrayList<Frame>();
	int score = 0;

	public void hit(int hitNumber) {
		hits.add(hitNumber);
		updatePreviousTwoFrames(hitNumber);
		generateFrame();
	}

	private void updatePreviousTwoFrames(int hitNumber) {
		if (frames.size() >= 1 && frames.get(frames.size() - 1) != null) {
			frames.get(frames.size() - 1).increaseScore(hitNumber);
		}
		if (frames.size() >= 2 && frames.get(frames.size() - 2) != null) {
			frames.get(frames.size() - 2).increaseScore(hitNumber);
		}
	}

	private void generateFrame() {
		if (frames.size() < 10) {
			if (hits.get(0) == FULL_SCORE_FULL_A_FRAME) {
				frames.add(new Frame(hits.remove(0)));
			}
			if (hits.size() == 2) {
				frames.add(new Frame(hits.remove(0), hits.remove(0)));
			}
		}
	}

	public Integer getScore() {
		for (Frame frame : frames) {
			score += frame.getScore();
		}
		return score;
	}
}
