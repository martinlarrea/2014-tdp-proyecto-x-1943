package ar.edu.uns.cs.tdp.proyectoX;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ar.edu.uns.cs.vyglab.util.Reporter;

public class MenteTeclado extends Mente implements KeyListener {

	@Override
	public void preparar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		Point pos = this.nave.getLocation();	
		int factor = 4;
		switch(arg0.getKeyCode()) {
			case KeyEvent.VK_UP: {
				int v = pos.y - factor;
				pos.setLocation(pos.x, v);
				break;
			}
			case KeyEvent.VK_DOWN: {
				int v = pos.y + factor;
				pos.setLocation(pos.x, v);
				break;
			}
			case KeyEvent.VK_LEFT: {
				int v = pos.x - factor;
				pos.setLocation(v, pos.y);
				break;
			}
			case KeyEvent.VK_RIGHT: {
				int v = pos.x + factor;
				pos.setLocation(v, pos.y);
				break;
			}
			case KeyEvent.VK_A: {
				this.juego.disparoA(this.nave.getLocation());
				break;
			}
			case KeyEvent.VK_S: {
				this.juego.disparoB(this.nave.getLocation());
				break;
			}
			case KeyEvent.VK_D: {
				this.juego.disparoC(this.nave.getLocation());
				break;
			}
		}
		this.nave.setLocation(pos);
		this.juego.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
