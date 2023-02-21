package accesoficheros;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		LeerFichero lf = new LeerFichero();
		//lf.leer();
		lf.leerConBuffer();
		
		EscribirFichero ef = new EscribirFichero();
		//ef.escribir();
		ef.escribirConBuffer();
		
		//lf.leer();
		lf.leerConBuffer();
		
		
	}

}
