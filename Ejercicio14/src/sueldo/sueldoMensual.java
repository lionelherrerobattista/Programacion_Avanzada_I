package sueldo;

public class sueldoMensual implements ICalculoSueldo {

	//TODO Aplicar patrón singleton
	private static sueldoMensual sueldoMensual;
	
	private sueldoMensual() {
		
	}
	
	public static sueldoMensual getInstance() {
		if(sueldoMensual == null) {
			sueldoMensual = new sueldoMensual();
		}
		
		return sueldoMensual;
	}
	
	@Override
	public double calcular(Empleado e) {
		
		return e.getSueldo();
	}
	
}
