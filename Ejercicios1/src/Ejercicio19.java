import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0,mes=0,a�o=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime el dia en el que estamos");
		dia=leer.nextInt();
		System.out.println("Dime el mes en el que estamos");
		mes=leer.nextInt();
		System.out.println("Dime el a�o en el que estamos");
		a�o=leer.nextInt();
		switch (mes) {
		case 1: 
			System.out.println(dia+"de Enero de"+a�o);
			
			break;

		case 2:
			System.out.println(dia+" de Febrero de"+a�o);
			break;
		
		case 3:
			System.out.println(dia+" de Marzo de"+a�o);
			break;
		
		case 4:
			System.out.println(dia+" de Abril de"+a�o);
			break;
			
		case 5:
			System.out.println(dia+" de Mayo de"+a�o);
			break;
			
		case 6:
			System.out.println(dia+" de Junio de"+a�o);
			break;
			
		case 7:
			System.out.println(dia+" de Julio de"+a�o);
			break;
			
		case 8:
			System.out.println(dia+" de Agosto de"+a�o);
			break;
			
		case 9:
			System.out.println(dia+" de Septiembre de"+a�o);
			break;
			
		case 10:
			System.out.println(dia+" de Octubre de"+a�o);
			break;
			
		case 11:
			System.out.println(dia+" de Nobiembre de"+a�o);
			break;
			
		case 12:
			System.out.println(dia+" de Diciembre de"+a�o);
			break;
		}

	}

}
