import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0,mes=0,año=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime el dia en el que estamos");
		dia=leer.nextInt();
		System.out.println("Dime el mes en el que estamos");
		mes=leer.nextInt();
		System.out.println("Dime el año en el que estamos");
		año=leer.nextInt();
		switch (mes) {
		case 1: 
			System.out.println(dia+"de Enero de"+año);
			
			break;

		case 2:
			System.out.println(dia+" de Febrero de"+año);
			break;
		
		case 3:
			System.out.println(dia+" de Marzo de"+año);
			break;
		
		case 4:
			System.out.println(dia+" de Abril de"+año);
			break;
			
		case 5:
			System.out.println(dia+" de Mayo de"+año);
			break;
			
		case 6:
			System.out.println(dia+" de Junio de"+año);
			break;
			
		case 7:
			System.out.println(dia+" de Julio de"+año);
			break;
			
		case 8:
			System.out.println(dia+" de Agosto de"+año);
			break;
			
		case 9:
			System.out.println(dia+" de Septiembre de"+año);
			break;
			
		case 10:
			System.out.println(dia+" de Octubre de"+año);
			break;
			
		case 11:
			System.out.println(dia+" de Nobiembre de"+año);
			break;
			
		case 12:
			System.out.println(dia+" de Diciembre de"+año);
			break;
		}

	}

}
