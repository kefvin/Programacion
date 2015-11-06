package Peixicos;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class ElsPeixicos {
	
	GImage imagen;
	GRectangle rectangle;
	public static final int MUEVEN = 20;
	boolean esMascle;
	
	
	public ElsPeixicos(GImage imatge, int x, int y, boolean sexe){
		imagen = imatge;
		imagen.setLocation(x, y);
		esMascle = sexe;
	}
	
	public void mou(int x, int y) {
	    imagen.move(x , y);
	}
	
	
}
