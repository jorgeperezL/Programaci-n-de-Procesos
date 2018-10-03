package imprimeMayusculas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class padreMayus {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String linea;
		Runtime r = Runtime.getRuntime();
		Process p1 = null;

		try {
			p1 = r.exec("java -jar hijoMayus.jar");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()));
		PrintStream ps = new PrintStream(p1.getOutputStream());

		System.out.println("Padre : ");
		linea = sc.nextLine();

		while (!linea.equalsIgnoreCase("fin")) {
			ps.println(linea);
			ps.flush();

			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Padre : ");
			linea = sc.nextLine();

		}
	}
}