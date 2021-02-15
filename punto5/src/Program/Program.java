package Program;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		TomarPalabra t = new TomarPalabra();
		
		
			
				
		try {			
			synchronized (t) {
				System.out.println("bloqueado");
				t.wait();
				t.notify();
				System.out.println("desbloqueado");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
		
		
		
		//Crear la clase que implementa la interfaz Runnable
		/*TomarPalabra tomarPalabra = new TomarPalabra();
	
		//Cargar la lista
		List<String>palabras = new ArrayList<String>();
		palabras.add("perro");
		palabras.add("gato");
		palabras.add("oso");
		palabras.add("pájaro");
		
		tomarPalabra.setPalabras(palabras);
		
		//Crear los hilos, pasandole la misma instancia de la clase!!
		Thread hilo1 = new Thread(tomarPalabra, "hilo 1");
		Thread hilo2 = new Thread(tomarPalabra, "hilo 2");
		Thread hilo3 = new Thread(tomarPalabra, "hilo 3");
		
		//Iniciar los hilos 
		hilo1.start();
		hilo2.start();
		hilo3.start();*/
		
	}

}
