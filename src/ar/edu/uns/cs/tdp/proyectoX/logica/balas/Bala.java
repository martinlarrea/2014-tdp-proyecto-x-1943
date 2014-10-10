package ar.edu.uns.cs.tdp.proyectoX.logica.balas;

import java.awt.Point;
import java.awt.geom.Area;

import javax.swing.JLabel;

import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;
import ar.edu.uns.cs.tdp.proyectoX.logica.naves.Jugador;
import ar.edu.uns.cs.vyglab.util.Reporter;

public abstract class Bala extends JLabel {
	protected int potencia; // valor entre 0 y 100, es lo que se le resta a la vida de quien choca
	protected int vida; // valor entre 0 y 100
	protected Point movimiento; // un vector que indica cómo se mueve la Bala en "un" paso 
	protected SkyNet lord; // mente central que controla todos los enemigos
	protected int velocidad;

	
	public void golpearObjeto( Bala b) {
		if( b.getVida() - this.getPotencia() < 0 ) {
			this.lord.eliminarObjeto(b);
		} else {
			b.setVida( b.getVida() - this.getPotencia() );
		}
		this.lord.eliminarObjeto(this);
	}

	/**
	 * @return the vida
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * @param vida the vida to set
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	/**
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @return the movimiento
	 */
	public Point getMovimiento() {
		return movimiento;
	}

	/**
	 * @return the lord
	 */
	public SkyNet getLord() {
		return lord;
	}

	public void mover() {
		Point position = this.getLocation();
		position.translate(this.movimiento.x, this.movimiento.y);
		this.setLocation(position);
	}

	public boolean alcanzoObjeto(Bala b) {
		Area area1 = new Area(this.getBounds());
		Area area2 = new Area(b.getBounds());
		return area1.intersects(area2.getBounds2D());
	}

	public void reLocation() {
		this.lord.eliminarObjeto(this);
	}
}
