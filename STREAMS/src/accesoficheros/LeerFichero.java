package accesoficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public void leerConBuffer() {
		try {
			FileReader fr = new FileReader("C:/Users/silvi/ejemplo.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linea = "";
			
			while(linea!=null) {
				linea = br.readLine();
				if(linea!=null)
					System.out.println(linea);
				
			}
			
			br.close();
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void leer() {
		try {
			FileReader fr = new FileReader("C:/Users/silvi/ejemplo.txt");
			int letra = 0;
			
			while(letra!=-1) {
				//hola mundo
				letra = fr.read();
				char letrafinal = (char)letra;
				if (letra!=-1)
					System.out.print(letrafinal);
			}	
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
