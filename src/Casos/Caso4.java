package Casos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caso4 {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p1 = null;
		try {
			p1 = r.exec("java -jar Caso3.jar");
			BufferedReader br = new BufferedReader(new InputStreamReader(p1.getInputStream()));
			String linea;
			while ((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
