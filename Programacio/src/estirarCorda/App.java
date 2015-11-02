package estirarCorda;

import acm.program.GraphicsProgram;
import acm.graphics.GRectangle;

import java.util.ArrayList;
import java.util.List;

import acm.graphics.GImage;
import acm.graphics.GRect;

public class App extends GraphicsProgram {
	
	private static final int MIDAPANTALLA = 600;
	
	GRect rect;
	List<Jugador> equipEsquerre = new ArrayList<Jugador>();
	List<Jugador> equipDreta = new ArrayList<Jugador>();
	
	public void run(){
		int Qjugadors = 6;
	
		GRectangle mida = new GRectangle(0, 0, MIDAPANTALLA, MIDAPANTALLA);		
		
		// Entra jugadors a l'equip Dreta
		for(int i=0;i<Qjugadors;i++){
			GImage imatge = new GImage("jugador1.png");
			equipDreta.add(new Jugador(imatge));
			add(imatge);
		}
		
		// Entra jugadors a l'equip Dreta
		for(int i=0;i<Qjugadors;i++){
			GImage imatge = new GImage("jugador2.png");
			equipDreta.add(new Jugador(imatge));
			add(imatge);
		}
		
		//Afegim corda a la pissarra
		GRect corda = new GRect(400,5);
		add(corda);
		
		//Cridem el camp
		Camp camp = new Camp(mida);
		camp.play(equipEsquerre, equipDreta, Qjugadors, corda);
	}
}
