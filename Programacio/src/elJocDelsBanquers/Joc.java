package elJocDelsBanquers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joc {
	static Random aleatori = new Random();
	
	public void jugada(int quantitatBanquers, List<Banquer> banquers, String[] elNom, String[] laTirada){
		
		for(int i=0; i<quantitatBanquers; i++){
			banquers.add(new Banquer(
					elNom[aleatori.nextInt(elNom.length)],
					aleatori.nextInt(30)+2));
		}
		
		int bosses=0;
		String haTirat="";
		
		while(banquers.size()>=2){
			int cares=0;
			int creus=0;
			String perden ="";
			
			System.out.println("--------------");
			
			for(int i =0; i<banquers.size();i++){
				banquers.get(i).tira(laTirada[aleatori.nextInt(laTirada.length)]);
				
				haTirat = banquers.get(i).queHasTret();
				System.out.println(banquers.get(i).getNom()+" ha tret: "+haTirat);
				if(haTirat.equals(laTirada[0])){
					cares =+ 1;
				}else{
					creus =+ 1;
				}
			}
			if(cares>creus){
				
				perden=laTirada[0];
				
			}else if(cares<creus){
				
				perden=laTirada[1];
				
			}else if(!(cares==creus)){
				
				for(int i =0; i<banquers.size();i++){
					
					if(perden.equals(banquers.get(i).queHasTret())){
						
						bosses = bosses + banquers.get(i).getBosses();
						banquers.remove(i);
					
					}
				}
			}
		}
		
		if(banquers.size()==2){
			bosses = bosses/2;
			for(int i =0; i<banquers.size();i++){
				banquers.get(i).setBosses(bosses);
			}
		}else{
			banquers.get(0).setBosses(bosses);
		}
		
		
	}
}
