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
	
	//retorna la posicio
	public GRectangle getPosicio() {
	    return imagen.getBounds();
	}
	
	
	//Retorna la força
	public int getFuerza(){
		fuerza=aleatori.nextInt(20);
		return fuerza;
	}
	
}
