package elJocDelsBanquers;

public class Banquer {

	String nom="";
	int bosses;
	String tirat="";
	

	public Banquer(String elNom, int elsDiners){
		nom = elNom;
		bosses = elsDiners;
	}
	
	
	public String getNom(){
		return nom;
	}
	
	public void setBosses(int quantitatBosses){
		bosses = bosses + quantitatBosses;
	}

	public int getBosses(){
		return bosses;
	}
	
	public String tira(String tirada){
		tirat=tirada;
		
		return tirat;
	}
	
	public String queHasTret(){
		
		return tirat;
	}
	
	@Override
	public String toString() {
		return "Banquers [nom=" + nom + ", diners=" + bosses + "]";
	}
}