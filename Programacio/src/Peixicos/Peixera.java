package Peixicos;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Peixera {
	Random aleatori = new Random();
	public static final int MIDAPANTALLA = 600;
	
	List<ElsPeixicos> peixos = new ArrayList<ElsPeixicos>();
	int fi = peixos.size();
	
	
	
	public void afegirPeix(ElsPeixicos Peix){
		
			peixos.add(Peix);
		
	}
	
	
	public void mourePeixos(){
		
		for(ElsPeixicos p:peixos){
			if(p.vivo){
			p.mou();
			compruevaVivoYMata(p);
			recolocarPeixos(p);
		}
	}
	}
	
	public void compruevaVivoYMata(ElsPeixicos p){
		boolean vivo = p.estaVivo();
		boolean mascle = p.getSexe();
		boolean xoca;
		//recorre la lista de peces
		for(ElsPeixicos actual:peixos){
			
			//Si chocan y al que me choco está vivo
			if(p.xoca(actual) &&  actual.vivo){
				
				//Y no es el pez actual
				if(p!=actual){
					
					//Y son del mismo sexo
					if(p.getSexe() == actual.getSexe()){
						p.matar();
						actual.matar();
					}else{
						//A criar como conejos
						nacer();
						
					}
				}
			}
		}
		
		
	}
	
	public void nacer(){
		
	}
	
	
	
	
	
	public void recolocarPeixos(ElsPeixicos peix){
			//if x peix choca on le borde, recolocalo
			/*if(//si se pasan de la medida definida de la pantalla... (no intersects)){
			}*/
			if(peix.posicioPeix().getX() > MIDAPANTALLA+peix.amplePeix()){
				
				peix.colocar(0-peix.amplePeix()    ,   (int) peix.posicioPeix().getY());
				
			}else if(peix.posicioPeix().getX() < 0-peix.amplePeix()){
				peix.colocar(MIDAPANTALLA+peix.amplePeix()   ,   (int) peix.posicioPeix().getY());
				
			}else if(peix.posicioPeix().getY() > MIDAPANTALLA){
				
				peix.colocar((int) peix.posicioPeix().getX()    ,   MIDAPANTALLA-peix.altPeix());
				
			}else if(peix.posicioPeix().getY() < 0-peix.amplePeix()){
				peix.colocar((int) peix.posicioPeix().getX()   ,   MIDAPANTALLA+peix.altPeix());
			}
			
		
	}
	
	public boolean fin(){
		if(fi == 1){
			return false;
		}
		return true;
	}
	
	
}
