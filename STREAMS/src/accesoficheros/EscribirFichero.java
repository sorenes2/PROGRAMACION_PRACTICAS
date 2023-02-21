package accesoficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public void escribirConBuffer() {
		
		try {
			FileWriter fw = new FileWriter("C:/Users/silvi/ejemplo3.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Primera linea con Buffer");
			bw.newLine();
			bw.write("Segunda linea con buffer");
			bw.newLine();
			
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
