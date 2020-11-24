package Program;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//Crear la clase que implementa la interfaz Runnable
		TomarPalabra tomarPalabra = new TomarPalabra();
		AgregarPalabra agregarPalabra = new AgregarPalabra();
		//Cargar la lista
		List<String>palabras = new ArrayList<String>();
		palabras.add("perro");
		palabras.add("gato");
		palabras.add("oso");
		palabras.add("pájaro");
		
		tomarPalabra.setPalabras(palabras);
		agregarPalabra.setPalabras(palabras);
		
		//Crear los hilos, pasandole la misma instancia de la clase!!
		Thread hilo1 = new Thread(tomarPalabra, "tomarPalabra");
		Thread hilo2 = new Thread(agregarPalabra, "agregarPalabra");
		
		
		//Iniciar los hilos 
		hilo1.start();
		hilo2.start();
		
	}

}
