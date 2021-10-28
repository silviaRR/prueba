import java.util.Scanner;

public class SistemaControlVacacional{
	public static void main(String args[]){
	 Scanner lectura = new Scanner(System.in);
	 String nombre="";
	 int clave=0,antiguedad=0;

	 System.out.println("************************");
	 System.out.println("Sistema Vacacional de COCA-COLA");
	 System.out.println("************************");
	 System.out.println("Ingrese su nombre del trabajador: ");
	 nombre=lectura.nextLine();
	 System.out.println("");
	 System.out.println("Ingrese la antiguedad del trabajador: ");
	 antiguedad=lectura.nextInt();
	 System.out.println("");
	 System.out.println("Ingrese clave del depártamento del trabajador: ");
	 clave=lectura.nextInt();
	 System.out.println("");
	 if(clave==1){
	 	if(antiguedad>=1){
	 		if(antiguedad>=2 && antiguedad<=6){
	 			System.out.println("El trabajador tiene derecho a 14 dias ");
	 		}else if(antiguedad>=7){
	 			System.out.println("El trabajador tiene derecho a 20 dias ");
	 		}else{
	 			System.out.println("El trabajador tiene derecho a 6 dias ");
	 		}

	 	}else{
	 		System.out.println("Aun no cuenta con vaciones");
	 	}

	 }else if(clave==2){
	 	if(antiguedad>=1){
	 		if(antiguedad>=2 && antiguedad<=6){
	 			System.out.println("El trabajador tiene derecho a 15 dias ");
	 		}else if(antiguedad>=7){
	 			System.out.println("El trabajador tiene derecho a 22 dias ");
	 		}else{
	 			System.out.println("El trabajador tiene derecho a 7 dias ");
	 		}

	 	}else{
	 		System.out.println("Aun no cuenta con vaciones");
	 	}
	 }else if(clave==3){
	 	if(antiguedad>=1){
	 		if(antiguedad>=2 && antiguedad<=6){
	 			System.out.println("El trabajador tiene derecho a 20 dias ");
	 		}else if(antiguedad>=7){
	 			System.out.println("El trabajador tiene derecho a 30 dias ");
	 		}else{
	 			System.out.println("El trabajador tiene derecho a 10 dias ");
	 		}

	 	}else{
	 		System.out.println("Aun no cuenta con vaciones");
	 	}

	 }else {
	 	System.out.println("La clave no existe: ");
	 }
	}
}