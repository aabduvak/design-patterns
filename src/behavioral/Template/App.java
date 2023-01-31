package behavioral.Template;

public class App {
	public static void main(String[] args) {
		Game footbal = new Football();
		footbal.play();
		
		Game tennis = new Tennis();
		tennis.play();
	}
}
