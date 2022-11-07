package behavioral.Template;

public class Football extends Game{

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startGame() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	void endGame() {
		System.out.println("Football Game Finished!");
	}
}