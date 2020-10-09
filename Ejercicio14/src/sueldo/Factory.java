package sueldo;

public class Factory {
	
	public static ICalculoSueldo obtenerCobro(tipoCobro tipo) {
		
		//Compruebo el string
		if(tipo.equals(tipoCobro.mensual)) {
			return sueldoMensual.getInstance();
		} else if(tipo.equals(tipoCobro.porHora)) {
			return sueldoPorHora.getInstance();
		} else {
			return null;
		}
		
	}

}
