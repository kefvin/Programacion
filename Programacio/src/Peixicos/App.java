package Peixicos;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;


public class App extends GraphicsProgram{
	
	Peixera peixera = new Peixera();

	public static final int MIDAPANTALLA = 600;
	GRectangle pantalla;
	
	public void run(){
		
		 pantalla = new GRectangle(0, 0, MIDAPANTALLA, MIDAPANTALLA);
				 
		
		for(int i=0; i<20 ;i++){
			generaPeixos();
		}

		while(peixera.fin()){
			pause(100);
			peixera.mourePeixos();
		}
		
	}
	
private void generaPeixos(){
		
		Random aleatori = new Random();
		boolean[] sexes = {true, false};
		boolean sexe = sexes[aleatori.nextInt(sexes.length)];
		GImage imatge;
		
		
		if(sexe==true){
			imatge = new GImage("peix.png");
			
		}else{
			imatge = new GImage("peixa.png");
			
		}
		add(imatge);
		
		ElsPeixicos peix = new ElsPeixicos(
				imatge,
				sexe,
				aleatori.nextInt(3)*90		
				);
		peix.colocar(
				aleatori.nextInt((int)(MIDAPANTALLA-imatge.getWidth())),
				aleatori.nextInt((int)(MIDAPANTALLA-imatge.getHeight()))
				);
		
		
		peixera.afegirPeix(peix);
		
	}
	
	public void init() {
		setSize(MIDAPANTALLA, MIDAPANTALLA);
	}
	
}
