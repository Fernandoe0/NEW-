import java.util.Scanner;

public class dolaresconversion{
	
	public static void main(String[] args) {
		/*Se indica el ingreso de datos por medio de la consola de teclado*/
		Scanner scan = new Scanner(System.in);
		/*Se solicita la cantidad de Quetzales*/
		System.out.println("ingrese la cantidad de Quetzales");
		int quetzal = scan.nextInt();
		/*Se realiza la conversión de dolares a quetzales*/
		Double dolares = quetzal / 7.75;
		/*se muestra el resultado de la cantidad de dólares a adquirir*/
		System.out.println("los dólares adquiridos por " + quetzal + " Quetzales son: " + dolares);
	}
}