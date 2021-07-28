package juegoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Vaca extends Animal implements ComerVacas{
	
	private int BaldeDLeche=0;

	public Vaca(float peso, String color, int precio) {
		super(peso, color, precio);
	}
	


	public int getBaldeDLeche() {
		return BaldeDLeche;
	}



	public void setBaldeDLeche(int baldeDLeche) {
		this.BaldeDLeche = baldeDLeche;
	}



	@Override
	public void comerVacas(ArrayList<Vaca> vacas) {	
		int VacaLlena=50;
		

		
		if (VacaLlena-VacaLlena==0) {
			this.setBaldeDLeche(this.getBaldeDLeche()+5);
			
			}
	}
		

	@Override
	public String toString() {
		return "Vaca: Peso: "+peso+" "+"Color: "+color+" "+"Precio: "+" "+precio;
	}


	
	
	

		
	}
	
	


