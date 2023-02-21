package accesoficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {

	public void escribirConBuffer() {
		Scanner sc = new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter("C:/Users/silvi/ejemplo3.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String linea="";
			while(!linea.equalsIgnoreCase("fin")) {
				System.out.println("Introduce un texto");
				linea = sc.nextLine();
				bw.write(linea);
				bw.newLine();
			}
			
		
			bw.close();
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public void escribir() {
		String frase = "Probando escritura en fichero";
		
		try {
			FileWriter fw = new FileWriter("C:/Users/silvi/ejemplo.txt", true);
			
			for(int i=0;i<frase.length();i++) {
				fw.write(frase.charAt(i));
			}
			
			fw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
