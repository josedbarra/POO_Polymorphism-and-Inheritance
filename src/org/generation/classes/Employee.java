package org.generation.classes;

	//propiedades 
public class Employee {
	
	protected String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationsDaysTaken;
	private double salary;
	private int yearsWorked;
	
	//constructor
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationsDaysTaken = vacationsDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}//constructor Employee

	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}//getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName

	public String getLastName() {
		return lastName;
	}//getLastName(

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName

	public int getRegistration() {
		return registration;
	}//getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	}//setRegistration

	public int getAge() {
		return age;
	}//getAge

	public void setAge(int age) {
		this.age = age;
	}//setAge

	public int getDaysWorked() {
		return daysWorked;
	}//getDaysWorked

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}//setDaysWorked

	public int getVacationsDaysTaken() {
		return vacationsDaysTaken;
	}//getVacationsDaysTaken

	public void setVacationsDaysTaken(int vacationsDaysTaken) {
		this.vacationsDaysTaken = vacationsDaysTaken;
	}//setVacationsDaysTaken

	public double getSalary() {
		return salary;
	}//getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	public int getYearsWorked() {
		return yearsWorked;
	}//getYearsWorked

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}//setYearsWorked
	
		//Methods
		public int timeToRetirement(){
			return Math.min(60 - this.age, 40 - this.yearsWorked);
		}//timeToRetirement

		public int vacationTimeLeft(){
			return (int)((this.daysWorked/360.0) * (30 -this.vacationsDaysTaken));
		}//vacationTimeLeft

		public double calculateBonus(){
			return 2.2 * this.salary;
		}//calculateBonus

	
	
	
	
	
		
		

}//Employee
