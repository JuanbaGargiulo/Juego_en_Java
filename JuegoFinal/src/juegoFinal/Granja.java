package juegoFinal;

import java.util.ArrayList;
import java.util.Scanner;



public class Granja {
	
	private ArrayList<Vaca> vacas = new ArrayList<Vaca>(); 
	private ArrayList<Pollos> pollos = new ArrayList<Pollos>();
	private	ArrayList<Plantas> plantas = new ArrayList<Plantas>();
	private int moneda=50;
	private int CantLeche;
	private int CantHuevos;
	private int CantTrigo;
	private int CantSoja;
	
	
	public void cargarGranja() {
				
		Vaca v1 = new Vaca(500, "Marron", 100);
		Vaca v2 = new Vaca(500, "MarronyN", 100);
		Vaca v3 = new Vaca(500, "Naranja", 100);
		Vaca v4 = new Vaca(500, "Blanco", 100);
		Vaca v5 = new Vaca(500, "MarronyB", 100);
		
		vacas.add(v1);
		vacas.add(v2);
		vacas.add(v3);
		vacas.add(v4);
		vacas.add(v5);
		
		
		Pollos p1= new Pollos(50, "Blanco",30);
		Pollos p2= new Pollos(50, "Negro",30);
		Pollos p3= new Pollos(50, "BlancoyNA",30);
		Pollos p4= new Pollos(50, "BlancoyN",30);
		Pollos p5= new Pollos(50, "BlancoyR",30);
		
		pollos.add(p1);
		pollos.add(p2);
		pollos.add(p3);
		pollos.add(p4);
		pollos.add(p5);

		
		Trigo t1 = new Trigo();
		Soja s1 = new Soja();
		
		this.setCantTrigo(t1.getCantidad());
		this.setCantSoja(s1.getCantidad());
		
		
		plantas.add(t1);
		plantas.add(s1);
		
		
	}
	
	public int getCantTrigo() {
		return CantTrigo;
	}

	public void setCantTrigo(int cantTrigo) {
		CantTrigo = cantTrigo;
	}

	public int getCantSoja() {
		return CantSoja;
	}

	public void setCantSoja(int cantSoja) {
		CantSoja = cantSoja;
	}

	public int getCantLeche() {
		return CantLeche;
	}

	public void setCantLeche(int cantLeche) {
		CantLeche = cantLeche;
	}

	public int getCantHuevos() {
		return CantHuevos;
	}

	public void setCantHuevos(int cantHuevos) {
		CantHuevos = cantHuevos;
	}

	public int getMoneda() {
		return moneda;
	}
	
	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}

	public ArrayList<Vaca> getVacas() {
		return vacas;
	}
	
	public void setVacas(ArrayList<Vaca> vacas) {
		this.vacas = vacas;
	}

	public ArrayList<Pollos> getPollos() {
		return pollos;
	}

	public void setPollos(ArrayList<Pollos> pollos) {
		this.pollos = pollos;
	}

	public ArrayList<Plantas> getPlantas() {
		return plantas;
	}

	public void setPlantas(ArrayList<Plantas> plantas) {
		this.plantas = plantas;
	}
	
	@Override
	public String toString() {
		return "Tu Granja:"+"\n"+ "Vacas=" + vacas +"\n"+ "Pollos=" + pollos +"\n"+ "Plantas=" + plantas; 
	}
	
	Vaca b = new Vaca(0, null, 0);
	public void alimentarVacas() {
		b.comerVacas(vacas);
		this.CantLeche = b.getBaldeDLeche();
	}	
	
	Pollos p = new Pollos(0, null, 0);
	public void alimentarPollos() {
		p.comerPollos(pollos);
		this.CantHuevos=p.getHuevos();
	}
	
	Trigo t = new Trigo();
	public void plantarTrigo() {
		t.cultivar();
		this.setCantTrigo(t.getCantidad());
	}
	
	Soja g = new Soja();
	public void plantarSoja() {
		g.cultivar();
		this.setCantSoja(g.getCantidad());
	}
	
	
	public void venderHuevos() {
		this.setCantHuevos(this.getCantHuevos()-1);
		this.setMoneda(this.getMoneda()+10);
			}
		
	
	
	public void venderLeche() {
		this.setCantLeche(this.getCantLeche()-1);
		this.setMoneda(this.getMoneda()+30);
				}
				


			
	public void venderTrigo() {
		this.setCantTrigo(this.getCantTrigo()-1);
		this.setMoneda(this.getMoneda()+25);
				}
			

			
	public void venderSoja() {
		this.setCantSoja(this.getCantSoja()-1);
		this.setMoneda(this.getMoneda()+50);
		}
}
			
	
	
	
		

