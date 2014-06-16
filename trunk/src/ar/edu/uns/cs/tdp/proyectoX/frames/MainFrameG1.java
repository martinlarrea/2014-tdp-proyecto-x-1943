package ar.edu.uns.cs.tdp.proyectoX.frames;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainFrameG1 extends javax.swing.JFrame {
	private JPanel jPanelMain;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public MainFrameG1() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanelMain = new JPanel();
				getContentPane().add(jPanelMain, BorderLayout.CENTER);
				jPanelMain.setLayout(null);
				jPanelMain.setBackground(new java.awt.Color(173,216,230));
			}
			pack();
			this.setSize(480, 640);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
