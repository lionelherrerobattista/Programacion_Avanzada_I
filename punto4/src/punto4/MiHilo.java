package punto4;

public class MiHilo implements Runnable {

	ClasePrincipal c;
	
	public MiHilo(ClasePrincipal c ) {
		this.c = c;
	}
	
	@Override
	public void run() {
		synchronized (c.lista) {
			while(c.lista.size()> 0) {
				
				String proceso = c.procesar();
				c.mostrarInfo(Thread.currentThread().getName(), proceso);	
			

			}	
		}
	}
	
	

}
