package ar.edu.uns.cs.tdp.proyectoX.main;

import ar.edu.uns.cs.tdp.proyectoX.frames.JFrameJuego;
import ar.edu.uns.cs.tdp.proyectoX.frames.SplashScreen;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SplashScreen splash = new SplashScreen(3000);
		splash.showSplash();	
		
		JFrameJuego jfj = new JFrameJuego();
		jfj.setVisible(true);
	}

}
