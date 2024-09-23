package org.generation.classes;

public class SalesRep extends Employee {
		
	//Propiedades
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor SalesRep

	public double getSalesMade() {
		// TODO Auto-generated method stub
		return 0;
	}//getSalesMade
		
	

}//class SalesRep
