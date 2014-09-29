package ar.edu.uns.cs.tdp.proyectoX.frames;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;

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
import ar.edu.uns.cs.tdp.proyectoX.audio.AudioPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javazoom.jl.player.Player;


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
	private JLabel jLabelPuntaje;
	private JSeparator jSeparator3;
	private JLabel jLabelBomba1;
	private JSeparator jSeparator2;
	private JToolBar jToolBarBottom;
	private JLabel jButtonVida1;
	private JSeparator jSeparator1;
	private JButton jButtonIdioma;
	private JButton jButtonPlanes;
	private JToolBar jToolBarTop;
	private Nave jLabelBoss;
	private JLabel jButtonVida2;
	private JLabel jButtonVida3;
	private JLabel jLabelBomba2;
	private JLabel jLabelBomba3;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrameJuego() {
		super();
		initGUI();
		initGame();
		//initAudio();
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
					jLabelNaveJugador.setBounds(270, 353, 56, 56);
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
				jToolBarTop.setFloatable(false);
				jToolBarTop.setBackground(new java.awt.Color(131,186,204));
				{
					jButtonNuevoJuego = new JButton();
					jToolBarTop.add(jButtonNuevoJuego);
					jButtonNuevoJuego.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nuevo-juego.png")));
					jButtonNuevoJuego.setOpaque(false);
					jButtonNuevoJuego.setFocusable(false);
				}
				{
					jButtonPlanes = new JButton();
					jToolBarTop.add(jButtonPlanes);
					jButtonPlanes.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-planes.png")));
					jButtonPlanes.setOpaque(false);
					jButtonPlanes.setFocusable(false);
				}
				{
					jButtonIdioma = new JButton();
					jToolBarTop.add(jButtonIdioma);
					jButtonIdioma.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-idioma.png")));
					jButtonIdioma.setOpaque(false);
					jButtonIdioma.setFocusable(false);
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
					jButtonExit.setOpaque(false);
					jButtonExit.setFocusable(false);
					jButtonExit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonExitActionPerformed(evt);
						}
					});
				}
			}
			{
				jToolBarBottom = new JToolBar();
				jToolBarBottom.setLayout( new FlowLayout(FlowLayout.LEFT));
				getContentPane().add(jToolBarBottom, BorderLayout.SOUTH);
				jToolBarBottom.setBackground(new java.awt.Color(123,146,154));
				jToolBarBottom.setFloatable(false);
				{
					jButtonVida1 = new JLabel();
					jToolBarBottom.add(jButtonVida1);
					jButtonVida1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-vida-disponible.png")));
					jButtonVida1.setOpaque(false);
					jButtonVida1.setFocusable(false);

					jButtonVida2 = new JLabel();
					jToolBarBottom.add(jButtonVida2);
					jButtonVida2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-vida-disponible.png")));
					jButtonVida2.setOpaque(false);
					jButtonVida2.setFocusable(false);

					jButtonVida3 = new JLabel();
					jToolBarBottom.add(jButtonVida3);
					jButtonVida3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-vida-usada.png")));
					jButtonVida3.setOpaque(false);
					jButtonVida3.setFocusable(false);
				}
				{
					jSeparator2 = new JSeparator();
					jToolBarBottom.add(jSeparator2);
					jSeparator2.setOrientation(SwingConstants.VERTICAL);
					jSeparator2.setSize(50, 48);
					jSeparator2.setPreferredSize(new java.awt.Dimension(10, 48));
				}
				{
					jLabelBomba1 = new JLabel();
					jToolBarBottom.add(jLabelBomba1);
					jLabelBomba1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-bomba-disponible.png")));
					jLabelBomba1.setFocusable(false);

					jLabelBomba2 = new JLabel();
					jToolBarBottom.add(jLabelBomba2);
					jLabelBomba2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-bomba-usada.png")));
					jLabelBomba2.setFocusable(false);

					jLabelBomba3 = new JLabel();
					jToolBarBottom.add(jLabelBomba3);
					jLabelBomba3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-bomba-usada.png")));
					jLabelBomba3.setFocusable(false);
				}
				{
					jSeparator3 = new JSeparator();
					jToolBarBottom.add(jSeparator3);
					jSeparator3.setOrientation(SwingConstants.VERTICAL);
					jSeparator3.setPreferredSize(new java.awt.Dimension(150, 48));
				}
				{
					jLabelPuntaje = new JLabel();
					jToolBarBottom.add(jLabelPuntaje);
					jLabelPuntaje.setText("0992");
					jLabelPuntaje.setFont(new java.awt.Font("Andale Mono",1,26));
					jLabelPuntaje.setForeground(new java.awt.Color(165,42,42));
					jLabelPuntaje.setFocusable(false);
				}
			}
			pack();
			this.setSize(600, 550);
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
	
	private void initAudio() {
		AudioPlayer ap = new AudioPlayer("ar/edu/uns/cs/tdp/proyectoX/resources/audio/dangerzone.mp3");
		Thread t = new Thread(ap);
		t.start();
	}

}
