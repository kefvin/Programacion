package Boxe;

import java.util.Random;

public class Boxejador {

	Random rand = new Random();
	
	private String nom;
	private int vides;
	
	public Boxejador(String nomBoxejador){
		nom = nomBoxejador;
		vides = 5;
	}
	
	public Boxejador(String nomBoxejador, int vida){
		nom = nomBoxejador;
		vides = vida;
	}
	
	public int ClavaCop(){
		return rand.nextInt(4);		
	}
	
	public int noProtegeix(){
		return rand.nextInt(4);
	}
	
	public void repCop(){
		vides-=1;
	}
	
	public boolean estaKO(){
		return (vides==0);
	}
	
	public String getNom(){
		return nom;
	}
	
}
