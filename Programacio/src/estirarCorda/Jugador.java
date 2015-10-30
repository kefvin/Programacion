package estirarCorda;

import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Jugador {
	
	Random aleatori = new Random();
	
	int fuerza;
	GImage imagen;
	
	public Jugador(GImage image){
		
	}
	
	public GRectangle getPosicio() {
	    return imagen.getBounds();
	}
	
	public void mou(int x) {
	    imagen.move(x * 1 , 0);
	  }
	public int getFuerza(){
		fuerza=aleatori.nextInt(20);
		return fuerza;
	}
	
}
