package Peixicos;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class ElsPeixicos {
	
	GImage imagen;
	//GRectangle rectangle;
	public static final int MUEVEN = 7;
	boolean esMascle;
	int angle;
	boolean vivo;
	
	
	public ElsPeixicos(GImage imatge, boolean sexe, int angulo){
		imagen = imatge;
		esMascle = sexe;
		angle= angulo;
		vivo = true;
		
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
	
	public boolean estaVivo(){
		return vivo;
	}
	
	public void matar(){
		
	}
	
	public boolean getSexe(){
		return esMascle;
	}
	
	public boolean xoca(ElsPeixicos actual){
		if(imagen.getBounds().intersects(actual.posicioPeix())){
			return true;
		}
		return false;
	}
	
}
