package program;

public class Calcular {

	public double dividir(Number n1, Number n2) {
		
		if(n2.doubleValue()==0) {
			throw new MiUnchecked("No puede ser 0");	//No hace falta agregar el throws
		}
		
		
		
		return n1.doubleValue()/n2.doubleValue();
	}
}
