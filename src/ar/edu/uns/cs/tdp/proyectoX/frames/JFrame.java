package ar.edu.uns.cs.tdp.proyectoX.frames;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

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
public class JFrame extends javax.swing.JFrame {
	private JToolBar jToolBarTop;
	private JToolBar jToolBarBottom;
	private JLabel jLabelPuntaje;
	private JSeparator jSeparator2;
	private JLabel jLabelLife3;
	private JLabel jLabelLife2;
	private JLabel jLabelLife1;
	private JSeparator jSeparator1;
	private JLabel jLabelPlayer;
	private JPanel jPanelAir;
	private JLabel jLabelBomb3;
	private JLabel jLabelBomb2;
	private JLabel jLabelBomb1;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			BorderLayout thisLayout = new BorderLayout();
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(thisLayout);
			getContentPane().setBackground(new java.awt.Color(173,216,230));
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent evt) {
					thisKeyPressed(evt);
				}
			});
			{
				jToolBarTop = new JToolBar();
				getContentPane().add(jToolBarTop, BorderLayout.NORTH);
			}
			{
				jToolBarBottom = new JToolBar();
				jToolBarBottom.setLayout( new BoxLayout(jToolBarBottom, BoxLayout.X_AXIS));
				getContentPane().add(jToolBarBottom, BorderLayout.SOUTH);
				{
					jLabelBomb1 = new JLabel();
					jToolBarBottom.add(jLabelBomb1);
					jLabelBomb1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/Actions-edit-bomb-icon.png")));
				}
				{
					jLabelBomb2 = new JLabel();
					jToolBarBottom.add(jLabelBomb2);
					jLabelBomb2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/Actions-edit-bomb-icon.png")));
				}
				{
					jLabelBomb3 = new JLabel();
					jToolBarBottom.add(jLabelBomb3);
					jLabelBomb3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/noActions-edit-bomb-icon.png")));
				}
				{
					jSeparator1 = new JSeparator();
					jToolBarBottom.add(jSeparator1);
					jSeparator1.setOrientation(SwingConstants.VERTICAL);
					jSeparator1.setSize(10, 2);
					jSeparator1.setPreferredSize(new java.awt.Dimension(10, 2));
				}
				{
					jLabelLife1 = new JLabel();
					jToolBarBottom.add(jLabelLife1);
					jLabelLife1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/stealth-fighter-jet-256.png")));
				}
				{
					jLabelLife2 = new JLabel();
					jToolBarBottom.add(jLabelLife2);
					jLabelLife2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/nostealth-fighter-jet-256.png")));
				}
				{
					jLabelLife3 = new JLabel();
					jToolBarBottom.add(jLabelLife3);
					jLabelLife3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/nostealth-fighter-jet-256.png")));
				}
				{
					jSeparator2 = new JSeparator();
					jToolBarBottom.add(jSeparator2);
					jSeparator2.setOrientation(SwingConstants.VERTICAL);
					jSeparator2.setPreferredSize(new java.awt.Dimension(10, 2));
					jSeparator2.setSize(10, 2);
				}
				{
					jLabelPuntaje = new JLabel();
					jToolBarBottom.add(jLabelPuntaje);
					jLabelPuntaje.setText("1879");
					jLabelPuntaje.setFont(new java.awt.Font("Andale Mono",1,24));
				}
			}
			{
				jPanelAir = new JPanel();
				getContentPane().add(jPanelAir, BorderLayout.CENTER);
				jPanelAir.setLayout(null);
				jPanelAir.setOpaque(false);
				{
					jLabelPlayer = new JLabel();
					jPanelAir.add(jLabelPlayer);
					jLabelPlayer.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/1412010750_stealth-fighter-jet-256.png")));
					jLabelPlayer.setBounds(168, 172, 56, 56);
				}
			}
			pack();
			this.setSize(600, 800);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void thisKeyPressed(KeyEvent evt) {
		System.out.println("this.keyPressed, event="+evt);
		//TODO add your code for this.keyPressed
	}

}
