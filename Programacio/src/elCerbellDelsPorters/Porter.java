package elCerbellDelsPorters;

import java.util.ArrayList;
import java.util.List;

public class Porter {

	String sexe="";
	String sabates="";
	
	
	public void ordreSobreSexe(String quin) {
		sexe = quin;
	}
	
	
	public boolean DejaPasar(Client client){
		
		
		if(!client.getSexe().equals(sexe)){
			
			return false;
				
		}
		
		return true;
	}
	
	
}
