import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaracion de variables
		int num1=0,num2=2;
		float real=0;
		String nombre="";
		boolean bandera=true;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
		nombre = leer.nextLine();
		System.out.println("Dime tu edad");
		num1 =leer.nextInt();
		
		
		System.out.println("tu nombre es " + nombre + " Y tienes " + num1 + " años");
		
		
	}
	

}
