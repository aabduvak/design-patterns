package creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	private List<String> employees;
	
	public Employees() {
		this.employees = new ArrayList<>();
	}
	
	public Employees(List<String> employees) {
		this.employees = employees;
	}
	
	public void loadData() {
		//read all employees from database and put into the list
		employees.add("Aziz");
		employees.add("Ayşe");
		employees.add("Nurullah");
		employees.add("Muhammed");
	}
	
	public List<String> getEmployees() {
		return (this.employees);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<>();
		for (String emp : this.getEmployees()) {
			tmp.add(emp);
		}
		return (new Employees(tmp));
	}
}
