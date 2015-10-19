package Boxe;

public class Combat {

	Boxejador[] boxejadors = new Boxejador[2];
	
	public Combat(Boxejador un, Boxejador dos){
		boxejadors[0] = un;
		boxejadors[1] = dos;
	}
	
	public String combat(){
		
		while( !boxejadors[0].estaKO() && !boxejadors[1].estaKO() ){
			
			int cop = boxejadors[0].ClavaCop();
			int noprotegit = boxejadors[1].noProtegeix();
			
			if(cop == noprotegit){
				boxejadors[1].repCop();
			}
			
			if(!boxejadors[1].estaKO()){
				cop = boxejadors[1].ClavaCop();
				noprotegit = boxejadors[0].noProtegeix();
				
			}
			
		}
		
		if(boxejadors[0].estaKO()){
			return boxejadors[1].getNom();
		}
		
		return boxejadors[0].getNom();
	}
	
}
