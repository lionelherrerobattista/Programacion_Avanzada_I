package sueldo;

public class sueldoPorHora implements ICalculoSueldo{

	//TODO Aplicar patrón singleton
	private static sueldoPorHora sueldoPorHora;
	
	private sueldoPorHora() {
		
		
	}
	
	
	public static sueldoPorHora getInstance() {
		
		if(sueldoPorHora==null) {
			sueldoPorHora = new sueldoPorHora();
		}
		
		return sueldoPorHora;
		
	}
	
	@Override
	public double calcular(Empleado e) {
		// TODO Auto-generated method stub
		return e.getSueldo() * e.getCantidadHorasTrabajadas();
	}

}
