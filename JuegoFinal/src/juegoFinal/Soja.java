package juegoFinal;


public class Soja extends Plantas implements CrecerPlantas{

	private int cantidad; 
	
	public Soja() {
		precio=50;
		cantidad=10;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public void cultivar() {
			this.setCantidad(this.getCantidad()+5);
		}

	@Override
	public String toString() {
		return "Soja: cantidad = " + cantidad +", Precio = " + precio;
	}
		
	}


