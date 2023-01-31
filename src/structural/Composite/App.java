package structural.Composite;

public class App {
	public static void main(String[] args) {
		HumanResourses hr = new HumanResourses();
		Truck truck = new Truck();
		Team team = new Team();
		
		team.add(hr);
		team.add(truck);
		team.deploy();
	}
}
