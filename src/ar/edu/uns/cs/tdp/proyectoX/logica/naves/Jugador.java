package ar.edu.uns.cs.tdp.proyectoX.logica.naves;

import java.awt.Point;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;

public class Jugador extends Nave {
	
	public Jugador (SkyNet ia) {
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-jugador.png")));
		this.setSize(56, 56);
		this.velocidad = 10;
		this.potencia = 100;
		this.vida = 100;
		this.movimiento = new Point(velocidad,0);
		this.lord = ia;	
	}

	@Override
	public void reLocation() {
		// TODO Auto-generated method stub
		
	}
}
