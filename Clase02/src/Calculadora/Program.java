package Calculadora;

public class Program {

	public static void main(String[] args) {
		
		
		
		//Ejercicio 3
//		System.out.println(ManejoString.cantidadCaracteres(cadena));
//		System.out.println(ManejoString.primeraMitad(cadena));
//		System.out.println(ManejoString.ultimoCaracter(cadena));
//		System.out.println(ManejoString.formaInversa(cadena));
//		System.out.println(ManejoString.caracterSeparado(cadena));
//		System.out.println(ManejoString.poseeHola(cadena));
//		
		
		//Ejercicio 5
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.sumar(1, 1));
		System.out.println(calculadora.restar(1, 1));
		System.out.println(calculadora.multiplicar(2, 2));
		
		try {
			System.out.println(calculadora.dividir(4, 0));	
		} catch (DivisionPorCeroException e) {
			System.out.println(e.getMessage());	
		} 
		
	
	}

}
