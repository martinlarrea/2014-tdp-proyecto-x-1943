package ar.edu.uns.cs.tdp.proyectoX.logica;

import java.util.Vector;
import ar.edu.uns.cs.tdp.proyectoX.logica.ElementoMovible;

public abstract class Movimiento extends Thread {
	
	protected Vector<ElementoMovible> naves;
	
	public abstract void preparar();
	
	public abstract void comenzar();
	
	public void bajar() {
		
	}
}
