package ar.edu.uns.cs.tdp.proyectoX.logica;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import ar.edu.uns.cs.tdp.proyectoX.frames.JFrameJuego;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.Bala;
import ar.edu.uns.cs.tdp.proyectoX.logica.naves.Jugador;

public class SkyNet extends Thread {
	
	protected JFrameJuego juego;
	protected Vector<Bala> objetosEnemigos;
	protected Vector<Bala> objetosParaAgregar;
	protected Vector<Bala> objetosParaEliminar;
	protected Jugador amigo;
	
	public SkyNet( JFrameJuego juego ) {
		this.juego = juego;
		this.objetosEnemigos = new Vector<Bala>();
		this.objetosParaAgregar = new Vector<Bala>();
		this.objetosParaEliminar = new Vector<Bala>();
	}

	public void eliminarObjeto(Bala b) {
		this.objetosParaEliminar.add(b);
		this.juego.eliminarObjeto(b);
	}

	public void agregarObjeto(Bala bec) {
		this.objetosParaAgregar.add(bec);
		this.juego.agregarObjeto(bec);
		
	}
	
	public void run() {
		while( (this.amigo.getVida() > 0) && (!this.objetosEnemigos.isEmpty() ) ) {
			Iterator<Bala> i = this.objetosEnemigos.iterator();
			while(i.hasNext()) {
				Bala b = i.next();
				b.mover();
				if( this.juego.estaFueraDePantalla(b) ) {
					b.reLocation();
				} else {
					if( b.alcanzoObjeto(this.amigo)) {
						//b.golpearObjeto(this.amigo);
					}
				}
			}
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			eliminarEliminables();
			agregarAgregables();
		}
	}

	public void agregarAgregables() {
		Iterator<Bala> i = this.objetosParaAgregar.iterator();
		while( i.hasNext() ) {
			Bala bala = i.next();
			this.objetosEnemigos.add(bala);
		}
		this.objetosParaAgregar = new Vector<Bala>();
		
	}

	private void eliminarEliminables() {
		Iterator<Bala> i = this.objetosParaEliminar.iterator();
		while( i.hasNext() ) {
			Bala bala = i.next();
			this.objetosEnemigos.remove(bala);
		}
		this.objetosParaEliminar = new Vector<Bala>();
	}

	/**
	 * @return the amigo
	 */
	public Jugador getAmigo() {
		return amigo;
	}

	/**
	 * @param amigo the amigo to set
	 */
	public void setAmigo(Jugador amigo) {
		this.amigo = amigo;
	}

	/**
	 * @return the juego
	 */
	public JFrameJuego getJuego() {
		return juego;
	}

}
