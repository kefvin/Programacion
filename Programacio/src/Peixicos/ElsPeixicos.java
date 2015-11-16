package Peixicos;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class ElsPeixicos {
	
	GImage imagen;
	//GRectangle rectangle;
	public static final int MUEVEN = 2;
	boolean esMascle;
	int angle;
	
	
	public ElsPeixicos(GImage imatge, boolean sexe, int angulo){
		imagen = imatge;
		esMascle = sexe;
		angle= angulo;
		
	}
	
	public void colocar( int x, int y){
		imagen.setLocation(x, y);
	}
	
	
	public void mou() {
	    imagen.movePolar(MUEVEN, angle);
	}
	
	public GRectangle posicioPeix(){
		return imagen.getBounds();
	}
	
	public int altPeix(){
		return (int) imagen.getHeight();
	}
	
	public int amplePeix(){
		return (int) imagen.getWidth();
	}
	
	
}
