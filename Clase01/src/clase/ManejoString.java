package clase;

/**
 * Permite sacar valores de un String
 * @author Lionel
 * @version 1.1
 */
public class ManejoString {
	
	/**
	 * 
	 * @param s
	 * @return
	 * @deprecated se reemplaza por el método cantidadCaracteres
	 */
	public static int cantidad(String s) {
		//TODO Falta validar que no sea null
		//FIXME falta optimizar este método 
		return s.length();
	}
	
	//Cantidad de caracteres de una string
	/**
	 * Contar los caracteres
	 * @param s palabra ingresada
	 * @return cantidad de caracteres de la palabra ingresada
	 * @exception NullpointerException si es null el parámetro s
	 */
	public static int cantidadCaracteres(String s) {
		return s.length();
	}
	
	//Primera mitad de una string 
	public static String primeraMitad(String s) {
		String retorno;
		int mitad;
		
		if(s.length() > 1) {
			mitad = s.length()/2;
			retorno = s.substring(0, mitad);
		} else {
			retorno = s;
		}
		
		return retorno;
	}
	
	public static char ultimoCaracter(String s) {
		char ultimoCaracter;
		int largo = s.length();
		
		ultimoCaracter = s.charAt(largo-1);
		
		return ultimoCaracter;
	}
	
	public static String formaInversa(String s) {
		String cadenaInversa = "";
		int largoCadena = s.length();
		
		for(int i = largoCadena-1; i >= 0; i--) {
			cadenaInversa += s.charAt(i);
		}
		
		return cadenaInversa;
	}
	
	public static String caracterSeparado(String s) {
		String nuevaCadena = "";
		int largoCadena = s.length();
		
		for(int i = 0; i < largoCadena; i++) {
			nuevaCadena += s.charAt(i);
			nuevaCadena += "-";
		}
		
		return nuevaCadena.substring(0, nuevaCadena.length()-1);
	}
	
	public static boolean poseeHola(String s) {
		return s.contains("hola");
	}
	
	
	

}
