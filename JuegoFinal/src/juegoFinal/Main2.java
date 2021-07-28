package juegoFinal;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("¿Por que medio desea abrir el juego?");
		System.out.println("1 = consola, 2 = interfaz grafica");
		Scanner rta = new Scanner(System.in);
		int eleccion = rta.nextInt();
		if (eleccion==1) {
			Consola c1 = new Consola();
			c1.ComenzaJuego();
		}
		if (eleccion==2) {
			InterfazGrafica i1 = new InterfazGrafica();
			i1.setVisible(true);
		
		}
		
		
		
	
		
		
	}
}