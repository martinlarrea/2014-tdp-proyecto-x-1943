package ar.edu.uns.cs.tdp.proyectoX.logica.balas;

import java.awt.Point;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;

public class BalaDiagonalIzq extends Bala {
	
	public BalaDiagonalIzq(SkyNet ia) {
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-bala1-izq.png")));
		this.setSize(32, 32);
		this.velocidad = 10;
		this.potencia = 100;
		this.vida = 100;
		this.movimiento = new Point(-1*velocidad,velocidad);
		this.lord = ia;	
	}
}
