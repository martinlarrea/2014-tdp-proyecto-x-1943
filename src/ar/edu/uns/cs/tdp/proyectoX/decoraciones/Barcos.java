package ar.edu.uns.cs.tdp.proyectoX.decoraciones;

import java.awt.Point;
import java.util.Random;

import ar.edu.uns.cs.tdp.proyectoX.frames.JFrameJuego;

public class Barcos extends Thread {
	
	protected JFrameJuego juego;
	
	public Barcos( JFrameJuego juego ) {
		this.juego = juego;
	}
	
	public void run() {
		while(true) {
			
			Random rnd = new Random(System.currentTimeMillis());			
			Point nave = this.juego.getBarco1().getLocation();
			nave.translate(0, 2);			
			if( nave.y > this.juego.getHeight() ) {
				nave.setLocation(rnd.nextInt(this.juego.getWidth()), -1*this.juego.getBarco1().getHeight() );
			}			
			this.juego.getBarco1().setLocation(nave);
			
			nave = this.juego.getBarco2().getLocation();
			nave.translate(0, 2);
			if( nave.y > this.juego.getHeight() ) {
				nave.setLocation(rnd.nextInt(this.juego.getWidth()), -1*this.juego.getBarco2().getHeight() );
			}
			this.juego.getBarco2().setLocation(nave);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
