package Program;

public class Ejecucion extends Thread {

	private boolean estaVivo = true;
	private boolean frenar = false;
	
	@Override
	public void run() {
		int i=0;
		
		synchronized(this) {
			
			
			while(!this.isInterrupted()) {
				i++;
				System.out.println(i);
				if(frenar) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}	
		}
	}
	
	public void detener() {
		try {
			Thread.sleep(3000);
			this.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized void frenar() {
		
		this.frenar = true;
	}
	
	public synchronized void reanudar() {
		try {
			Thread.sleep(5000);
			this.frenar = false;
			this.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
