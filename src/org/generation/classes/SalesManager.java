package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	
	//Propiedades
	private HashMap <Integer, SalesRep> salesTeam;
	
	//Constructor
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked, salesMade);
	}// constructor SalesManager
	
	//Methods
	public void addSalesRep(int id,SalesRep salesRep) {
		this.salesTeam.put(id, salesRep);
	}//addSalesRep
	
	public double calculateSalesMadeTeam() {
		double totalSales = 0;
			for (SalesRep rep : salesTeam.values()) {
				totalSales += rep.getSalesMade();
			}//for
		return totalSales;
	}//calculateSalesMadeTeam
	

	public double calculateComission(){
	      double salesMadeTeam =calculateSalesMadeTeam();
	      
	   return 0.03 * salesMadeTeam; //Aqui no debe regresar el 3% de la venta del equipo
	   }//constructor







}//class SalesMannager
