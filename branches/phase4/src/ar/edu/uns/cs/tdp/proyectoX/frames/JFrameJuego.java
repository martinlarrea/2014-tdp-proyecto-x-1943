package ar.edu.uns.cs.tdp.proyectoX.frames;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import ar.edu.uns.cs.tdp.proyectoX.decoraciones.Barcos;
import ar.edu.uns.cs.tdp.proyectoX.decoraciones.Nubes;
import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.Bala;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.BalaEnCaida;
import ar.edu.uns.cs.tdp.proyectoX.logica.naves.Enemiga;
import ar.edu.uns.cs.tdp.proyectoX.logica.naves.Enemiga2;
import ar.edu.uns.cs.tdp.proyectoX.logica.naves.Jugador;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JPanel;

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
	private JPanel jPanelNivel;
	private SkyNet skynet;
	private JPanel jPanelGameOver;
	private JLabel jLabelNube;
	private JPanel jPanelNubes;
	private JLabel jLabelBarco2;
	private JLabel jLabelBarco1;
	private JPanel jPanelBarcos;
	private JLabel jLabelAgua;
	private JPanel jPanelAgua;
	private JLabel jLabelGameOver;
	private Jugador naveJugador;
	private int navesEnemigas = 2;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrameJuego() {
		super();
		initGUI();
		initGame();
		startGame();
	}
	
	private void startGame() {
		this.skynet.start();
		Barcos barcos = new Barcos(this);
		barcos.start();
		
		Nubes nubes = new Nubes(this);
		nubes.start();
		
	}

	private void initGame() {
		Random rnd = new Random( System.currentTimeMillis() );
		
		this.skynet = new SkyNet(this);
		this.naveJugador = new Jugador(this.skynet);
		this.skynet.setAmigo(this.naveJugador);
		for( int i = 0; i < this.navesEnemigas; i++ ) {
			Enemiga e = new Enemiga(this.skynet);
			this.skynet.agregarObjeto(e);
			this.jPanelNivel.add(e);
			e.setLocation(rnd.nextInt(this.getWidth()), rnd.nextInt(100));
		}
		
		for( int i = 0; i < this.navesEnemigas; i++ ) {
			Enemiga e = new Enemiga2(this.skynet);
			this.skynet.agregarObjeto(e);
			this.jPanelNivel.add(e);
			e.setLocation(rnd.nextInt(this.getWidth()), rnd.nextInt(100));
		}
		
		this.skynet.agregarAgregables();
		
		this.jPanelNivel.add(this.naveJugador);
		this.naveJugador.setLocation(300, 300);
		
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jPanelGameOver = new JPanel();
				getContentPane().add(jPanelGameOver);
				jPanelGameOver.setLayout(null);
				jPanelGameOver.setSize(600, 800);
				jPanelGameOver.setBackground(new java.awt.Color(0,0,0));
				jPanelGameOver.setVisible(false);
				{
					jLabelGameOver = new JLabel();
					jPanelGameOver.add(jLabelGameOver);
					jLabelGameOver.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-juego-game-over.jpg")));
					jLabelGameOver.setBounds(78, 390, 500, 365);
				}
			}
			this.addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent evt) {
					thisWindowClosed(evt);
				}
			});
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent evt) {
					thisKeyPressed(evt);
				}
			});
			{
				jPanelNivel = new JPanel();
				getContentPane().add(jPanelNivel, "Center");
				jPanelNivel.setLayout(null);
				jPanelNivel.setBackground(new java.awt.Color(173,216,230));
				jPanelNivel.setBounds(1, 0, 590, 770);
				jPanelNivel.setOpaque(false);
			}
			{
				jPanelNubes = new JPanel();
				getContentPane().add(jPanelNubes);
				jPanelNubes.setLayout(null);
				jPanelNubes.setSize(600, 800);
				jPanelNubes.setOpaque(false);
				{
					jLabelNube = new JLabel();
					jPanelNubes.add(jLabelNube);
					jLabelNube.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-cloud.png")));
					jLabelNube.setBounds(0, -541, 512, 512);
				}
			}
			{
				jPanelBarcos = new JPanel();
				getContentPane().add(jPanelBarcos);
				jPanelBarcos.setLayout(null);
				jPanelBarcos.setSize(600, 800);
				jPanelBarcos.setOpaque(false);
				{
					jLabelBarco1 = new JLabel();
					jPanelBarcos.add(jLabelBarco1);
					jLabelBarco1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-barco1.png")));
					jLabelBarco1.setBounds(436, -461, 48, 350);
				}
				{
					jLabelBarco2 = new JLabel();
					jPanelBarcos.add(jLabelBarco2);
					jLabelBarco2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-barco2.png")));
					jLabelBarco2.setBounds(94, -277, 46, 248);
				}
			}
			{
				jPanelAgua = new JPanel();
				BorderLayout jPanelAguaLayout = new BorderLayout();
				getContentPane().add(jPanelAgua);
				jPanelAgua.setLayout(jPanelAguaLayout);
				jPanelAgua.setSize(600, 800);
				jPanelAgua.setBackground(new java.awt.Color(161,204,161));
				{
					jLabelAgua = new JLabel();
					jPanelAgua.add(jLabelAgua, BorderLayout.CENTER);
					jLabelAgua.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-agua.png")));
					//jLabelAgua.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-agua.png")));
				}
			}
			pack();
			this.setSize(600, 800);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void agregarObjeto(Bala bec) {
		this.jPanelNivel.add(bec);		
	}

	public void eliminarObjeto(Bala b) {
		this.jPanelNivel.remove(b);		
	}

	public boolean estaFueraDePantalla(Bala b) {
		return( ( b.getLocation().x > this.getWidth() ) || ( b.getLocation().y > this.getHeight() ) );
	}

	public JLabel getBarco1() {
		return this.jLabelBarco1;
	}
	
	public JLabel getBarco2() {
		return this.jLabelBarco2;
	}

	public JLabel getNube() {
		return this.jLabelNube;
	}
	
	private void thisKeyPressed(KeyEvent evt) {
		this.movimientoJugador(evt.getKeyCode());
	}

	private void movimientoJugador(int keyCode) {
		Point pos = this.naveJugador.getLocation();	
		int factor = 10;
		switch(keyCode) {
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
//			case KeyEvent.VK_A: {
//				this.juego.disparoA(this.nave.getLocation());
//				break;
//			}
//			case KeyEvent.VK_S: {
//				this.juego.disparoB(this.nave.getLocation());
//				break;
//			}
//			case KeyEvent.VK_D: {
//				this.juego.disparoC(this.nave.getLocation());
//				break;
//			}
		}
		this.naveJugador.setLocation(pos);
		
	}
	
	private void thisWindowClosed(WindowEvent evt) {
		System.exit(0);
	}

	public void gameOver() {
		this.jPanelGameOver.setVisible(true);
		
	}

}
