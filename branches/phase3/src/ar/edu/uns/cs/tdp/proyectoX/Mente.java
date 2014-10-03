package ar.edu.uns.cs.tdp.proyectoX;

import ar.edu.uns.cs.tdp.proyectoX.frames.JFrameJuego;

public abstract class Mente extends Thread {
	
	protected Nave nave;
	protected JFrameJuego juego;
	
	public abstract void preparar();
	
	public abstract void jugar();

	public Nave getNave() {
		return nave;
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}

	public JFrameJuego getJuego() {
		return juego;
	}

	public void setJuego(JFrameJuego juego) {
		this.juego = juego;
	}
}
