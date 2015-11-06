package estirarCorda;

import java.util.Random;
import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Jugador {
	
	Random aleatori = new Random();
	
	int fuerza;
	GImage imagen;
	GRectangle mida;
	
	public Jugador(GImage image){
		
	}
	
	//retorna la posicio
	public GRectangle getPosicio() {
	    return imagen.getBounds();
	}
	
	//Mou el jugador
		public void mou(int x) {
		    imagen.move(x * 1 , 0);
	}
	
	//posiciona jugador
		public void Posiciona(int x, int y, Jugador jugador){
			jugador.setLocation();
		}
	
	//Retorna la força
	public int getFuerza(){
		fuerza=aleatori.nextInt(20);
		return fuerza;
	}
	
}
