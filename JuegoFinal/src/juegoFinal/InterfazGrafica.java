package juegoFinal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfazGrafica extends JFrame {
	
	 public InterfazGrafica() {	
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Granja tomato");
	
		iniciarComponentes();
	}
	
		private void iniciarComponentes() {
			Granja g1 = new Granja();
			this.setLayout(new GridLayout(1,3));
		
			g1.setCantTrigo(10);
			g1.setCantSoja(5);
			JPanel panelC1 = new JPanel();
			JPanel panelC2 = new JPanel();
			
			panelC1.setLayout(new GridLayout(2,1));
			panelC2.setLayout(new GridLayout(2,1));
			JPanel panelV = new JPanel();
			JPanel panelT = new JPanel();
			JPanel panelP = new JPanel();
			JPanel panelS = new JPanel();
			
			
			panelC1.add(panelV);
			panelC1.add(panelT);
			panelC2.add(panelP);
			panelC2.add(panelS);
			
			JLabel etiqueta1 = new JLabel(new ImageIcon("vaca1.png"));
			panelV.add(etiqueta1, BorderLayout.CENTER);

			JPanel panelBotones = new JPanel();
			panelBotones.setLayout(new GridLayout(1,2));
			JButton bt1 = new JButton("Alimentar");
			JButton bt2 = new JButton("Vender leche");
			panelBotones.add(bt1);
			panelBotones.add(bt2);
			panelV.add(panelBotones,BorderLayout.SOUTH);
			
			JLabel etiqueta2 = new JLabel(new ImageIcon("trigo1.png"));
			panelT.add(etiqueta2, BorderLayout.CENTER);

			
			JPanel panelBotones1 = new JPanel();
			panelBotones1.setLayout(new GridLayout(1,2));
			JButton bt3 = new JButton("Cultivar");
			JButton bt4 = new JButton("Vender Trigo");
			panelBotones1.add(bt3);
			panelBotones1.add(bt4);
			panelT.add(panelBotones1,BorderLayout.SOUTH);
			
			JLabel etiqueta3 = new JLabel(new ImageIcon("pollo1.png"));
			panelP.add(etiqueta3, BorderLayout.CENTER);


			JPanel panelBotones2 = new JPanel();
			panelBotones2.setLayout(new GridLayout(1,2));
			JButton bt5 = new JButton("Alimentar");
			JButton bt6 = new JButton("Vender Huevos");
			panelBotones2.add(bt5);
			panelBotones2.add(bt6);
			panelP.add(panelBotones2,BorderLayout.SOUTH);
			
			
			JLabel etiqueta4 = new JLabel(new ImageIcon("soja.png"));
			panelS.add(etiqueta4, BorderLayout.CENTER);

			
			JPanel panelBotones3 = new JPanel();
			panelBotones3.setLayout(new GridLayout(1,2));
			JButton bt7 = new JButton("Cultivar");
			JButton bt8 = new JButton("Vender Soja");
			panelBotones3.add(bt7);
			panelBotones3.add(bt8);
			panelS.add(panelBotones3,BorderLayout.SOUTH);
			
			JPanel panelC3 = new JPanel();
			panelC3.setLayout(new GridLayout(2,1));
				
			JPanel panelI = new JPanel();
			panelI.setLayout(new GridLayout(6,1));
			JLabel inventario = new JLabel("Inventario: ");
			JLabel baldesdLeche = new JLabel("Cantidad de leche: "+g1.getCantLeche());
			JLabel huevos = new JLabel("Cantidad de Huevos: "+g1.getCantHuevos());
			JLabel trigo = new JLabel("Cantidad de Trigo: "+g1.getCantTrigo());
			JLabel soja = new JLabel("Cantidad de soja: "+g1.getCantSoja());
			JLabel monedas = new JLabel("Monedas: "+g1.getMoneda());
			JLabel lblResultado = new JLabel();
			
			panelI.add(inventario);
			panelI.add(baldesdLeche);
			panelI.add(huevos);
			panelI.add(trigo);
			panelI.add(soja);
			panelI.add(monedas);
			panelC3.add(panelI);
			panelC3.add(lblResultado);
			this.add(panelC1);
			this.add(panelC2);
			this.add(panelC3);
			
			
			//botones
			bt1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if (g1.getCantTrigo()<5) {
						lblResultado.setText("No puede alimentar a las vacas porque necesita 5 de trigo");
					}
					else {
						g1.alimentarVacas();
						lblResultado.setText("Se alimentaron todas las vacas");
						baldesdLeche.setText("Cantidad de leche: "+g1.getCantLeche());
						g1.setCantTrigo(g1.getCantTrigo()-5);
						trigo.setText("Cantidad de Trigo: "+g1.getCantTrigo());
					}
					
					
				}
			});
			
			bt2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(g1.getCantLeche()==0) {
						lblResultado.setText("No tiene leche en el inventario, alimente a las vacas");
					}
					else {
						g1.venderLeche();
						lblResultado.setText("Se vendio 1 balde de leche");
						baldesdLeche.setText("Cantidad de leche: "+g1.getCantLeche());
						monedas.setText("Monedas: "+g1.getMoneda());
					}
				}
			});
			
			bt3.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(g1.getCantTrigo()==0) {
						lblResultado.setText("Ya no puede cultivar mas trigo porque tiene 0 de trigo");
					}
					else {
					g1.plantarTrigo();
					lblResultado.setText("Se cultivo trigo");
					trigo.setText("Cantidad de Trigo: "+g1.getCantTrigo());
					}
				}
			});
			bt4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(g1.getCantTrigo()==0) {
						lblResultado.setText("No tiene trigo en el inventario");
					}
					else {
						g1.venderTrigo();
						lblResultado.setText("Se vendio 1 de Trigo");
						trigo.setText("Cantidad de Trigo: "+g1.getCantTrigo());
						monedas.setText("Monedas: "+g1.getMoneda());
					}
				}
			});
			bt5.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if (g1.getCantSoja()<5) {
						lblResultado.setText("No puede alimentar a los pollos porque necesita 5 de soja");
					}
					else {
						g1.alimentarPollos();
						lblResultado.setText("Se alimentaron todos los Pollos");
						g1.setCantSoja(g1.getCantSoja()-5);
						soja.setText("Cantidad de soja: "+g1.getCantSoja());
						huevos.setText("Cantidad de Huevos: "+g1.getCantHuevos());
					}
					}
			});
			
			bt6.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(g1.getCantHuevos()==0) {
						lblResultado.setText("No tiene huevos en el inventario, alimente a los Pollos");
					}
					else {
						g1.venderHuevos();
						lblResultado.setText("Se vendio 1 Huevo");
						huevos.setText("Cantidad de Huevos: "+g1.getCantHuevos());
						monedas.setText("Monedas: "+g1.getMoneda());
					}
				}
			});
			bt7.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(g1.getCantSoja()==0) {
						lblResultado.setText("Ya no puede cultivar mas soja porque tiene 0 de soja");
					}
					else {
						g1.plantarSoja();
						lblResultado.setText("Se cultivo Soja");
						soja.setText("Cantidad de soja: "+g1.getCantSoja());
					}
					
				}
			});
			bt8.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(g1.getCantSoja()==0) {
						lblResultado.setText("No tiene soja en el inventario");
					}
					else {
						g1.venderSoja();
						lblResultado.setText("Se vendio 1 de soja");
						soja.setText("Cantidad de soja: "+g1.getCantSoja());
						monedas.setText("Monedas: "+g1.getMoneda());
					}
				}
			});
			
			
	
			
			
			
			
			
			
			
			
		}

}
