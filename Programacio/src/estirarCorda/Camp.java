package estirarCorda;

import java.util.List;

import acm.graphics.GRect;
import acm.graphics.GRectangle;

public class Camp {
	
	GRectangle mida;
	
	public Camp(GRectangle medida){
		mida = medida;
	}
	
	
	public void play(List<Jugador> equipEsquerre, List<Jugador> equipDreta, int Qjugadors, GRect corda){
		
		
		corda.setLocation((mida.getWidth()/2)-200,(mida.getHeight()/2)-5);
		
		
		
		
		
	}
	
	
	
}