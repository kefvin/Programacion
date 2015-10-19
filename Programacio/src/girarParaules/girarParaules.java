package girarParaules;

import java.util.Scanner;

public class girarParaules {
	public static void main (String[]args){
		System.out.println("Entra una frase");
		Scanner lector = new Scanner(System.in);
		String palabras=lector.nextLine();
		String[] rebes = palabras.split(" ");
		for(int i=rebes.length-1;i>=0;i--){
			System.out.print(rebes[i]+" ");
		}
		
	}
}