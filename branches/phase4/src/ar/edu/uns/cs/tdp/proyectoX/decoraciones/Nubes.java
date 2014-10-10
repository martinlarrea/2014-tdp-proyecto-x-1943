package ar.edu.uns.cs.tdp.proyectoX.decoraciones;

import java.awt.Point;
import java.util.Random;

import ar.edu.uns.cs.tdp.proyectoX.frames.JFrameJuego;

public class Nubes extends Thread {
	protected JFrameJuego juego;
	
	public Nubes( JFrameJuego juego ) {
		this.juego = juego;
	}
	
	public void run() {
		while(true) {
			
			Random rnd = new Random(System.currentTimeMillis());			
			Point nave = this.juego.getNube().getLocation();
			nave.translate(0, 6);			
			if( nave.y > this.juego.getHeight() ) {
				nave.setLocation(rnd.nextInt(this.juego.getWidth()), -1*this.juego.getNube().getHeight() );
			}			
			this.juego.getNube().setLocation(nave);
						
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
