package ejercicio18;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread hilo = new Thread(new MiHilo());
		hilo.start();
	}

}
