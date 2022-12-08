package creational.Prototype;

import java.util.List;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		
		List<String> list = empsNew.getEmployees();
		list.add("John");
		List<String> list1 = empsNew1.getEmployees();
		list1.remove("Aziz");
		
		System.out.println("emps List: "+emps.getEmployees());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
}
