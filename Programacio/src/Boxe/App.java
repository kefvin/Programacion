package Boxe;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxejador un = new Boxejador("Pere");
		Boxejador dos = new Boxejador("Joan");
		Combat combat = new Combat(un,dos);
		
		System.out.println(combat.combat());
		
	}

}
