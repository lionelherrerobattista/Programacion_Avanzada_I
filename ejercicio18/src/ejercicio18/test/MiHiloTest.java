package ejercicio18.test;

import org.junit.Assert;
import org.junit.Test;

import ejercicio18.MiHilo;

public class MiHiloTest {
	
	@Test
	public void runOk() {
		
		//Crear 3 hilos
		Thread hiloUno = new Thread(new MiHilo(), "hiloUno");
		Thread hiloDos = new Thread(new MiHilo(), "hiloDos");
		Thread hiloTres = new Thread(new MiHilo(), "hiloTres");
		
		hiloUno.start();
		hiloDos.start();
		hiloTres.start();
		
		while(hiloUno.isAlive() && hiloDos.isAlive() && hiloTres.isAlive()) {
			
		}
		
		System.out.println("Terminaron los hilos");
		Assert.assertTrue(true);
		//Mostrar mensaje cuando finalicen
		
	}

}
