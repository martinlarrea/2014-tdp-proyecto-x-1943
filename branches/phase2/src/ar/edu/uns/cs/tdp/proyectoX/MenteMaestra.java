package ar.edu.uns.cs.tdp.proyectoX;

import java.awt.Point;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class MenteMaestra extends Mente {

	protected Vector<Nave> naves;
	protected int flota = 10;
	
	public MenteMaestra() {
		super();
		this.naves = new Vector<Nave>();
	}
	
	@Override
	public void preparar() {
		int maxWidth = this.juego.getWidth();
		int maxHeight = this.juego.getHeight();
		for( int i = 0; i < this.flota; i++ ) {
			Nave nave = new Nave(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-enemiga.png")));
			int posX = new Random(System.nanoTime()).nextInt(maxWidth);
			int posY = new Random(System.nanoTime()).nextInt(maxHeight);		
			nave.setLocation(posX, (-1*posY)-50);
			nave.setSize(24, 50);
			this.juego.agregarNave(nave);
			this.naves.add(nave);
		}

	}

	@Override
	public void jugar() {
		this.start();

	}
	
	public void run() {
		int maxHeight = this.juego.getHeight();
		while(true) {
			for( int i=0; i < this.flota; i++) {
				Nave n = this.naves.get(i);
				Point pos = n.getLocation();
				Point nuevaPos;
				if (pos.y < maxHeight ) {
					nuevaPos = new Point(pos.x, pos.y+6);
				} else {
					int posY = new Random(System.nanoTime()).nextInt(maxHeight);	
					nuevaPos = new Point(pos.x, (-1*posY)-50);
				}
				n.setLocation(nuevaPos);
				//Reporter.Report(nuevaPos.toString());				
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
