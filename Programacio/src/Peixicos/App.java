package Peixicos;

import java.util.ArrayList;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;


public class App extends GraphicsProgram{
	

	public static final int MIDAPANTALLA = 600;
	
	public void run(){
		
		GRectangle pantalla = new GRectangle(0, 0, MIDAPANTALLA, MIDAPANTALLA); 
				
		ArrayList<ElsPeixicos> Peixos = new ArrayList<ElsPeixicos>(); 
		
		for(int i=0; i<10 ;i++){
			generaPeixos();
		}
		
		
	}
	
private void generaPeixos(){
		
		Random aleatori = new Random();
		boolean[] sexes = {true, false};
		boolean sexe = sexes[aleatori.nextInt(sexes.length)];
		GImage Ipeixa = new GImage("peixa.png");
		GImage Ipeix = new GImage("peix.png");
		
		if(sexe==true){
			add(Ipeix);
		}else{
			add(Ipeixa);
		}
		
		ElsPeixicos peix = new ElsPeixicos(
				Ipeix,
				aleatori.nextInt((int)(MIDAPANTALLA-Ipeix.getWidth())),
				aleatori.nextInt((int)(MIDAPANTALLA-Ipeix.getHeight())),
				sexe
				);
		
	}
	
	
	
}
