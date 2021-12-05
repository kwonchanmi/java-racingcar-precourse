package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rounds {
	private final List<Round> rounds;

	public Rounds() {
		rounds = new ArrayList<>();
	}

	public void add(Round round) {
		rounds.add(round);
	}

	public List<Round> getRoundResult() {
		return Collections.unmodifiableList(this.rounds);
	}

	public List<Result> getWinner() {
		return rounds.stream()
			.reduce((first, second) -> second)
			.get()
			.getWinners();
	}
}
