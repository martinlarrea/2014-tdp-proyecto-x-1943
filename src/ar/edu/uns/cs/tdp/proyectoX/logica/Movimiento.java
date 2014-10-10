package ar.edu.uns.cs.tdp.proyectoX.logica;

import java.awt.Point;
import java.util.Vector;

import javax.swing.JPanel;

import ar.edu.uns.cs.tdp.proyectoX.logica.ElementoMovible;

public abstract class Movimiento extends Thread {
	
	protected Vector<ElementoMovible> naves;
	protected JPanel contenedor;
	
	public abstract void preparar();
	
	public abstract void comenzar();
	
	public abstract void recibirImpacto( ElementoMovible em );
	
	public void actualizarPosicion( int dx, int dy ) {
		this.preActualizar();
		for( ElementoMovible n : this.naves ) {
			Point pos = n.getLocation(); 
			Point newPos = new Point(pos.x + dx, pos.y + dy);
			n.setLocation(newPos);
		}
		this.postActualizar();
	}

	protected abstract void postActualizar();

	protected abstract void preActualizar();

	public Vector<ElementoMovible> getNaves() {
		return naves;
	}

	public void setNaves(Vector<ElementoMovible> naves) {
		this.naves = naves;
	}

	public JPanel getContenedor() {
		return contenedor;
	}

	public void setContenedor(JPanel contenedor) {
		this.contenedor = contenedor;
	}	
	
}
