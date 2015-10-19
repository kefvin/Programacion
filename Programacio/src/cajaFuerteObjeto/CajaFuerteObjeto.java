package cajaFuerteObjeto;

public class CajaFuerteObjeto {
	
	private int saldo;
	/*
	 * Retorna saldo de la caixa
	 */
	
	public int getSaldo(){
		return saldo;
	}
	
	/*
	 * Treure una cuantitat de diners 
	 * @param quants diners que es volen treure
	 * @return diners que s'an tret (pot ser menys dels que volia)
	 */
	public int retirarDiners(int quants){
		int quantitatARetornar=quants;
		
		if(quants>saldo){
			quantitatARetornar=saldo;
			saldo=0;
		}else{
		saldo-=quants;
		}
		return quantitatARetornar;
	}
	
	public void posarDiners(int quants){
		saldo+=quants;
	}
	
}
