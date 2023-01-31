package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component{
	private List<Component> team = new ArrayList<>();

	public void add(Component component) {
		this.team.add(component);
	}
	
	public void remove(Component component) {
		this.team.remove(component);
	}

	@Override
	public void deploy() {
		for (Component component : team) {
			component.deploy(); // call deploy function on all elements
		}
	}
}