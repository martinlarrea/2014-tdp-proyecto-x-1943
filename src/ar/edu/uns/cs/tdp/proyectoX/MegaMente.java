package ar.edu.uns.cs.tdp.proyectoX;

import java.awt.Point;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class MegaMente extends Mente {

	@Override
	public void preparar() {
		int mitad = this.juego.getWidth() / 2;
		this.nave.setLocation(mitad, 0-this.nave.getHeight());
	}

	@Override
	public void jugar() {
		this.start();
	}
	
	public void run() {
		boolean condicion = true;
		try {
			MegaMente.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Point pos = this.nave.getLocation();
		while( pos.y < 0 ) {
			try {
				MegaMente.sleep(100);
				int v = pos.y + 8;
				this.nave.setLocation( pos.x, v);
				pos = this.nave.getLocation();
				this.juego.repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(true) {
			while( pos.x > 0 ) {
				try {
					MegaMente.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int v = pos.x - 8;
				this.nave.setLocation( v, pos.y);
				pos = this.nave.getLocation();
				this.juego.repaint();
			}
			
			while( pos.x < this.juego.getWidth() - this.nave.getWidth() ) {
				try {
					MegaMente.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int v = pos.x + 8;
				this.nave.setLocation( v, pos.y);
				pos = this.nave.getLocation();
				this.juego.repaint();
			}
		}
	}

}
