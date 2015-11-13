package Peixicos;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Peixera {
	Random aleatori = new Random();
	
	List<ElsPeixicos> peixos = new ArrayList<ElsPeixicos>();
	int fi = peixos.size();
	
	
	
	public void afegirPeix(ElsPeixicos Peix){
		
			peixos.add(Peix);
		
	}
	
	
	public void mourePeixos(){
		for(ElsPeixicos p:peixos){
			p.mou();
			
		}
	}
	
	public void recolocarPeixos(){
		for(ElsPeixicos p:peixos){
			//if x peix choca on le borde, recolocalo
			/*if(//si se pasan de la medida definida de la pantalla... (no intersects)){
				
			}*/
		}
	}
	
	public boolean fin(){
		if(fi == 1){
			return false;
		}
		return true;
	}
	
	
}
