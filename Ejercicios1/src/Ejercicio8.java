import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float precio;
		 String mes;
		 Scanner leer=new Scanner(System.in);
		 System.out.println("Dime el precio");
		 precio=leer.nextFloat();
		 System.out.println("Dime el mes que estamos");
		 mes=leer.next();
		 
		 if (mes=="octubre"|mes=="Octubte") {
			 System.out.println("El precio es "+(precio*0.15));
			
		}else {
			System.out.println("El precio es " + precio);
		}
		
		 
	}

}
