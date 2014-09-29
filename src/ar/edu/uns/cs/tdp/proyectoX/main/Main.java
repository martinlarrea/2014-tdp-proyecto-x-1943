package ar.edu.uns.cs.tdp.proyectoX.main;

import ar.edu.uns.cs.tdp.proyectoX.frames.JFrame;
import ar.edu.uns.cs.tdp.proyectoX.frames.SplashScreen;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SplashScreen splash = new SplashScreen(2000);
		splash.showSplash();
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
	}

}
