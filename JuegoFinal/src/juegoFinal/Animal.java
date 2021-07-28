package juegoFinal;


public abstract class Animal {

	protected float peso;
	protected String color;
	protected int precio;
	
	
	public Animal(float peso, String color, int precio) {
		this.peso = peso;
		this.color = color;
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	


}
	
	
	

