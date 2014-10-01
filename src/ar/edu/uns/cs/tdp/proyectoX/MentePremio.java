package ar.edu.uns.cs.tdp.proyectoX;

import java.awt.Point;

import javax.swing.ImageIcon;

public class MentePremio extends Mente {
		
	@Override
	public void preparar() {
		this.nave = new Nave(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-premio.png")));
		this.nave.setLocation(this.juego.getWidth()+50, 50);
		this.nave.setSize(50, 56);
		this.juego.agregarNave(this.nave);
	}

	@Override
	public void jugar() {
		this.start();
	}
	
	public void run() {
		while( true ) {
			try {
				Thread.sleep(5000);			
				while( this.nave.getLocation().x > -50 ) {
					Point nuevaPos = new Point(this.nave.getLocation().x-6, this.nave.getLocation().y);
					this.nave.setLocation(nuevaPos);
					Thread.sleep(100);
				}
				Point nuevaPos = new Point(this.juego.getWidth()+50, 50);
				this.nave.setLocation(nuevaPos);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
