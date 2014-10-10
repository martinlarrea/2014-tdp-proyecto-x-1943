package ar.edu.uns.cs.tdp.proyectoX.logica.naves;

import java.awt.Point;
import java.util.Random;

import javax.swing.ImageIcon;

import ar.edu.uns.cs.tdp.proyectoX.logica.SkyNet;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.Bala;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.BalaDiagonalDer;
import ar.edu.uns.cs.tdp.proyectoX.logica.balas.BalaDiagonalIzq;

public class Enemiga2 extends Enemiga {

	public Enemiga2(SkyNet ia) {
		super(ia);
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ar/edu/uns/cs/tdp/proyectoX/resources/images/tdp-nave-tipo1-enemiga.png")));
		this.setSize(48, 99);
		this.velocidad = 8;
		this.movimiento = new Point(0,velocidad);
		this.frecuencia = 5;
	}
	
	public void disparar() {
		Random rn = new Random(System.currentTimeMillis());
		if( rn.nextInt(this.frecuencia) == 0 ) {
			Bala bec = new BalaDiagonalDer(this.lord);
			bec.setLocation(this.getLocation());
			this.lord.agregarObjeto(bec);
			
			bec = new BalaDiagonalIzq(this.lord);
			bec.setLocation(this.getLocation());
			this.lord.agregarObjeto(bec);
		}
	}

}
