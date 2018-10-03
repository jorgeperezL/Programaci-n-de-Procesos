package Casos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class ejercicioCaso1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String linea;
		Runtime r = Runtime.getRuntime();
		Process p1 = null;
		try {
			p1 = r.exec("java -jar ejercicioCaso1.jar");
			BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()));
			OutputStream os = p1.getOutputStream();
			
			System.out.println("Introduce cadena de texto : ");
			linea = sc.nextLine();
			linea = linea + "\n";
			
			os.write(linea.getBytes());
			os.flush();
			
			String linea2;
			while ((linea2 = br.readLine())!=null) {
				System.out.println(linea2);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
