package bowlingGame;

public class Frame {

	static final int FULL_SCORE_FULL_A_FRAME = 10;
	private final int firstHit;
	private final int secondHit;
	private int totalScore = 0;
	private int awardHits = 0;

	public Frame(int firstHit, int secondHit) {
		this.firstHit = firstHit;
		this.secondHit = secondHit;
		awardHits = retrieveAwardHits();
		initializeTotalScore(firstHit, secondHit);
	}

	private int retrieveAwardHits() {
		if (firstHit == 10)
			return 2;
		if (firstHit + secondHit == FULL_SCORE_FULL_A_FRAME)
			return 1;
		return 0;
	}

	public Frame(Integer firstHit) {
		this.firstHit = firstHit;
		this.secondHit = 0;
		awardHits = retrieveAwardHits();
		initializeTotalScore(firstHit, secondHit);
	}

	public int getScore() {
		return awardHits == 0 ? totalScore : 0;
	}

	private void initializeTotalScore(int firstHit, int secondHit) {
		totalScore = firstHit + secondHit;
	}

	public void increaseScore(int hitNumber) {
		if (awardHits > 0) {
			totalScore += hitNumber;
			awardHits--;
		}
	}
}
