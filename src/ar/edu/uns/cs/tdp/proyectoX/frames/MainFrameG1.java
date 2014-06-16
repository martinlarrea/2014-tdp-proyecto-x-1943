package ar.edu.uns.cs.tdp.proyectoX.frames;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
	private JLabel jLabelPlane;

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
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent evt) {
					thisKeyPressed(evt);
				}
			});
			{
				jPanelMain = new JPanel();
				getContentPane().add(jPanelMain, BorderLayout.CENTER);
				jPanelMain.setLayout(null);
				jPanelMain.setBackground(new java.awt.Color(173,216,230));
				{
					jLabelPlane = new JLabel();
					jPanelMain.add(jLabelPlane);
					jLabelPlane.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/plane.png")));
					jLabelPlane.setBounds(229, 258, 70, 53);
				}
			}
			pack();
			this.setSize(480, 640);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void thisKeyPressed(KeyEvent evt) {
		switch (evt.getKeyCode()) {
		case KeyEvent.VK_UP: this.movePlane(0, -5); break;
		case KeyEvent.VK_DOWN: this.movePlane(0, 5); break;
		case KeyEvent.VK_LEFT: this.movePlane(-5, 0); break;
		case KeyEvent.VK_RIGHT: this.movePlane(5, 0); break;
		}
	}
	
	private void movePlane( int offx, int offy ) {
		int x = this.jLabelPlane.getLocation().x;
		int y = this.jLabelPlane.getLocation().y;
		this.jLabelPlane.setLocation( x + offx, y + offy );
	}

}
