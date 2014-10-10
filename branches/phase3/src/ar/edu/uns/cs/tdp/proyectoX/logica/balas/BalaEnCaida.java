package ar.edu.uns.cs.tdp.proyectoX.logica.balas;

import java.awt.Point;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;

public class BalaEnCaida extends Bala {
	
	
	public BalaEnCaida(SkyNet ia) {
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-rocket1.png")));
		this.setSize(16, 16);
		this.velocidad = 20;
		this.potencia = 100;
		this.vida = 100;
		this.movimiento = new Point(0,velocidad);
		this.lord = ia;		
	}
}
