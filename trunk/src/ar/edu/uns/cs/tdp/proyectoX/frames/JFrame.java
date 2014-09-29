package ar.edu.uns.cs.tdp.proyectoX.frames;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class JFrame extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
