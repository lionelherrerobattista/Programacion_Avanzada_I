package ejercicio18;

public class MiHilo implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 2000; i++) {
			System.out.println("Iteración n°" + i + " Hilo: " + MiHilo.class.getSimpleName());
		}
		
	}

}
