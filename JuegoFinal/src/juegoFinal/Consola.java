package juegoFinal;

import java.util.Scanner;

public class Consola {

	public void ComenzaJuego () {
		Granja g1= new Granja();
		g1.cargarGranja();
		
		System.out.println("Bienvenidos a la granja Tomato, a continuacion le dejamos el intructivo del juego");
		System.out.println("1 para alimentar el ganado, 2 para cultivar, 3 para vender productos, 4 para abrir el inventario, 5 para cerrar el juego");
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		
		while (opcion != 5) {//MENU PRINCIPAL
			
			if(opcion==1) {
				System.out.println("¿A que animal desea alimentar?: ");
				System.out.println("1 para alimentar vacas, 2 para alimentar pollos, 3 para volver al inicio");
				int animal = teclado.nextInt();
				while (animal != 3) {
					if (animal==1) {
						System.out.println("Para alimentar a las vacas se necesita 5 de trigo");
						if (g1.getCantTrigo()<5) {
							System.out.println("No puede alimentar a las vacas porque necesita 5 de trigo");
						}
						else {
							g1.alimentarVacas();
							g1.setCantTrigo(g1.getCantTrigo()-5);
							System.out.println("La vaca esta llena");
							System.out.println("Como se les dio bien de comer a las vacas, produjeron 5 baldes de leche");
							System.out.println("La cantidad de leche ahora es: "+ g1.getCantLeche()+" y la cantidad de trigo es: "+g1.getCantTrigo());
						}
				}
					if (animal==2) {
						if (g1.getCantSoja()<5) {
							System.out.println("No puede alimentar a los pollos porque necesita 5 de soja");
						}
						else {
							g1.alimentarPollos();
							g1.setCantSoja(g1.getCantSoja()-5);
							System.out.println("El pollo esta lleno");
							System.out.println("Al alimentar bien los pollos, ellos produjeron 5 huevos");
							System.out.println("La cantidad de huevos ahora es: "+ g1.getCantHuevos()+" y la cantidad de soja es: "+g1.getCantSoja());
						}
				}
					System.out.println("1 para alimentar vacas, 2 para alimentar pollos, 3 para volver al inicio");
					animal = teclado.nextInt();
				}
				
			}
			
			if(opcion==2) {
				System.out.println("¿Que desea cultivar?");
				System.out.println("1 para cultivar trigo, 2 para cultivar soja, 3 para volver al inicio");
				int cultivo = teclado.nextInt();
				while (cultivo != 3) {
					if (cultivo==1) {
						if(g1.getCantTrigo()==0) {
							System.out.println("Ya no puede cultivar mas trigo porque tiene 0 de trigo");
						}
						else {
							g1.plantarTrigo();
							System.out.println("Trigo listo");
							System.out.println("La cantidad de trigo es: " + g1.getCantTrigo());
						}
					

				}
					if (cultivo==2) {
						if(g1.getCantSoja()==0) {
							System.out.println("Ya no puede cultivar mas soja porque tiene 0 de soja");
						}
						else {
							g1.plantarSoja();
							System.out.println("Soja listo");
							System.out.println("La cantidad de soja es: " + g1.getCantSoja());
						}
				}
					System.out.println("1 para cultivar trigo, 2 para cultivar soja, 3 para volver al inicio");
					cultivo = teclado.nextInt();
				}
				
			}
			
			if(opcion==3) {
				System.out.println("¿Que desea vender?");
				System.out.println("Lista de compra de productos: 1 Huevo = $10, 1 Balde de leche = $30, 1 de trigo = $25, 1 de soja = $50");
				System.out.println("1 para vender Huevos, 2 para vender Balde de Leche, 3 para vender trigo, 4 para vender soja, 5 para cerrar la tienda");
				Scanner teclado1 = new Scanner(System.in);
				int venta=teclado.nextInt();
				
				while (venta!=5) {
					
					if (venta==1) {	
						if(g1.getCantHuevos()==0) {
							System.out.println("No tiene huevos en el inventario, alimente a los pollos ");
						}
						else {
							g1.venderHuevos();
							System.out.println("Los huevos restantes en el inventario: "+g1.getCantHuevos()+ ", y el dinero actual: "+ g1.getMoneda());
						
						}
					}
					
					if (venta==2) {
						if(g1.getCantLeche()==0) {
							System.out.println("No tiene baldes en el inventario, alimente a las vacas ");
						}
						else {
							g1.venderLeche();
							System.out.println("La cantidad de leche restante es: "+g1.getCantLeche()+" y sus monedas son: "+g1.getMoneda());
						}
					}
				
					if (venta==3) {
						if(g1.getCantTrigo()==0) {
							System.out.println("No tiene trigo en el inventario");
						}
						else {
							g1.venderTrigo();
							System.out.println("La cantidad de trigo restante es: "+g1.getCantTrigo()+" y sus monedas son: "+g1.getMoneda());
						}
					}
				
					if (venta==4) {
						if(g1.getCantSoja()==0) {
							System.out.println("No tiene soja en el inventario");
						}
						else {
							g1.venderSoja();
							System.out.println("La soja restante en el inventario es: "+g1.getCantSoja()+ ", y el dinero actual: "+ g1.getMoneda());
						}
					}
				System.out.println("1 para vender Huevos, 2 para vender Balde de Leche, 3 para vender trigo, 4 para vender soja, 5 para cerrar la tienda");
				teclado1 = new Scanner(System.in);	
				venta=teclado.nextInt();

				}
				
			}

			if(opcion==4) {
				System.out.println("En su inventario tiene: ");
				System.out.println("\nHuevos:"+g1.getCantHuevos()+"\nBaldes de leche: "+g1.getCantLeche()+"\nTrigo: "+g1.getCantTrigo()+"\nSoja: "+g1.getCantSoja()+"\nMonedas: "+g1.getMoneda());
			}
			
			System.out.println("1 para alimentar el ganado, 2 para cultivar, 3 para vender productos, 4 para abrir el inventario, 5 para cerrar el juego");
			teclado = new Scanner(System.in);
			opcion = teclado.nextInt();
			}
			System.out.println("Se termino el juego");
	}
}

			
			
				
	


	

