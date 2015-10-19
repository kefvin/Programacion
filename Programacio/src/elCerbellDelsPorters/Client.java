package elCerbellDelsPorters;


public class Client {
	String Nom;
	String Sexe;
	String Mocasines;
	int Pasta;
	int Edat;
	
	public Client(String elNom, String elSexe, String losMocasines, int laPasta, int laEdat){
		Nom = elNom;
		Sexe = elSexe;
		Mocasines = losMocasines;
		Pasta = laPasta;
		Edat = laEdat;
	}
	
	public String getNom(){
		
		return Nom;
	}
	
	public String getSexe(){
		
		return Sexe;
	}
	
	public String getMocasines(){
		
		return Mocasines;
	}
	
	public int getPasta(){
		
		return Pasta;
	}
	
	public int getEdat(){
		
		return Edat;
	}

	@Override
	public String toString() {
		return "Client [Nom=" + Nom + ", Sexe=" + Sexe + ", Mocasines=" + Mocasines + ", Pasta=" + Pasta + ", Edat="
				+ Edat + "]";
	}
	
	
}
