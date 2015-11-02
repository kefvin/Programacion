package estirarCorda;

import java.awt.Color;


import acm.graphics.GRect;
import acm.graphics.GRectangle;

public class Corda {
	
	GRect cuerda;
	
	public Corda(GRect corda){
		cuerda = corda;
		cuerda.setColor(Color.orange);
	}
	
	//retorna posicio de la corda
	public GRectangle getPosicio() {
	    return cuerda.getBounds();
	}
	
	//mou la corda
	public void mou(int x) {
	    cuerda.move(x * 1 , 0);
	}
	
	
}
