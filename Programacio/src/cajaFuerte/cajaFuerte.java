package cajaFuerte;

import java.util.Scanner;

public class cajaFuerte {

	public static void main(String[] args) {
		cajaFuerte caja = new cajaFuerte();
		Scanner lector = new Scanner(System.in);
		
		double[] array={300,0,0};
		boolean fin=false;
		
		while(fin!=true){
			System.out.println("El valor del saldo actual es: "+array[0]);
			System.out.println("Elije la operación que quieras hacer y apreta el numero "
					+ "correspondiente");
			System.out.println("");
			System.out.println("1. Ingresar dinero.");
			System.out.println("2. Retirar dinero.");
			System.out.println("3. Salir");
			
			
			if(lector.hasNextInt()){
				array[1]=lector.nextInt();
			
				if(array[1]==1){
					caja.ingresar(array);
					
				}else if(array[1]==2){
					caja.retirar(array);
					
				}else if(array[1]==3){
					System.out.println("Fin de los movimientos.");
					fin=true;
				}else{
					System.out.println("Introduce un numero válido.");
				}
					
			}else{
				System.out.println("Introduce un numero válido.");
			}
			System.out.println("");
			lector.next();
		}
	}
	
	public void ingresar(double[]array){
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad que quieres ingresar: ");
		if(lector.hasNextInt()){
			array[2]=lector.nextInt();
			
			if(array[2]>0){
				array[0]+=array[2];
				
			}else{
				System.out.println("Introduce un numero mas grande que 0.");
			}
		}
	}
	
	public void retirar(double[]array){
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad que quieres retirar: ");
		if(lector.hasNextInt()){
			array[2]=lector.nextInt();
			
			if(array[2]>0 && array[2]<array[0]){
				array[0]-=array[2];
				
			}else{
				System.out.println("Introduce un numero mas grande que 0 y/o un numero"
						+ " mas grande que el saldo actual.");
			}
		}
	}
	
}