package ar.edu.uns.cs.tdp.proyectoX.logica.naves;

import java.awt.Point;
import java.util.Random;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.BalaEnCaida;

public class Enemiga extends Nave {
	
	protected int frecuencia;
	
	public Enemiga (SkyNet ia) {
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-premio.png")));
		this.setSize(56, 50);
		this.velocidad = 5;
		this.potencia = 100;
		this.vida = 100;
		this.movimiento = new Point(0,velocidad);
		this.lord = ia;	
		this.frecuencia = 5;
	}
	
	public void disparar() {
		Random rn = new Random(System.currentTimeMillis());
		if( rn.nextInt(this.frecuencia) == 0 ) {
			BalaEnCaida bec = new BalaEnCaida(this.lord);			
			int nx = this.getLocation().x + ((this.getWidth() - bec.getWidth())/2);
			int ny = this.getLocation().y + ((this.getHeight() - bec.getHeight())/2);
			bec.setLocation(nx, ny);
			this.lord.agregarObjeto(bec);
		}
	}
	
	public void mover() {
		disparar();
		super.mover();
	}

	@Override
	public void reLocation() {
		Random rnd = new Random(System.currentTimeMillis());
		this.setLocation(rnd.nextInt(this.lord.getJuego().getWidth()), -1*this.getHeight());		
	}
	
}
