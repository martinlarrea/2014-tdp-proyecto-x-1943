package ar.edu.uns.cs.tdp.proyectoX.frames;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.tdp.proyectoX.MegaMente;
import ar.edu.uns.cs.tdp.proyectoX.MenteTeclado;
import ar.edu.uns.cs.tdp.proyectoX.Nave;


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
public class JFrameJuego extends javax.swing.JFrame {
	private MenteTeclado menteTeclado;
	private MegaMente megaMente;
	private JPanel jPanelNivel;
	private Nave jLabelNaveJugador;
	private JButton jButtonNuevoJuego;
	private JButton jButtonExit;
	private JSeparator jSeparator1;
	private JButton jButtonIdioma;
	private JButton jButtonPlanes;
	private JToolBar jToolBarTop;
	private Nave jLabelBoss;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrameJuego() {
		super();
		initGUI();
		initGame();
	}
	
	private void initGame() {		
		menteTeclado = new MenteTeclado();
		menteTeclado.setJuego(this);
		menteTeclado.setNave(jLabelNaveJugador);
		this.addKeyListener(menteTeclado);
		
		megaMente = new MegaMente();
		megaMente.setJuego(this);
		megaMente.setNave(jLabelBoss);
		megaMente.preparar();
		megaMente.jugar();
		
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setBackground(new java.awt.Color(173,216,230));
			this.setResizable(false);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					thisWindowClosing(evt);
				}
			});
			{
				jPanelNivel = new JPanel();
				getContentPane().add(jPanelNivel, BorderLayout.CENTER);
				jPanelNivel.setLayout(null);
				jPanelNivel.setOpaque(false);
				{
					jLabelNaveJugador = new Nave();
					jPanelNivel.add(jLabelNaveJugador);
					jLabelNaveJugador.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-jugador.png")));
					jLabelNaveJugador.setBounds(286, 527, 56, 56);
				}
				{
					jLabelBoss = new Nave();
					jPanelNivel.add(jLabelBoss);
					jLabelBoss.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-boss.png")));
					jLabelBoss.setBounds(128, -269, 350, 314);
				}
			}
			{
				jToolBarTop = new JToolBar();
				getContentPane().add(jToolBarTop, BorderLayout.NORTH);
				jToolBarTop.setOpaque(false);
				{
					jButtonNuevoJuego = new JButton();
					jToolBarTop.add(jButtonNuevoJuego);
					jButtonNuevoJuego.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nuevo-juego.png")));
				}
				{
					jButtonPlanes = new JButton();
					jToolBarTop.add(jButtonPlanes);
					jButtonPlanes.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-planes.png")));
				}
				{
					jButtonIdioma = new JButton();
					jToolBarTop.add(jButtonIdioma);
					jButtonIdioma.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-idioma.png")));
				}
				{
					jSeparator1 = new JSeparator();
					jToolBarTop.add(jSeparator1);
					jSeparator1.setOrientation(SwingConstants.VERTICAL);
				}
				{
					jButtonExit = new JButton();
					jToolBarTop.add(jButtonExit);
					jButtonExit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-salir.png")));
					jButtonExit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonExitActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(600, 800);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButtonExitActionPerformed(ActionEvent evt) {
		cerrarJuego();
	}
	
	private void thisWindowClosing(WindowEvent evt) {
		cerrarJuego();
	}
	
	private void cerrarJuego() {
		this.dispose();
		System.exit(0);
		
	}

}
