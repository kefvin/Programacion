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
	
	public GRectangle getPosicio() {
	    return cuerda.getBounds();
	}
	
	public void mou(int x) {
	    cuerda.move(x * 1 , 0);
	}
	
	
}
