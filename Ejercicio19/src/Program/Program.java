package Program;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejecucion hilo = new Ejecucion();
		hilo.start();
		
		hilo.frenar();
		
		hilo.reanudar();
		
		hilo.detener();	
	}

}
