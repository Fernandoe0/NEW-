import java.util.Scanner;
import java.util.Date;

public class dolaresconversion{
	
	public static void main(String[] args) {
		/*Se indica el ingreso de datos por medio de la consola de teclado*/
		Scanner scan = new Scanner(System.in);
		/*Se solicita la cantidad de Quetzales*/
		System.out.println("ingrese la cantidad de Quetzales");
		int quetzal = scan.nextInt();
		System.out.println("Ingrese el valor de cambio");
		Double dolar = scan.nextDouble();
		Date current = new Date();
		/*Se realiza la conversión de dolares a quetzales*/
		Double dolares = quetzal / dolar;
		/*se muestra el resultado de la cantidad de dólares a adquirir*/
		System.out.println("los dólares adquiridos por " + quetzal + " Quetzales son: " + dolares + " al tipo de cambio hoy " + current);
	}
}