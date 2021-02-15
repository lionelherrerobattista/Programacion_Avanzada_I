package Program;

import java.util.List;

public class TomarPalabra implements Runnable {

	List<String> palabras;
	
	public List<String> getPalabras() {
		return palabras;
	}

	public void setPalabras(List<String> palabras) {
		this.palabras = palabras;
	}

	
	@Override
	public void run() {
		//System.out.println(this.tomarPalabra()+ " " + Thread.currentThread().getName());	
	}
	
	public String tomarPalabra() {
		//Método sincronizado para que todos puedan acceder al recurso
		//por turnos. Evito excepción 
		String palabra = "";
		
		synchronized (this.palabras) {
			if(this.palabras.size() > 0) {
				palabra = this.palabras.remove(this.palabras.size()-1);	
				
			} else {
				try {
					System.out.println("Esperando palabras");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return palabra;	
		}
	}
	

}
