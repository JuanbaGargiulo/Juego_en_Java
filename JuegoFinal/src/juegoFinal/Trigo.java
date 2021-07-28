package juegoFinal;


public class Trigo extends Plantas implements CrecerPlantas{
	private int cantidad;

	public Trigo() {
		precio=25;
		cantidad=10;
	}
	

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public void cultivar() {	
			this.setCantidad(this.getCantidad()+10);
		}

	@Override
	public String toString() {
		return "Trigo: cantidad = " + cantidad +", Precio = " + precio;
	}

	
}


