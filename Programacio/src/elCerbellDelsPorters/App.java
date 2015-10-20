package elCerbellDelsPorters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
	
	private final static String[] Noms={"Pere", "Manel", "Pep", "Manolo", "Filomenu"};
	private final static String[] Sexe={"Home", "Dona"};
	private final static String[] Sabates={"Bambes", "Botes", "Sandalies}"};
	
	
	public static void main(String[] args) {
		Random aleatori = new Random();
		
		int genteRequerida=25;
		int genteDentro=0;
		String ordre="Botes";
		
		List<Client> clients = new ArrayList<Client>();
		
		for(int i=0; i<genteRequerida;i++){
			clients.add(new Client(Noms[aleatori.nextInt(Noms.length)], Sexe[aleatori.nextInt(Sexe.length)],
						Sabates[aleatori.nextInt(Sabates.length)], aleatori.nextInt(300), 16+aleatori.nextInt(20)));
		}
		
		Porter porter = new Porter();
		porter.ordreSobreSexe("");
		
				
				;
		for(int i=0; i<clients.size(); i++) {
			boolean si=porter.DejaPasar(clients.get(i));
			if(si==true){
				genteDentro++;
				System.out.println(clients.get(i));
			}
		}
		System.out.println(genteDentro);
	}

}
