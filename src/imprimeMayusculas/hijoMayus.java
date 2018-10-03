package imprimeMayusculas;
import java.util.Scanner;

public class hijoMayus {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String texto = null;
		texto = sc.nextLine();
		while (texto != null){
			System.out.println("Hijo : " + texto.toUpperCase());
			texto= sc. nextLine();
		}
	}
}
