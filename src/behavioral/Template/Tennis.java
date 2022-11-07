package behavioral.Template;

public class Tennis extends Game{

	@Override
	void initialize() {
		System.out.println("Tennis Game Initialized! Start playing.");
	}

	@Override
	void startGame() {
		System.out.println("Tennis Game Started. Enjoy the game!");
	}

	@Override
	void endGame() {
		System.out.println("Tennis game is finished");	
	}
}
