package elJocDelsBanquers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
	static Random aleatori = new Random();
	
	public final static String[] elNom ={"Marius", "Filomenu", "Pep", "Joan", "Marcelino", "Marc", "Jason", "Eduard"};
	public final static String[] laTirada ={"Cara", "Creu"};

	public static void main(String[] args) {

		int quantitatBanquers = 3;
		
		List<Banquer> banquers = new ArrayList<Banquer>();
		
		Joc joc = new Joc();		
		joc.jugada(quantitatBanquers, banquers, elNom, laTirada);
		
		
	}


}
