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
		
		for(int i=0;i<banquers.size();i++){
			bosses = bosses + banquers.get(i).getBosses();
		}
		
		//Mientras que el tamaño de banques sea mas grande qeu 2 repite
		while(banquers.size()>2){
			int cares=0;
			int creus=0;
			String perden ="";
			
			System.out.println("--------------");
			
			//Recorre banquers y coprova que han sacado al tirar la moneda
			for(int i =0; i<banquers.size();i++){
				banquers.get(i).tira(laTirada[aleatori.nextInt(laTirada.length)]);
				
				haTirat = banquers.get(i).queHasTret();
				
				System.out.println(banquers.get(i).getNom()+" ha tret: "+haTirat);
				
				if(haTirat.equals(laTirada[0])){
					cares++;
				}else{
					creus++;
				}
			}
			
			//Comprueva quien ha perdido y los elimina
			if(cares>creus){
				
				perden=laTirada[0];
				
				//busca y elimina a los que han perdido
				for(int i =0; i<banquers.size();i++){
					
					if(perden.equals(banquers.get(i).queHasTret())){
						banquers.remove(i);

					
					}

				}
				
			}else if(cares<creus){
				
				perden=laTirada[1];
				
				//busca y elimina a los que han perdido
				for(int i =0; i<banquers.size();i++){
					
					if(perden.equals(banquers.get(i).queHasTret())){
						
						banquers.remove(i);
						
					
					}

				}
				
			}else if((cares==creus)){
				
				
			}
		}
		
		if(banquers.size()>1){
			bosses = bosses/2;
			for(int i =0; i<banquers.size();i++){
				banquers.get(i).setBosses(bosses);
			}
			System.out.print("Han guanyat els banquers "+banquers.get(0).getNom()+" i "+banquers.get(1).getNom()+" cadascú té "+
			bosses);
		}else{
			banquers.get(0).setBosses(bosses);
			System.out.print("Ha guanyat el banquer"+banquers.get(0).getNom()+" i té "+bosses);
		}
		
		
	}
}
