package juegoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Pollos extends Animal implements ComerPollos{
	private int huevos=0;
	
	public Pollos(float peso, String color, int precio) {
		super(peso, color, precio);
	}
	
	public int getHuevos() {
		return huevos;
	}

	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}

	@Override
	public void comerPollos(ArrayList<Pollos> pollos) {
			int PolloLleno=30;
			if (PolloLleno-PolloLleno==0) {
				this.setHuevos(this.getHuevos()+5);
	}
	}

	@Override
	public String toString() {
		return "Pollos: Peso: "+peso+" "+"Color: "+color+" "+"Precio: "+" "+precio;
	}


	
	
	
}
