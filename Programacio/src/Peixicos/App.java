package Peixicos;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;


public class App extends GraphicsProgram{
	

	public static final int MIDAPANTALLA = 600;
	
	public void run(){
		//GImage pfemella = new GImage("peixa.png");
		GRectangle pantalla = new GRectangle(0, 0, MIDAPANTALLA, MIDAPANTALLA); 
				
		ArrayList<ElsPeixicos> Peixos = new ArrayList<ElsPeixicos>(); 
		
		for(int i=0; i<10 ;i++){
			generaPeixos();
		}
		
		
	}
	
	private void generaPeixos(){
		
		Random aleatori = new Random();
		GImage pmascle = new GImage("peix.png");
		boolean[] sexe = {true, false};
		
		ElsPeixicos peix = new ElsPeixicos(
				pmascle,
				aleatori.nextInt((int)(MIDAPANTALLA-pmascle.getWidth())),
				0,
				sexe[aleatori.nextInt(sexe.length)]
				);
		add(peix);
	}
	
	
	
}
