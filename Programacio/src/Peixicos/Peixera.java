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
			p.mou();
			recolocarPeixos(p);
		}
	}
	
	public void recolocarPeixos(ElsPeixicos peix){
		for(ElsPeixicos p:peixos){
			//if x peix choca on le borde, recolocalo
			/*if(//si se pasan de la medida definida de la pantalla... (no intersects)){
			}*/
			if(peix.posicioPeix().getX() > MIDAPANTALLA){
				//int temp0 = (int) peix.posicioPeix().getX();
				int temp1 = ((int) peix.posicioPeix().getX()) % 800;
				int temp2 = temp1 - peix.amplePeix();
				peix.colocar(temp2, (int) peix.posicioPeix().getX());
			}
			
		}
	}
	
	public boolean fin(){
		if(fi == 1){
			return false;
		}
		return true;
	}
	
	
}
