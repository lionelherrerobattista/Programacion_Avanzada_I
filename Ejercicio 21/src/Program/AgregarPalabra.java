package Program;

import java.util.List;

public class AgregarPalabra implements Runnable {

	List<String> palabras;
	int contador= 0;
	
	public List<String> getPalabras() {
		return palabras;
	}


	public void setPalabras(List<String> palabras) {
		this.palabras = palabras;
	}

	@Override
	public void run() {
		
		
			while(true) {
				//Parte crítica uso lista compartida
				synchronized (this.palabras) {
					contador++;
					this.palabras.add("palabra" + contador);
					System.out.println(Thread.currentThread().getName() + " agregó palabra" );
					this.palabras.notify();	
				}
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	

}
