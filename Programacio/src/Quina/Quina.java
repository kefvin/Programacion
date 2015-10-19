package Quina;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Quina {

	private static final int FILES = 3;
	private static final int COLUMNES = 9;

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] uno=new int[27];
		int[] control=new int[COLUMNES];
		int durex =0;
		int ale=0;
		
		//Comprobar los numeros que salen y entrarlos al array.
		while(durex<15){
			boolean esta = true;
			ale = rand.nextInt(90);
			for(int i=0;i<uno.length;i++){
				if(ale==uno[i]){
					esta= false;
				}
			}
			if(esta==true){
				if(ale>0 && ale<10 && control[0]<3){
					control[0]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>11 && ale<20 && control[1]<3){
					control[1]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>21 && ale<30 && control[2]<3){
					control[2]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>31 && ale<40 && control[3]<3){
					control[3]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>41 && ale<50 && control[4]<3){
					control[4]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>51 && ale<60 && control[5]<3){
					control[5]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>61 && ale<70 && control[6]<3){
					control[6]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>71 && ale<80 && control[7]<3){
					control[7]++;
					uno[durex]=ale;
					durex++;
				}else if(ale>81 && ale<90 && control[8]<3){
					control[8]++;
					uno[durex]=ale;
					durex++;
				}
			}
			
		}
		imprimir(uno);
	}

	private static void imprimir(int[] uno) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		Arrays.sort(uno);
		
		int mostra[][]= new int[COLUMNES][FILES];
		
		//int posicioUno = 12;
		
		for(int i=12;i<uno.length;i++){
			int posicio = rand.nextInt(3);
			int candidat = uno[i];
			int desenes = candidat / 10;
			
			if(mostra[desenes][posicio]!=0){
				posicio+=1;
			
				if(mostra[desenes][posicio]!=0){
					posicio+=1;
				
				}else{
					mostra[desenes][posicio]=uno[i];
					i++;
				}
			}else{
				mostra[desenes][posicio]=candidat;
				i++;
			}
		}
			
		for(int i=0;i<uno.length;i++){
			System.out.print(uno[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<FILES;i++){
			for(int j=0;j<COLUMNES;j++) {
				System.out.print(mostra[j][i]+", ");
			}
			System.out.println();
		}
		
	}
	
}
